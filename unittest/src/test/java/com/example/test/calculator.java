package com.example.test;

import org.hamcrest.collection.IsIterableContainingInRelativeOrder;

public class calculator {
	
	
	public int dosum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public int domul(int a, int b)
	{
		return a*b;
	}
	
	
	public Boolean compare(int a, int b)
	{
		return a==b;
	}

}
