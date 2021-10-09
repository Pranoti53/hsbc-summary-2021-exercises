package com.hsbc.example;

public class EvenOdd {
	
	public static void printEven()
	{
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Numbers: "+i);
			}
		}
	}
	public static void printOdd()
	{
		for(int i=10;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd Numbers: "+i);
			}
		}
	}
	public static void main(String[] args) {
		printEven();
		printOdd();
	}

	
}
