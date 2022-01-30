package com.locked.me;

import java.io.File;

public class DisplayFile extends CreatingFile {

	void DisplayFiles(){

	File Fl=new File(path);
	File Fi[]=Fl.listFiles();
	if(Fi.length==0) {
		System.out.println("Repository is Empty");
	}
	else {
		
	for(File Fm : Fi) {
	
	
		System.out.println(Fm.getName());
		}
}
}
}