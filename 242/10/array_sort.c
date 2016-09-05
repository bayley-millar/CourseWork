#include <stdio.h>
#include <stdlib.h>
#include "mylib.h"

void insertion_sort (int *a, int n){
    int i, j;
    int key;
    for(i=1; i<n;i++){
        key = a[i];
        j=i-1;
        /*while loop which runs back down to all values less than j*/
        while( j>=0 && key<a[j]){
            a[j+1]=a[j];
            --j;
        }
        a[j+1]=key;
    }
}


static void array_print(int *a, int n) {
    int i;
    for (i = 0; i < n; i++) {
        printf("%d\n", a[i]);
    }
}
int main(void) {
    int capacity = 2;
    int itemcount = 0;
    int item;
    int *my_array = malloc(capacity * sizeof my_array[0]);
    if (NULL == my_array) {
        fprintf(stderr, "memory allocation failed.\n");
        exit(EXIT_FAILURE);
    }
    while (1 == scanf("%d", &item)) {
        if (itemcount == capacity) {
            capacity += capacity;
            my_array = realloc(my_array, capacity * sizeof my_array[0]);
        }
        my_array[itemcount++] = item;
    }
    insertion_sort(my_array, itemcount);
    array_print(my_array, itemcount);
    free(my_array);
    return EXIT_SUCCESS;
}
