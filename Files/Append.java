package com.pack;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Append {
	
	 
	

	 
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("a.txt", true);
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	 
	            bufferedWriter.write("Hello World");
	            bufferedWriter.newLine();
	            bufferedWriter.write("See You Again!");
	 
	            bufferedWriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 
}
