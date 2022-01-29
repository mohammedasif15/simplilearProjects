package com.calculation;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Addition a=new Addition();
	Multiplication m=new Multiplication();
	Substraction sb=new Substraction();
	Division d=new Division();
	System.out.println("Select option\n1.Add\n2.Multiply\n3.Substract\n4.Divide\n5.Exit");
	Scanner s=new Scanner(System.in);
	int count=s.nextInt();
	switch(count) {
	case 1:
		a.Addtion1();
		break;
	case 2:
		m.Multiplication1();
		break;
	case 3:
		sb.Substaction1();
		break;
	case 4:
		d.Division1();
		break;
	case 5:
		System.exit(0);
		default:
			System.out.println("Enter Correct Option");
	}
}
}
