//Program to check a number is prime or not 
package basicProgram;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int x=sc.nextInt();
	int flag=0;
	for(int i=2;i<x-1;i++) {
		if(x%i==0) {
			flag=flag+1;
		}
	}
	if(flag>0) {
		System.out.println("Not a prime number");
	}
	else {
		System.out.println("Prime number");
	}
	
}
}
