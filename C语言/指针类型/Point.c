#include <stdio.h>

int sum(int first, int second);
int main()
{
  int (*sumPoint)(int, int);
  int plus_result;

  sumPoint = sum;

  plus_result = sumPoint(1, 2);
  printf("%d \n", plus_result);
  return 0;
}

int sum(int first, int second)
{
  return first + second;
}