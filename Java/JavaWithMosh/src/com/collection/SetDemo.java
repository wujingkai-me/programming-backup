package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void show() {
    // Set<String> set = new HashSet<>();
    // set.add("sky");
    // set.add("is");
    // set.add("blue");
    // set.add("blue");
    // System.out.println(set);
    Set<String> set1 =
      new HashSet<>(Arrays.asList("a", "b", "c"));
    
    Set<String> set2 =
      new HashSet<>(Arrays.asList("b", "c", "d"));

    // Union
    // set1.addAll(set2);
    
    // Intersection
    set1.retainAll(set2);
    
    // Difference
    // set1.removeAll(set2);

    Object[] s = set1.toArray();

    System.out.println(s[0]);
    // for(Object es: s)
    //   System.out.println(es.toString());
    // System.out.println(s);

  
  }

}
