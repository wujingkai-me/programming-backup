package com.basic;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    double[] doubleArrays = new double[10];

    Stream<double[]> stream = Stream.of(doubleArrays);
    stream.sorted();
  }
}
