package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
  public static void show() {
    // List<Customer> customers = new ArrayList<>();
    
    // for(Customer customer: customers)
    //   if(customer.getEmail() == "e1")
    //     System.out.println("Found!");

    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e1");
    
    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    System.out.println(map.get("e10")); // return false if not exists

    var unknow = new Customer("Unknow", "");
    System.out.println(map.getOrDefault("e10", unknow)); // return specified Object if not exists

    var exists = map.containsKey("e1"); // if does not this key you will get false, else return true
    System.out.println(exists);

    map.replace("e1", new Customer("a++", "e1"));
    System.out.println(map);

    // map don't iterable, remember it.
    /*
    For example
    + for (var key: map)
    you will get a compliation error. 
    */

    for(var key: map.keySet())
      System.out.println(key); // each key, not value
    
    for(var key: map.entrySet()){
      System.out.println(key); // you get "key=value" like this.
      System.out.println(key.getKey());
      System.out.println(key.getValue());
    }

    for(var entry: map.values())
      System.out.println(entry);
  }
}
