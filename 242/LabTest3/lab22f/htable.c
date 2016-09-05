#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "mylib.h"
#include "htable.h"
 
struct htablerec{
    int capacity;
    int num_keys;
    char **keys;
};
 
static unsigned int htable_word_to_int(char *word){
    unsigned int result = 0;
 
    while (*word != '\0'){
        result = (*word++ + 31 * result);
    }
    return result;
}
 
htable htable_new(int capacity){
    
    int i;
       
    htable r = emalloc(sizeof *r);
    r->capacity = capacity;
    r->num_keys = 0;
    r->keys = emalloc(capacity * sizeof(char*));
    for(i = 0; i < capacity; i++) {
        r->keys[i] = NULL;
    }
    return r;
}
 
void htable_free(htable h){
    int i;
    for(i = 0; i < h->capacity; i++){
        if(h->keys[i] != NULL){
            free(h->keys[i]);
        }
    }
    free(h->keys);
    free(h);
}
 
void htable_insert(htable h, char *str){
    int i = htable_word_to_int(str) % h->capacity;
    int x = i;
    do{
        if(h->keys[i] == NULL){
            h->keys[i] = emalloc(sizeof str[0]*(strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(!strcmp(h->keys[i], str)){
            break;
        }
        i=(i+1)%h->capacity;
    }while(i != x);
}
 
void htable_print(htable h, FILE *stream){
    int i;
    for (i = 0; i < h->capacity; i++) {
        fprintf(stream, "%2d %s\n", i, h->keys[i] == NULL ? "" : h->keys[i]);
    }
}