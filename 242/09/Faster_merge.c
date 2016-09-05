/**Faster_merge
 * Bayley Millar
 * Lab09
 * code included in this file will sort using the merge sort algorithm
 */

#include <stdlib.h>
#include <stdio.h>
#include <time.h>
/*size of the array*/
#define ARRAY_MAX 200000
/**merge only fuction*/
void merge(int *array, int *workspace, int len){
    int i, j, k;
    i = 0;
    j = len/2;
    k = 0;
    while (i<len/2 && j<len){
        if(array[i]<array[j]){
            workspace[k] = array[i];
            i++;
        } else{
            workspace[k] = array[j];
            j++;
        }
        k++;
    }
    while(i<len/2){
        workspace[k] = array[i];
        k++;
        i++;
    }
    while(j<len){
        workspace[k] = array[j];
        k++;
        j++;
    }
    
}
void insertion_sort(int *a, int n){
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
/**for completing the soritng*/
void merge_sort(int *a, int *w, int l){
    int i;
    if(l > 2){
        /*call insertion sort if less than certain value*/
        if(l < 10){
            insertion_sort(a, l);
        }else{
            merge_sort(a, w, l/2);
            merge_sort(a+(l/2), w, l-(l/2));
            merge(a, w, l);
            for(i=0; i<l; i++){
                a[i]=w[i];
            }
         
        }
    }
}


/*main function which declares variables and runs insertion sort*/
int main(void){
    int my_array[ARRAY_MAX];
    int workspace[ARRAY_MAX];
    clock_t start, end;
    int i, count = 0;
    /*while loop to check for count and if there is more input*/
    while(count<ARRAY_MAX && 1 == scanf("%d", &my_array[count])){
        count++;
    }
    
    /*starting the clock and call the insertion sort method*/
    start = clock();
    merge_sort(my_array, workspace, count);
    end = clock();
    /*runs through the array and prints out ordered values*/
    for(i=0; i<count; i++){
        printf("%d\n", my_array[i]);
    }
    fprintf(stderr,"%d %f\n", count, (end-start) / (double)CLOCKS_PER_SEC);
    return EXIT_SUCCESS; /*exiting the loop*/
}
