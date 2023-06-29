package org.asendingorder;

public class Assending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {2,3,5,6,1,5,6};
		int temp;
		for(int i=0;i<=no.length-1;i++)
		{
			for(int j=i+1;j<=no.length-1;j++)
			{
				if(no[i]>no[j])
				{
					temp=no[i];
					no[i]=no[j];
					no[j]=no[i];
					
				}
			}
		}
		System.out.println("Acending order is");
		for(int i=0;i<=no.length-1;i++)
		{
			System.out.println(no[i]);
			
		}
		

	}

}
