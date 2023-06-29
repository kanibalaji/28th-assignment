package org.even;
import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		int j=0;
		for(int i=0;i<no;i++)
		{
			if(i%2==1)
			{
				count=count+i;
				System.out.println(count);
				j++;
				
			}
		}
            System.out.println("Count of even nos:");
            
	}

}
