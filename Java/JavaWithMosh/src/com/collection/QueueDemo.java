package com.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("b");
    queue.add("a"); // return Exception, when queue get full.
    queue.offer("c"); // return false
    var front = queue.element();
    var peek = queue.peek();
    // queue.remove();  // return exception
    // queue.poll(); // return null
    System.out.println("peek=" + peek);
    // System.out.println("front=" + front);
    // System.out.println(queue);
    // System.out.println(queue.size());

    System.out.println(queue);

    var q = queue.iterator();
    while(q.hasNext()) {
      System.out.println(q.next());
    }

  }
}
