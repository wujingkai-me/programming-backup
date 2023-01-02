#include <stdio.h>
int main()
{
  char *name[] = {"Follow me!", "Basic", "Great Wall", "Fortran", "Computer Design"};
  char **point;

  for (int i = 0; i < 5; i++)
  {
    point = name + i;
    printf("%s \n", *point);
  }
  return 0;
}