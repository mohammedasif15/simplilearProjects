package com.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 

public class Reader1 {
 
public static void main(String[] args) throws IOException {

    FileOutputStream o=new FileOutputStream("I:\\new\\a.txt");
  
      try {
          FileReader reader = new FileReader("a.txt");
          int character;

          while ((character = reader.read()) != -1) {
              System.out.print((char) character);
          }
          reader.close();

      } catch (IOException e) {
          e.printStackTrace();
      }
      
    }
}