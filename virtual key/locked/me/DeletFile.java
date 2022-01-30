package com.locked.me;

import java.io.File;
import java.util.Scanner;

public class DeletFile extends CreatingFile {
	String filename;
	void DeletFiles(){

	Scanner s=new Scanner(System.in);
	
	 File f=new File(path);
	File[] f3=f.listFiles();
	if(f3.length==0) {
		System.out.println("Repository is Empty");
		
	}
	else {
		System.out.println("Enter the file name u want to delet");
		 filename=s.next();
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
	String Finale=path+filename;
	File f1=new File(Finale);
	f1.delete();
	System.out.println("Deleting File.....");
	System.out.println("file deleted succefully");
	}
	 else if(flag==0){
		 System.out.println("No File With Such Name");
	 }
	

}
}