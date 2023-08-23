package com.example.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.onetoone.dao.Studentrepository;
import com.example.onetoone.dao.categoryrepo;
import com.example.onetoone.dao.productrepo;
import com.example.onetoone.entities.Laptop;
import com.example.onetoone.entities.Student;
import com.example.onetoone.entities.address;
import com.example.onetoone.entities.category;
import com.example.onetoone.entities.product;

@SpringBootApplication
public class OnetooneApplication implements CommandLineRunner {
	
	
	@Autowired
	private  Studentrepository studentrepository;
	
	@Autowired
	private categoryrepo categoryrepo;
	
	@Autowired
	private productrepo productrepo;
	
	private Logger logger=LoggerFactory.getLogger(OnetooneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
		
		
	      
	}

	@Override
	public void run(String... args) throws Exception {
		/* Student student= new Student();
		student.setStudentid(14);
		student.setStudentnameString("vinit");
		student.setAboutString("Baap of all Chuslims");
		Laptop laptop= new Laptop();
		laptop.setBrandnoString("apple");
		laptop.setModelString("macbook air");
		laptop.setLaptop_id(34);
		laptop.setStudent(student);
		student.setLaptop(laptop);
		
	 Student saveStudent=   studentrepository.save(student);
	 logger.info("saved student is {}", student.getStudentnameString()); 
		
		
	Student student=	studentrepository.findById(14).get();
	Laptop laptop=  student.getLaptop();
	logger.info("laptop  details are {},{}", laptop.getModelString(),laptop.getBrandnoString() ); 
	
		Student student= new Student();
		student.setStudentid(15);
		student.setStudentnameString("raj");
		student.setAboutString("i am dev");
		Laptop laptop= new Laptop();
		laptop.setBrandnoString("windows");
		laptop.setModelString("acer");
		laptop.setLaptop_id(366);
		
		
		
		 address address1= new address();
		 address1.setAddress_id(12);
		address1.setCityString("muzaffarpur");
		address1.setCountryString("india");
		address1.setStreetString("hanuman nagar");
		address1.setStudent(student);
		
		 address address2= new address();
		 address2.setAddress_id(1445);
		address2.setCityString("delhi");
		address2.setCountryString("india");
		address2.setStreetString("hanuman1  nagar");
		address2.setStudent(student);
		
		
		List<address> addresses= new ArrayList<>();
		addresses.add(address1);
		addresses.add(address2);
		student.setAddress(addresses);
		
	
		laptop.setStudent(student);//imp
		student.setLaptop(laptop);//not so imp
		
		
	Student student2=	this.studentrepository.save(student);
   logger.info("student created with addresses {}",addresses);
		
		
			
	
		
		
	product p1=	new product();
	p1.setPidString("p1");
	p1.setPnameString("iphone");
	
	
	product p2=	new product();
	p2.setPidString("p2");
	p2.setPnameString("iphone14");
		
	
	product p3=	new product();
	p3.setPidString("p3");
	p3.setPnameString("iphone15");
	
	
	category category1= new category();
	category1.setCidString("c1");
	category1.setTitleString("category 1");
	
	
	category category2= new category();
	category2.setCidString("c2");
	category2.setTitleString("category 2");
	
	
List<product> category1products=	category1.getProducts();
category1products.add(p1);//imp
category1products.add(p2);//imp
category1products.add(p3);//imp





List<product> category2products=	category2.getProducts();
category2products.add(p1);//imp
category2products.add(p2);//imp
categoryrepo.save(category1);
categoryrepo.save(category2);   */
		
	category category=	categoryrepo.findById("c1").get();
  System.out.println(category.getProducts().size());
  
product product=  productrepo.findById("p3").get();
System.out.println(product.getCategories().size());

	
	
		
		
	}

}
