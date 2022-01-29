package com.pack;

import java.io.FileWriter;
import java.io.IOException;

public class Writer1  {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("a.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}

