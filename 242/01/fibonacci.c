#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void){
    int f = 0;
    int g = 1;
    int i = 0;
    int temp = 0;
    while(i <= 40){
            printf("%3d ", g);
            temp = g;
            g += f;
            f = temp;
            i++;
            if(i%5 == 0){
                printf("\n");
            }
        }
    return EXIT_SUCCESS;
}
