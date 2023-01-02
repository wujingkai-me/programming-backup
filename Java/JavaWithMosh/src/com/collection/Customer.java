package com.collection;

public class Customer implements Comparable<Customer>{
  private String name;
  private String email;
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Customer o) {
    return name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return name;
  }

  public int compare(Customer o) {
    // TODO Auto-generated method stub
    return 0;
  }

  
}
