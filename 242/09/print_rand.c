/**prints random numbers for testing purposes*/
#include <stdlib.h>
#include <stdio.h>

int main(int argc, char **argv){
    int i, n;
    if(argc > 1){
        int val = atoi(argv[1]);
        for(i = 0;i < val; i++){
            n = rand()%100 +1;
            printf("%d\n", n);
        }
        return EXIT_SUCCESS;
    }else{
        return EXIT_FAILURE;
    }
}
