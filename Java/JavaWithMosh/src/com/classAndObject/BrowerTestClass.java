package com.classAndObject;

import java.util.Scanner;

public class BrowerTestClass {
    public static void main(String[] args) {
        Brower brower = new Brower();
        brower.navigate("www.baidu.com");
    }

    public static void prints(){
        System.out.println("String");
    }
}

class Console{
    // This is a Tips. NOT COMPLETELY coding.
    private Scanner scanner = new Scanner(System.in);
    public double readNumbers() {
        return scanner.nextDouble();
    }
}
