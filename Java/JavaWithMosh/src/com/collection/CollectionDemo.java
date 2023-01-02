package com.collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
  /**
   * 
   */
  public static void show() {
    Collection<String> collection = new ArrayList<>();
    // collection.add("a");
    // collection.add("b");
    // collection.add("c");
    // for (var item : collection) {
    //   System.out.println(item);
    // }

    Collections.addAll(collection, "a", "b", "c");
    collection.remove("a");
    collection.clear();
    collection.isEmpty();
    collection.contains("a");
    
    Object[] newObject = collection.toArray();
    String[] s = collection.toArray(new String[3]);
  }
}
