#include <stdio.h>
#include <stdlib.h>
#include "mylib.h"
#include "bst.h"
#include <string.h>

struct bst_node {
    char *key;
    bst left;
    bst right;
};

bst delete_node (bst b) {
    if(b->right == NULL && b->left ==NULL){
        free(b->key);
        
        b= NULL;
        return b; 
    }else if(b->right !=NULL){
        char *tmp = b->key;
        b->key = b->right->key;
        b->right->key = tmp;
        b = bst_delete(b,tmp);
    }else if(b->left !=NULL){
        char *tmp = b->key;
        b->key = b->left->key;
        b->left->key = tmp;
        b = bst_delete(b,tmp);
    }else if(b->left != NULL && b->right !=NULL){

        bst temp = b->right;
        while(temp ->left != NULL){
            temp = temp->left;

        }
        strcpy(b->key,temp->key);
        b->right=bst_delete(b->right,temp->key);
        

    }
    return b;
}

bst bst_delete(bst b, char *str){

    if (NULL == b){
        return b;
    }
    if(strcmp(b->key,str) == 0){
        b =delete_node(b);
    }else if(strcmp(b->key,str) < 0){
        b->right = bst_delete(b->right, str);
    }else{
        b->left = bst_delete(b->left,str);
    }
    return b;
}
         

void print_key(char *s) {
    printf("%s\n", s);
}

bst bst_free(bst b){
    if(NULL == b){
        return b;
    }
    
    bst_free(b->left);
    
    bst_free(b->right);
    free(b->key);
    free(b);

    return b;
}

bst bst_insert(bst b, char *str){
    
    if(b == NULL){
        b = emalloc(sizeof *b);
        b->left = NULL;
        b->right = NULL;
        b->key = NULL;
    }
    if(b->key == NULL){
        b->key = emalloc((strlen(str)+1)*sizeof (char));
        strcpy(b->key, str);
    }
    if(strcmp(b->key, str) == 0){
    }
    if(strcmp(str, b->key) < 0){
        b->left = bst_insert(b->left, str);
    }
    if(strcmp(str, b->key) > 0){
        b->right = bst_insert(b->right, str);
    }
    return b;
}
/*just making new NULL space*/
bst bst_new(){
    return NULL;
}

 void bst_preorder(bst b, void f (char *str)){

     if(NULL == b){
         return;
     }

     f(b->key);
     bst_preorder(b->left, f);
     bst_preorder(b->right,f);

 }

 void bst_inorder(bst b, void f (char *str)){

     if(NULL == b){
         return;
     }
     bst_inorder(b->left, f);
     f(b->key);
     bst_inorder(b->right,f); 

 }

int bst_search(bst b, char *str){
    if(b->key ==NULL){
        return 1;
    }
    if(strcmp(str, b->key)==0){
        return 0;
    }
    if(strcmp(str, b->key)<=0){
        return bst_search(b->left, str);
    }
    else if(strcmp(str, b->key)>=0){
       return bst_search(b->right, str);
    }
    return 1;
}

