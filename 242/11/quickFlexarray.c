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

void quick_sort(int *a, int len){
    int pivot, i, j, temp;
    if(len < 2){
        return;
    }
    pivot = a[1];
    for (i = 0, j = len - 1;; i++, j--) {
        while(a[i] < pivot){
            i++;
        }
        while(a[j] > pivot){
            j--;
        }
        if(i >= j){
            break;
        }
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    
    }
    quick_sort(a, i);
    quick_sort(a + i, len - i);
    
}


void flexarray_sort(flexarray f) {
    /* int *array; */
    /* array = emalloc(f->capacity); */
    quick_sort(f->items, f->itemcount);
    
}
void flexarray_free(flexarray f) {
    free(f->items);
}
