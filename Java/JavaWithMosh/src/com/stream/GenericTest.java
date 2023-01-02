package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class GenericTest<T> {
  public List<T> list = new ArrayList<>();

  GenericTest(List<T> list) {
    this.list.addAll(list);
    System.out.println(list instanceof Collection<?>);
    this.list.stream();
    this.list.stream().forEach(System.out::println);
  }
}
