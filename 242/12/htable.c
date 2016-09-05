#include <stdio.h>
#include <stdlib.h>
#include "mylib.h"
#include "htable.h"
#include <string.h>


struct htablerec{
    int capacity, num_keys ;
    int *frequencies;
    char **karray;
};

htable htable_new(int capacity){
    int i = 0;
    htable table = emalloc(sizeof *table);
    table->capacity = capacity;
    table->num_keys = 0;
    table->frequencies = emalloc(table->capacity * sizeof table->frequencies[0]);
    table->karray = emalloc(table->capacity * sizeof table->karray[0]);
    for(i=0; i < table->capacity; i++){
        table->frequencies[i] = 0;
        table->karray[i] = NULL;
    }
    return table;
}
void htable_free(htable h){
    int i = 0;
    for(i = 0; i < h->capacity; i++){
        if(h->karray[i] == NULL){
            free(h->karray[i]);
        }
    }
    free(h->frequencies);
    free(h->karray);
    free(h);
}

 static unsigned int htable_word_to_int(char *word) {
     unsigned int result = 0;
     while (*word != '\0') {
         result = (*word++ + 31 * result);
     }
     return result;
 }

static unsigned int htable_step(htable h, unsigned int i_key) {
    return 1 + (i_key % (h->capacity - 1));
}

 int htable_insert(htable h, char *str){
     unsigned int i = htable_word_to_int(str);
     int collisions = 0;
     unsigned int index = i % h->capacity;

     while(collisions < h->capacity){
         if(h->karray[index] == NULL){
             h->karray[index] = emalloc((strlen(str)+1)*sizeof (char));
             strcpy(h->karray[index], str);
             h->frequencies[index]++;
             h->num_keys++;
             return 1;
         }

         if(strcmp(h->karray[index],str)==0){
             h->frequencies[index]++;
             h->num_keys++;
             return h->frequencies[index];
         }

         index+= htable_step(h, i);
         index %= h->capacity;
         collisions++;
     }
     return 0;
 }


void htable_print(htable h, FILE *stream){
    int i = 0;
    for(i = 0;i < h->capacity; i++){
        if(h->karray[i] != NULL){
        fprintf(stream, "%s\n", h->karray[i]);
        }
    }
}

int htable_search(htable h, char *str){
    int collisions = 0; ;
    unsigned int i =htable_word_to_int(str);
    
    unsigned int position =i % h->capacity;
    while(collisions != h->capacity && h->karray[position]!=NULL && strcmp(h->karray[position],str)!=0){
        position+=htable_step(h, i);
        position %= h->capacity;
        collisions++;
    }
    if(collisions == h->capacity){
        return 0;
    }
    else{
        return h->frequencies[position];
    }
}





   
    
    
