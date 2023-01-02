#include <stdio.h>

int sl(char *s)
{
  int paramLength = 0;
  while (*s != '\0')
  {
    paramLength++;
    s++;
  }
  return paramLength;
}

int main()
{
  char s[] = "Hello World!";
  int length = sl(s);
  printf("S variable length is : %d \n", length);
  return 0;
}
