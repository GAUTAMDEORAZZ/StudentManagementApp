package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A1,A2,A3;
		int B1,B2,B3;
		int C1,C2,C3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value for A1,A2,A3");
		A1=sc.nextInt();
		A2=sc.nextInt();
		A3=sc.nextInt();
		System.out.println("Enter Value for B1,B2");
		B1=sc.nextInt();
		B2=sc.nextInt();
		B3=4+5;
		C1=5+A1;
		C2=A2+B2;
		C3=C2+B3;
		System.out.println("A1="+A1+" "+"A2="+A2+" "+"A3="+A3);
		System.out.println("B1="+B1+" "+"B2="+B2+" "+"B3="+B3);
		System.out.println("C1="+C1+" "+"C2="+C2+" "+"C3="+C3);

	}

}
