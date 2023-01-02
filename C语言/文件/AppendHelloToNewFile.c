#include <stdio.h>
#include <stdlib.h>

int main(){
	char ch;
	FILE *original;
	FILE *advanced;
	
	original = fopen("Hello.txt", "r");
	advanced = fopen("New File.txt", "a+");
	
	if(original == NULL || advanced == NULL ) {
		printf("File opened error!");
		exit(0);
	}
	
	while(!feof(original)) {
		ch = fgetc(original);
		fputc(ch, advanced);
		putchar(ch);
	}
	
	fclose(original);
	fclose(advanced);
	


	return 0;
}