package com.mutiple_process;

public class Main {
  public static void main(String[] args) {
//    System.out.println(Thread.activeCount());
//    System.out.println(Runtime.getRuntime().availableProcessors());
    System.out.println(Thread.currentThread().getName());
    Thread thread;
    for (int i = 0; i < 10; i++) {
      thread = new Thread(new DownloadFileTask());
      System.out.println("线程开始了");
      thread.start();
    }
    Thread.currentThread().isInterrupted();

  }
}
