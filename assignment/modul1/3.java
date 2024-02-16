package com.assignment_1;

import java.util.Scanner;

public class c 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int a = sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not leap year...");
		}
	}
}
