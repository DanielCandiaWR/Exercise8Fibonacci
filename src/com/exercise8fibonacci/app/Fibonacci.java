package com.exercise8fibonacci.app;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		long fibonacci = 1;
		int bound = 0;
		int counter1 = 0;
		int counter2 = 1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Input the number of Fibonacci serie: ");
			bound = scan.nextInt();
			if(bound<=0) {
				System.out.println("Input a number higher than zero!");
			}
		}while(bound<=0);
		for(int i=0;i<bound;i++) {
			System.out.print(fibonacci+" ");
			fibonacci = counter1 + counter2;
			counter1=counter2;
			counter2=(int) fibonacci;
		}
		scan.close();
	}
}
