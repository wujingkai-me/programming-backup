#include <stdio.h>
/*
    给定1个学生的结构体类型
    如果学生1的成绩比学生2的成绩大，输出学生1的所有信息
    如果学生2的成绩比学生1的成绩大，输出学生2的所有信息
    如果2个学生成绩相等，则全部输出
*/ 

void main() {
    struct Student{
        char name[50];
        float score;
    };

    struct Student student1, student2;

    // 输入student1的学生信息
    printf("Please input student1's name: ");
    scanf("%s", &student1.name);
    printf("Please input student1's score: ");
    scanf("%f", &student1.score);
    // 输入student2的学生信息
    printf("Please input student2's name: ");
    scanf("%s", &student2.name);
    printf("Please input student2's score: ");
    scanf("%f", &student2.score);

    // 判断student1和student2的成绩大小
    if(student1.score > student2.score) {
        printf("student1 name %s and score %.3f \n", student1.name, student1.score);
    } else if(student1.score < student2.score) {
        printf("student2 name %s and score %.3f \n", student2.name, student2.score);
    } else {
        printf("student1 name %s and score %.3f \n", student1.name, student1.score);
        printf("student2 name %s and score %.3f \n", student2.name, student2.score);
    }
}