#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*defining size of array*/
#define ARRAY_MAX 30000

/*insertion sort function which is called upon in main*/
void insertion_sort(int *a, int n){
    /*variable declaration*/
    int i, j;
    int key;
    /*for and while loops to run through each i and move it appropriately*/
    for(i=1; i<n;i++){
        key = a[i];
        j=i-1;
        /*while loop which runs back down to all values less than j*/
        while(key<a[j] && j>=0){
            a[j+1]=a[j];
            --j;
        }
        a[j+1]=key;
    }/*exiting the for and while loop*/
}

int binsearch(int *array, int target, int size){
    int mid = 0;
    mid = size/2;
    if (size == 0){
        return -1;
    }if (array[mid] == target){
        return mid;
    }else if (array[mid] < target){      
        return binsearch(array + size/2 + 1, target, size/2);
    }else{
        return binsearch(array + size/2 -1, target, size/2);
    }
}
            

/*main function which declares variables and runs insertion sort*/
int main(int argc, char **argv){
    int temp;
    FILE *infile;
    int my_array[ARRAY_MAX];
    int count = 0;

    if (NULL == (infile = fopen(argv[1], "r"))) {
        fprintf(stderr, "%s: can’t find file %s\n", argv[0], argv[1]);
        return EXIT_FAILURE;
    }
    while (count < ARRAY_MAX && 1 == fscanf(infile, "%d", &my_array[count])) {
        count++;
    }
    /*starting the clock and call the insertion sort method*/
  
    insertion_sort(my_array, count);

    while(1 == scanf("%d", &temp)){
        scanf("%d", &temp);
        if(binsearch(my_array, temp, count)>=0){
            printf("+");
        }else{
            printf("-");
        }
    }
            
    
        return EXIT_SUCCESS; /*exiting the loop*/
    }
