/*
  public static void methods(Interface i) {  Interface.print("HELLO WORLD")  } 
  Lamabda
  - methods(new Interface(){ @Override })
  - methods(() -> {})

  + methods(Object/Class::methods)
    + methods(Demo::new) equals methdos(message -> new Demo(message))
    + methods(System.out::println)

  * Interface variable = (message) -> System.out.println();
*/ 
package com.lambdaExpression;

public class lambdaDemo {
  public static void print(String message){ System.out.println(message); }
  public lambdaDemo(String message) {  }
  public static void show() {
    // lambdaDemo ld = new lambdaDemo();
    //    // greet(message -> ld.print(message));
    // Printer ls = (String a) -> a = "1";
    greet(message -> new lambdaDemo(message));
    greet(lambdaDemo::new);
    Printer a = message -> System.out.println(message);
    greet(a);
    // System.out.println(ls.);
  }



  public static void greet(Printer printer){
    printer.print("hello world");
  }
}
