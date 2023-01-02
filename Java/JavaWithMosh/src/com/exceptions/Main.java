package com.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) {
    // 实现1
    // FileReader reader = null;
    // try {
    //   reader = new FileReader("file.txt");
    //   System.out.println("File opened");
    // } catch (FileNotFoundException ex) {
    //   // ex.printStackTrace();
    //   System.out.println("File not found Exception");
    // } finally {
    //   if( reader != null ) {
    //     try {
    //       reader.close();
    //     } catch (Exception e) {
    //       System.out.println("File close error.");
    //     }
    //   }
    // }

    // 实现2
    try (
      var reader = new FileReader("file.txt");
      var writer = new FileWriter("file.txt")
      ) {
      var value = reader.read();
    } catch ( IOException ex ) {
      System.out.println(ex);
    }
  }
}
