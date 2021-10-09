package com.hsbc.example;

import java.util.Scanner;

public class First {
	
	public static char checkAlphabet(char c) {
		
		if((c>='a'&& c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println(c+" is an alphabet");
		}
		else
		{
			System.out.println(c+" is not an alphabet");
		}
		return c;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		checkAlphabet(ch);
	}
	

}
