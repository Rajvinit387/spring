package com.example.debug;

public class test {
	
	public static void main(String[] args) {
		System.out.println("debugging");
		int a[]= {2,4,5,7};
		
	int s=	getsum(a);
	System.out.println(s);
	}
	
	
	
	public static int getsum(int a[])
	{
		int s=0;
		for (int i=0;i<a.length;i++)
			s+=a[i];
		s=s+5;
		return s;
	}

}
