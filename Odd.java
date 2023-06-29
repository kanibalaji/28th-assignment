package org.oddprogram;
import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		int j=0;
		for(int i=0;i<no;i++)
		{
			if(i%2==0)
			{
				count=count+i;
				System.out.println(count);
				j++;
				
			}
		}
		System.out.println("count of odd nos");
		
		

	}

}
