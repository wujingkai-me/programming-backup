#include <stdio.h>

int main()
{
  // int a, b, flag;
  // int sum = 0; // 之后求和的累计结果 从1 + 2 ... + 100

  // // 输入a，b的值
  // printf("Please input value of a: ");
  // scanf("%d", &a);
  // printf("Please input value of b: ");
  // scanf("%d", &b);

  // for (int i = a; i <= b; i++)
  // {
  //   if (i % 2 == 0)
  //     flag = 1;
  //   // 我需要保证在 i % 2 == 0 条件不成立的情况下flag = 0
  //   // 否则23行的判断语句会认为这个i的值还是一个偶数
  //   else
  //     flag = 0;

  //   if (flag)
  //     sum = sum + i;
  // }

  // while和for区别不同的是他无法将循环的初始条件，判断条件等放在一行写，这没什么
  // int i = 1;
  // int j = 1; // 思考为什么j需要定义在这个位置
  // while (i <= 9)
  // {
  //   while (j <= i)
  //   {
  //     printf("%d * %d = %d \t", j, i, i * j);
  //     j++;
  //   }
  //   printf("\n");
  //   i++;
  // }

  int a = 1;
  int b = 2;
  printf("%d \n", (1 && 2));
  printf("%d \n", (0 && 1));
  printf("%d \n", (1 && 0));
  printf("%d \n", (a && b));
  return 0;

  // 使用位运算交换两个变量的值
  int a = 2;
  int b = 3;

  // 在此写下你的代码

  print("a=%d, b=%d \n", a, b);
  // 输出结果将是a=3, b=2
}