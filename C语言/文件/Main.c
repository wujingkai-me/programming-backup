#include <stdio.h>
#include <stdlib.h>

int main(){
	FILE *fp;
	fp = fopen("New File.txt", "w+");
	char ch;

	if(fp == NULL) {
		printf("File open error");
		exit(0);
	}
	
	while((ch=getchar()) != '#') {
		fputc(ch, fp);
	}
	
	fclose(fp);
	return 0;
}