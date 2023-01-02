#include <stdio.h>

void main() {
    struct Vote
    {
        int id;
        char name[20];
        int voteCount; // 票数
    };

    // 循环控制变量和最有要计数的ID
    int i, id;
    struct Vote leaders[3];

    // 循环读取3个投票人的信息
    for(i = 0; i < 3; i++) {
        printf("Please specified voter ID: (Total %d) ", 3-i);
        scanf("%d %s", &leaders[i].id, &leaders[i].name);
        leaders[i].voteCount = 0;
    }

    while(1){
        // 读取voter对应的id
        printf("Please input voter count with id: ");
        scanf("%d", &id);
        if( id == -1 ) break;

        // 找到对应的ID并将对应的投票数+1
        for(i = 0; i < 3; i++) {
            if(leaders[i].id == id) {
                leaders[i].voteCount++;
                break;

            }
        }
    }
    
    // 输出
    printf("ID\tName\tvoteCount\n");
    for(i = 0; i < 3; i++) {
        printf("%d\t%s\t%d\n", leaders[i].id, leaders[i].name, leaders[i].voteCount);
    }
}
