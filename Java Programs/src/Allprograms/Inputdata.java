package Allprograms;

import java.util.Scanner;

public class Inputdata {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Enter number:" );
	int x = sc.nextInt();
	
/*	System.out.println("Enter Sec Number:");
	int y = sc.nextInt();
	System.out.println(5%2);
	
	*/
		if(x%2==0)
		{
			System.out.println("Even Number");
		
		}
		else {
			System.out.println("Odd number");
		}
		
	
		for(int i=1;i<11;i++)
		{
			int y = x*i;
			System.out.println(y);
			
		}
			
	}

}
