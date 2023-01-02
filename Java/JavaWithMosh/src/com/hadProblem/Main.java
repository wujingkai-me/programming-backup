package com.hadProblem;

public class Main {
  public static void main(String[] args) {
    // Runnable -> 接口, 已经使用在了 Poodle类中
    // 正确的，我使用的是Runable 而不是 Runnable
    // Runables r = new Poodle();
    // Poodle r1 = (Poodle) r;
    // System.out.println(1);
    // 错误的
    // Runnable r2 = (Runnable) new Poodle();
  }

  // public static void testRunnable()
}
