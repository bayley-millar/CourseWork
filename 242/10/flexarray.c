#include <stdio.h>
#include <stdlib.h>
#include "mylib.h"
#include "flexarray.h"
struct flexarrayrec {
    int capacity;
    int itemcount;
    int *items;
};
flexarray flexarray_new() {
    flexarray result = emalloc(sizeof *result);
    result->capacity = 2;
    result->itemcount = 0;
    result->items = emalloc(result->capacity * sizeof result->items[0]);
    return result;
}
void flexarray_append(flexarray f, int num) {
    if (f->itemcount == f->capacity) {
        f->capacity += f->capacity;
        f->items = erealloc(f->items,f->capacity * sizeof f->items[0]);
    }
    f->items[f->itemcount++] = num;
}
void flexarray_print(flexarray f) {
    int i;
    for(i = 0; i < f->itemcount; i++){
        printf("%d\n", f->items[i]);
    }
}
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
void flexarray_sort(flexarray f) {
    int *array;
    array = emalloc(f->capacity);
    merge_sort(f->items, array, f->itemcount);
    
}
void flexarray_free(flexarray f) {
    free(f->items);
}
