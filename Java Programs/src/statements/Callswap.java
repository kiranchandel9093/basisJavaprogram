package statements;

import java.util.Scanner;


import mehtod.Swapp;

public class Callswap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Value of x :");
      	int x =sc.nextInt();
		//System.out.println(x);
		System.out.println("Enter Value of Y :");
		int y =sc.nextInt();
		//System.out.println(y);
		
		 Swapp obj = new Swapp();
		int a=  obj.XYZ(x, y);
		System.out.println( "Sum = "+a);

	//Swap_cls obj = new Swap_cls ();
	
	}

}
