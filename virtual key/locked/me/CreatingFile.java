package com.locked.me;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatingFile {
	
	static String path;
	static int flag;
	public static void CreatingFile1() {
		System.out.println("Enter the  location of Directory" );
		System.out.println("NOTE:--Please Copy and Paste the path of Directory from local drivers--\n Include  '\\\\' at the end of path");
		Scanner s=new Scanner(System.in);
		 path= s.next();
	}

	
  void CreatingFiles() throws IOException{
	 
	   System.out.println("enter the file name");
	   Scanner sc=new Scanner(System.in);
	   String Finalfile=sc.next();
	   String Finale=path+Finalfile;
		File f=new File(Finale);
		ArrayList<String> fl=new ArrayList<>();
		boolean res= f.createNewFile();
		if(res==true) {
			System.out.println("Creating File......");
			System.out.println("file is created succefuly "+Finalfile);
			fl.add(Finalfile);
		}
		else {
			System.out.println("File is not created");
		}
		
   }
}