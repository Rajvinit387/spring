package com.example.demo1.controlller;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entities.book;
import com.example.demo1.services.bookservice;

@RestController
public class BookController {
	
	@Autowired
	private bookservice bbBookservice;

	
//	@RequestMapping(value="/books", method = RequestMethod.GET)
	
	
	@GetMapping("/books")
	public ResponseEntity<List<book>>  getBooks()
	{
		
	
		
	List<book>	books =  this.bbBookservice.getallbooks();
	if(books.size()<=0)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	return ResponseEntity.of(Optional.of(books));
	
	}
	
    @GetMapping("/books/{id}")
    public ResponseEntity<book> getBook(@PathVariable("id")   int id)
    {
    	
    
    	book book=  this.bbBookservice.getsinglebook(id);
    	if(book==null)
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	else {
			return ResponseEntity.of(Optional.of(book));
		}
    	
    }
    
    
    @PostMapping("/books")
    public ResponseEntity<book> addbook(@RequestBody  book book) {
    	book b=null;
    	
    	
    	  b= this.bbBookservice.addbook(book) ;
    	  if(b==null)
    	  {
    		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	  }
    	  else
    	return ResponseEntity.of(Optional.of(b));
    	
		
	}
    
    @DeleteMapping("/books/{id}")
    public ResponseEntity<book> deletebookbyBookid(@PathVariable("id") int id) 
    {
    	
    	
    	
      book cBook=  this.bbBookservice.deletebookbyid(id);
      if(cBook==null)
    	  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      else
     return ResponseEntity.of(Optional.of(cBook));
    	
    }
    
    @DeleteMapping("/books")
    @ResponseBody
    public ResponseEntity<String> deleteALL()
    
    {
    	 List<book> b2= this.bbBookservice.deleteAll();
    	 if(b2.size()<=0)
    	  return ResponseEntity.of(Optional.of("values already deleted"));
    	 else {
    		 return ResponseEntity.of(Optional.of("all are deleted"));
		}
    	
    }
    
    @PutMapping("/books/{id}")
    public ResponseEntity<String> updatebook(@RequestBody book book, @PathVariable("id") int id)
    {
    	
    	
    	book book2=  this.bbBookservice.updatebyid(book, id);
    	if(book2==null)
    	{
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    	else
    	return ResponseEntity.of(Optional.of("UPDATED SUCCCESSFULLY"));
    	
    }
    
    
    
}
