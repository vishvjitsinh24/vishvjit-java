package com.assignment_1;

import java.util.Scanner;

public class e 
{
	public static void main(String[] args) 
	{	int sum=0 ,avg; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter no..."+i);
			int no=sc.nextInt();
			sum=sum+no;
			
		}

		avg=sum/5;
		System.out.println("sum is..."+sum);
		System.out.println("avg is..."+avg);
	}
}

