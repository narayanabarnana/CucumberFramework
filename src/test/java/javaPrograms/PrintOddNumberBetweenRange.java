package javaPrograms;

import java.util.Scanner;

public class PrintOddNumberBetweenRange {

	public static void main(String[] args) {
		
		//int startingNumber;
		int endingNumber;
		
		Scanner sc=new Scanner(System.in);
		//startingNumber=sc.nextInt();
		endingNumber=sc.nextInt();
		
		for(int i=1;i<=endingNumber;i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
