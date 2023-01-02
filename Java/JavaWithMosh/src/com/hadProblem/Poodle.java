package com.hadProblem;

public class Poodle extends Dog implements Runable{

  // @Override
  public void run() {
    // TODO Auto-generated method stub
    System.out.println("eat");
  }

  public Runable s;
  public static void show (Runable s){
    // System.out.println(s.run());
    s.run();
  }

  
  
}
