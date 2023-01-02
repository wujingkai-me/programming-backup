#include <stdio.h>
#include <math.h>

void main()
{
    // printf("%d \n", 2 * 2 * 2 * 2 * *2);
    const int N = 100;
    int date[N][N];
    int i, j, n = 10;
    for (i = 0; i <= n; i++)
    {
        date[i][0] = date[i][i] = 1;
    }
    for (i = 3; i <= n; i++)
    {
        for (j = 2; j < i; j++)
        {
            date[i][j] = date[i - 1][j] + date[i - 1][j - 1];
            // printf("%d ", date[i][j]);
        }
        putchar(10);
    }
    for (i = 0; i <= 10; i++)
    {
        for (j = 0; j < i; j++)
        {
            printf("%d ", date[i][j]);
        }
        putchar(10);
    }
    // printf("n:");
    // scanf("%d", &n);

    // for (i = 1; i <= n; i++)
    // {
    //     date[i][0] = date[i][i] = 1;
    // }

    // for (i = 3; i <= n; i++)
    // {
    //     for (j = 2; j < i; j++)
    //     {
    //         date[i][j] = date[i - 1][j - 1] + date[i - 1][j];
    //     }
    // }

    // for (i = 1; i <= n; i++)
    // {
    //     for (j = 2; j <= i; j++)
    //     {
    //         // if (date[i][j] == 0)
    //         //     printf("%d,%d\n", i, j);
    //         printf("%-3d", date[i][j]);
    //     }
    //     putchar(10);
    // }
}