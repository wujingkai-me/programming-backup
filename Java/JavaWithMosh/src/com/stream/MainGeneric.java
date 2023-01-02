package com.stream;

import java.util.List;

public class MainGeneric {
  public static void main(String[] args) {
    GenericTest<String> generic =
            new GenericTest<String>(List.of("a", "b", "c"));
  }
}
