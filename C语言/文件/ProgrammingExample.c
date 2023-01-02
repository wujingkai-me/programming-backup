#include <stdio.h>
#include <stdlib.h>

struct map
{
	char data;
	char shape;
};

int main()
{
	FILE *data;
	FILE *userInput;
	char _input[10][10], _inputChar;
	char _data[3][10];

	data = fopen("MySQL.txt", "r");
	userInput = fopen("data.txt", "rw");

	printf("%c \n", fgetc(data));
	printf("%c \n", fgetc(data));
	printf("%c \n", fgetc(data));
	return 0;
}