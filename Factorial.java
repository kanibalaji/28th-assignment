package org.factorial;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)

		{
			fact=fact*i;
			
		}
   System.out.println("Factorial of given order");
   
	}

}
