package com.assignment_1;

import java.util.Scanner;

public class b
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character :");
		String ch = sc.next();
		if(ch.length()>1)
		{
			System.out.println("invalid input!!!");
		}
		else if(ch.equals("A")||ch.equals("E")||ch.equals("I")||ch.equals("O")||ch.equals("U")||ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u"))
		{
			System.out.println("it is an vowel");
		}
		else
		{
			System.out.println("it is consonant");
		}
	}
	
}
