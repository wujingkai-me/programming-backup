#include <stdio.h>

void mystrcpy(char *s1, char *s2);
int main()
{
  char s1[] = "Hello ";
  char s2[] = "World !";

  mystrcpy(s1, s2);
  printf("%s \n", s1);
  return 0;
}

void mystrcpy(char *s1, char *s2)
{
  while (1)
  {
    if (*s1 == '\0')
    {
      *s1 = *s2++;
      s1++;
      if (*s2 == '\0')
        break;
    }
    else
    {
      s1++;
    }
  }
}