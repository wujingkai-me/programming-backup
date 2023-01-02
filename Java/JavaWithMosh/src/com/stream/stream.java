package com.stream;

import java.util.*;
import java.util.stream.Stream;

public class stream {
  public static void main(String[] args) {
//    List<Movies> movies = List.of(
//            new Movies("a", 30),
//            new Movies("c", 20),
//            new Movies("b", 20)
//    );

    List<String> list = Arrays.asList("a", "b", "c");

//    Stream<String> stream = list.stream();
//
//    Stream<String> parallelStream = list.parallelStream();
//
//    parallelStream.forEach(item -> System.out.println(item));
//
    list.stream().forEach(System.out::println);
  }
}
