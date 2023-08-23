package com.example.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class mysecurityconfig  {
	
	
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails normalUserDetails= User.withUsername("vinit").password(passwordEncoder().encode("raj")).roles("NORMAL").build();
		UserDetails admiUserDetails= User.withUsername("aditi").password(passwordEncoder().encode("surabhi")).roles("ADMIN").build();
		InMemoryUserDetailsManager inMemoryUserDetailsManager= new InMemoryUserDetailsManager(normalUserDetails,admiUserDetails);
		return inMemoryUserDetailsManager;
		
		
	}
	
	

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.csrf().disable().cors().disable().   authorizeHttpRequests().requestMatchers("/token").permitAll()
		
		.anyRequest().authenticated()
		.
		and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		return http.build();


	}
	
	
	
	
	

}
