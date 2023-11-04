package mypkg;

import java.util.Scanner;

public class MyClass {
	
	public int AreaRect(int l, int b)
	{
		System.out.println("Inside areRect func");
		return (l*b);
	}
	
	public double AreaTri(int r)
	{
		int d;
		return (3.14*r*r);
	}
	public int sum(int a, int b)
	{
		int f;
		int g;
		int k;
		f=50+60;
		return 20;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass abc=new MyClass();
		Scanner scn=new Scanner(System.in);
		int l,b;
		System.out.println("enter length:");
		l=scn.nextInt();
		System.out.println("Enter breadth:");
		b=scn.nextInt();
		System.out.println("Area is: "+abc.AreaRect(l, b));
		
		
	}

}
