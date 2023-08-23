package com.example.demo1.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dao.bookRepository;

import com.example.demo1.entities.book;



@Service
public class bookservice {
	@Autowired
	private bookRepository Bookrepository;
	
//	private static List<book> books = new ArrayList<>();
//	
//
//	
//	static {
//   books.add(new book(12,"xyz","hshhshs"));
//   books.add(new book(14,"xydsfz","ahahhah"));
//   books.add(new book(21,"uuu","dbdsusduhdbs"));
//	}
	
	public List<book> getallbooks()
	{
	List<book> books=	(List<book>) this.Bookrepository.findAll();
	return books;
	}
	public  book getsinglebook(int id)
	{
		book b = new book();
		b = null;
		try {
		// b = books.stream().filter(e->e.getId()==id).findFirst().get();}
			Optional<book> optional= this.Bookrepository.findById(id);
			b=optional.get();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		 return b;
	}
	
	public book addbook(book book) {
	book book1=	this.Bookrepository.save(book);
		return book1;
		
	}
	public book deletebookbyid(int id) {
		
		
	
		book book =new book();
		book = null;
		try {
			Optional<book> optional= this.Bookrepository.findById(id);
			book=optional.get();
		 this.Bookrepository.deleteById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	return book;
	
	}
	
	
	public List<book> deleteAll() {
		List<book> books1=(List <book>)this.Bookrepository.findAll();
		this.Bookrepository.deleteAll();
		return books1;
		
		
	}


	
		
	
	public book updatebyid(book book, int id) {
		// TODO Auto-generated method stub
		
		
		
		book book2=new book();
			 try {
				 Optional<book> optional=this.Bookrepository.findById(id);
				 book2=optional.get();
				 book2.setAuthor(book.getAuthor());
				 book2.setName(book.getName());
				 book book1= this.Bookrepository.save(book2);
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return book2;
				
				
			}
	}
	
		
	

