package com.locked.me;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		CreatingFile c=new CreatingFile();
		SearchingFile s=new SearchingFile();
		DisplayFile d=new DisplayFile();
		DeletFile de=new DeletFile();
		System.out.println("Welcome To the Locked.me Application");
		
		c.CreatingFile1();
		System.out.println("What is the action u want to perform");	
		while(true) {
			try {
		System.out.println("MENU\n1.Display All the Files\n2.Creat File\n3.Search File\n4. Delet Files\n5.Exit Apllication");
	    Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
			switch(count) {
			case 1:
				d.DisplayFiles();
				break;
			case 2:
				c.CreatingFiles();
				break;
			case 3:
				s.SearchingFiles();
				break;			
			case 4: 
					de.DeletFiles();
					break;							
			case 5:
				System.exit(0);
			default:
				
				System.out.println("Enter the correct option");
				break;
			
			}
			}catch(Exception e) {
				System.out.println(e+" Enter an Integer");
			}
		}		
		
	}
}
