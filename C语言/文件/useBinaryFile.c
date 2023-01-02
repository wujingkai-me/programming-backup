#include <stdio.h>
#include <stdlib.h>


struct STU{
	int num;
	char name[10];
}s[3]={
		{101, "AAA"},
		{102, "BBB"},
		{103, "CCC"}
	};
void save();
void read();
int main() {
	save();
	
	return 0;
}

void save(){
	FILE *fp;
	int i;
	fp = fopen("Hello.txt", "wb");
	if(!fp) exit(0);

	for(i = 0;i < 3;i ++){
		fwrite(&s[0], sizeof(struct STU), 1, fp);
	}

	fclose(fp);
}

void read(){
FILE *fp;
	int i;
	STU ss;
	fp = fopen("Hello.txt", "rb");
	if(!fp) exit(0);

	for(i = 0;i < 3;i ++){
		fread(&ss, sizeof(struct STU), 1, fp);
		printf("%d %s\n", ss.)
		}

	fclose(fp);
}