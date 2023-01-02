package com;

public class testC {
  private int i = 0;
  public static void main(String[] args) {
    testC c = new testC();
    int r = c.fc(5);
    System.out.println(r);
  }

  public int fc(int n){
    if(n == 1)
      return i;
    else if(n % 2 == 0) {
      fc(n / 2);
      i++;
    }
    else {
      fc(3 * n + 1);
      i++;
    }

    return -1;
  }
}
