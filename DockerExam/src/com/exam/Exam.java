package com.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		System.out.print("Sum is: "+getMax(a, b, c)+"\n");
		System.out.print("Avg: "+getAvg(a, b, c));
		
	}
	
	public static int getMax(int a, int b, int c) {
		return a+b+c;
	}
	public static int getAvg(int a, int b, int c) {
		return (a+b+c)/2;
	}
	
	
}
