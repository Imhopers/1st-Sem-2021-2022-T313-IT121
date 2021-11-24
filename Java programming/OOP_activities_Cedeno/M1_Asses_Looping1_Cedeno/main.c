#include <stdio.h>

int main()
{
    int i, j;
    for(i=7;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
            printf("%c",'a' + j-1);
        }
        printf("\n");
    }

    return 0;
}
