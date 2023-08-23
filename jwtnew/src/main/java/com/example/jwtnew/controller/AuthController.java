package com.example.jwtnew.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwtnew.model.JwtRequest;
import com.example.jwtnew.model.JwtResponse;
import com.example.jwtnew.model.User;
import com.example.jwtnew.security.jwthelper;
import com.example.jwtnew.service.userservice;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	
	
	@Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;


    @Autowired
    private jwthelper helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);
    
    
    @Autowired
    private userservice userservice;


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmailString(), request.getPassString());


        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmailString());
        String token = this.helper.generateToken(userDetails);

        JwtResponse response = new JwtResponse();
        
        response.setJwttokenString(token);
                response.setUsernameString(userDetails.getUsername());
              
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    
    

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);


        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }
    
    
    @PostMapping("/create-user")
    public UserDetails createuser(@RequestBody User user)
    {
		return userservice.createUser(user);
    	
    }

}
