package com.locked.me;

import java.io.File;
import java.util.Scanner;

public class SearchingFile extends CreatingFile {
	
	void SearchingFiles(){
	 File f=new File(path);
	
	Scanner s=new Scanner(System.in);
	
	File[] f3=f.listFiles();
	if(f3.length==0) {
		System.out.println("Repository is Empty");
	}
	else {
		 System.out.println("enter the file u want to search");
		 String filename=s.next();
	 for(File g : f3) {
		
		 if(g.getName().equalsIgnoreCase(filename)) {
			 flag=1;
			 break;
		 }
		 else {
			 flag=0;
		 }
	 }
	}
	 if(flag==1) {
		 System.out.println("Searching File......");
		 System.out.println("file is available");
	 }
	 else if(flag==0) {
		 System.out.println("file is not available");
	 }
	
}
}
