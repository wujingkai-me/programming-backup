package com.collection;

import java.util.Comparator;

public class EmailCompartor implements Comparator<Customer>{

  @Override
  public int compare(Customer o1, Customer o2) {
    return o1.getEmail().compareTo(o2.getEmail());
  }
  
}
