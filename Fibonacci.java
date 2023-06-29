package org.fibonaci;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,n1=0,n2=1;
		for(i=0;i<=num;i++)
		{
			System.out.println("n1+");
			int fibo=n1+n2;
			n1=n2;
			n2=fibo;
			
		}

	}

}
