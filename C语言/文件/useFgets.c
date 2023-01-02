#include <stdio.h>
#include <stdlib.h>

int main() {
	FILE *fp;
	fp = fopen("useFgets.txt", "r");
	
	if(fp == NULL) exit(0);
	
	char s[20], c[20];
	
	fscanf(fp, "%sp%s", &s, &c);

	puts(s);
	puts(c);
}