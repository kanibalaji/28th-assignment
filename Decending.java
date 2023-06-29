package org.decending;
import java.util.Arrays;
import java.util.Scanner;

public class Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n []={2,3,5,26,15,16};
		System.out.println("Before Sort : "+Arrays.toString(n));
		int temp;
		for(int i=0;i<=n.length-1;i++) {
			for(int j=i+1;j<=n.length-1;j--)
			{
				if(n[j]>n[i]) {
					temp=n[j];
					n[j]=n[i];
					n[i]=temp;
					
				}
			}
			}
		System.out.println("After Sort : "+Arrays.toString(n));
		// TODO Auto-generated method stub

	}


}
