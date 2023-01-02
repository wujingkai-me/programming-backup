package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
  public static void show() {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add(1, "c");
    
    Collections.addAll(list, "a", "bb", "c");
    System.out.println(list);
    System.out.println(list.indexOf("a"));
    System.out.println(list.lastIndexOf("a"));
    System.out.println(list.subList(0, 2));
  }
}
