#include <stdio.h>

struct Student
{
  int studentID;
  char studentName[10];
  float score;
};

int main()
{
  // 输入学生的成绩并返回最大值
  struct Student stu1, stu2, max;
  struct Student *stu_temp = NULL;
  char content[3][30] = {"Student ID: ", "Student name: ", "Student score: "};
  for (int s = 0; s <= 1; s++)
  {
    stu_temp = (s == 0 ? &stu1 : &stu2);
    printf("Please input NO.%d student infomations: \n", s);
    for (int index = 0; index < 3; index++)
    {
      printf("%s ", content[index]);
      switch (index)
      {
      case 0:
        scanf("%d", &stu_temp->studentID);
        break;
      case 1:
        scanf("%s", &stu_temp->studentName);
        break;
      case 2:
        scanf("%f", &stu_temp->score);
        break;
      }
    }
  }
  if (stu1.score > stu2.score)
  {
    printf("stu1: %d %s %f", stu1.studentID, stu1.studentName, stu1.score);
  }
  else
  {
    printf("stu2: %d %s %f", stu2.studentID, stu2.studentName, stu2.score);
  }

  return 0;
}