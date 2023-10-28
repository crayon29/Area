package mypkg;

import java.util.Scanner;

public class MyClass {
	
	public int AreaRect(int l, int b)
	{
		return (l*b);
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
