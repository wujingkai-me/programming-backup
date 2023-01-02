package com.stream;

import java.util.stream.Stream;

public class CreatingStreamsDemo {
  public static void show() {
//    Stream.of();
    var stream = Stream.generate(() -> Math.random());
    stream
          .limit(3)
          .forEach(n -> System.out.println(n));
  }
}
