package com.basic;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        int a = scanner.nextInt();
        double sale = scanner.nextDouble();
        
        methods();
        System.out.println("You are " + age);
    }

    public static void methods(){
        System.out.println("this is my methods");
    }
}
