package com.example.demo1;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo1.controlller.ram;
import com.example.demo1.dao.UserRepository;
import com.example.demo1.entities.User;

@SpringBootApplication
public class Demo1Application {
	@Autowired
	private Student student;
	@Autowired
	private Date1 date;
	@Autowired
	private emp emp;
	@Autowired
	private ram ram;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		System.out.println("starting....");

//		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user= new User(); user.setCity("Delhi"); user.setName("Vinit"); User
		 * user1= userRepository.save(user); System.out.println(user1);
		 */

		
		/*
		 * User user1 = new User(); user1.setCity("Mumbai"); user1.setName("Akash");
		 * 
		 * 
		 * User user2 = new User(); user2.setCity("Patna"); user2.setName("Akshay");
		 * List <User> userall = List.of(user1,user2); Iterable<User> result=
		 * userRepository.saveAll(userall); result.forEach(user->{
		 * System.out.println(user); });
		 */
		
		
		/*
		 * User user3 = new User(); user3.setCity("Delhi"); user3.setName("Kunal");
		 * 
		 * User user4 = new User(); user4.setCity("Muz"); user4.setName("Gyanenedu");
		 * List <User> userall = List.of(user3,user4); Iterable<User> result=
		 * userRepository.saveAll(userall);
		 */
		/*
		 * 
		 Optional<User> optional=userRepository.findById(252); User user=
		 * optional.get(); System.out.println(user); user.setName("Vinit"); User user1=
		 * userRepository.save(user); System.out.println(user1);
		 */

		/*
		 * Iterable<User> itr = userRepository.findAll();
		 * 
		 * Iterator result= itr.iterator(); while(result.hasNext()) { User user=
		 * (User)result.next(); System.out.println(user); }
		 * 
		 * 
		 * itr.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { // TODO Auto-generated method stub
		 * System.out.println(t);
		 * 
		 * } });
		 */
		
//		List<String> names=new ArrayList<>();
//		names.add("Kunal");
//		names.add("Akash");
//		

//		List<String> users=  userRepository.getest("KuNAL");
//		users.forEach(user1->
//			  System.out.println(user1));
//		int id =233;
//		 Optional<User> optional=userRepository.findById(id);
//		 User user=
//				 optional.get(); System.out.println(user); user.setName("Vinit"); User user1=
//				 userRepository.save(user);
		
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user1->  System.out.println(user1));
		
	}
}
