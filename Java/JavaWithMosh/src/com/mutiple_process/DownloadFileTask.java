package com.mutiple_process;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DownloadFileTask  implements  Runnable{
  @Override
  public void run() {
    System.out.println("Download File: " + Thread.currentThread().getName());

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("下载完成");


  }
}
