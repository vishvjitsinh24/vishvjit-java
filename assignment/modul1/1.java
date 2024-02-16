package com.assignment_1;

import java.util.Scanner;

public class A 
{	public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number 1 :");
	int a =sc.nextInt();
	System.out.println("Enter the number 2 :");
	int b =sc.nextInt();	
	System.out.println("Enter the number 3 :");
	int c =sc.nextInt();
	if (a>b&&a>c)
		{
			System.out.println("number 1 is max...");
		}
	else if(b>a && b>c)
		{
			System.out.println("number 2 is max...");
		}
	else 
		{	
			System.out.println("number 3 is max...");
		}
	
	
}
	
}
