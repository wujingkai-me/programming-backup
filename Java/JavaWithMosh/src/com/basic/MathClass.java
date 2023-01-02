package com.basic;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        // Math.round(1.3F);
        // Math.ceil(2.3F);
        // // Math.random() * 100;
        // // For Example
        // int result = (int) (Math.round(Math.random() * 100));

        Scanner scanner = new Scanner(System.in);
        String scannerName = scanner.nextLine();
        System.out.println(scannerName == "name");
        System.out.println(scannerName.equals("name"));

    }
}
