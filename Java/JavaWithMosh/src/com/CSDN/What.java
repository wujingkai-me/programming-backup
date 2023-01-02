package com.CSDN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class What {
  public static void main(String[] args) {
    List<String> list = List.of("a,b,c,d", "1,s,c,d");

    List<String> newList = list.stream()
            .flatMap(s -> {
              String[] split = s.split(",");
              System.out.println(split);
              return Arrays.stream(split);
            })
            .collect(Collectors.toList());

    System.out.println(newList);
  }
}
