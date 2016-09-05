/********************************************************************
Practical test 3:
practice 
 ********************************************************************/
htable htable_new(int capacity){
    int i;
    htable r = emalloc(sizeof *r);
    r->capacity = capacity;
    r->num_keys = 0;
    r->keys = emalloc(r->capacity *sizeof (char*));
    for(i=0; i < r->capacity ; i++){
        r->keys[i] = NULL;
    }
    return r;
}

htable htable_new(int capacity){
    int i;
    htable r = emalloc(sizeof *r);
    r->capacity = capacity;
    r->num_keys = 0;
    r->keys = emalloc(r->capacity *sizeof (char*));
    for(i =0;i < r->capacity; i++){
        r->keys[i] = NULL;
    }
    return r;
}

htable htable_new(int capacity){
    int i;
    htable r = emalloc(sizeof *r);
    r->capacity = capacity;
    r->num_keys = 0;
    r->keys = emalloc(r->capacity *sizeof (char));
    for(i = 0; i < r->capacity; i++){
        r->key[i] = NULL;
    }
    return r;
}

htable htable_new(int capacity){
    int i;
    htable r = emalloc(sizeof *r);
    r->capacity = capacity;
    r->num_keys = 0;
    r->keys = emalloc(r->capacity *sizeof (char*));
    for(i = 0;i < r->capacity; i++){
        r->keys[i] = NULL;
    }
    return r;
}

void htable_free(htable h){
    int i;
    for(i = 0; i < h->capacity;i++){
        if(h->keys[i] != NULL){
            free(h->keys[i]);
        }
    }
    free(h->keys);
    free(h);
}

void htable_free(htable h){
    int i;
    for(i = 0; i < h->capacity;i++){
        if(h->keys[i] != NULL){
            free(h->keys[i]);
        }
    }
    free(h->keys);
    free(h);
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
        if(h->key[i] == NULL){
            h->key[i] = emalloc(sizeof str[0]*(strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(!strcpy(h->keys[i], str)){
            break;
        }
        i = (i+1)%h->capacity;
    }while(i != x);
}


void htable_insert(htable h, char *str){
    int i = htable_word_to_int(str) % h->capacity;
    int x;
    do{
        if(h->keys[i] == NULL){
            h->keys[i] = emalloc(sizeof str[0] * (strlen(str)+1));
            strcpy(h->keys[i],str);
            break;
        }else if(!strcmp(h->key[i], str)){
            break;
        }
        i = (i+1) % h->capacity;
    }while(i != x);
}

void htable_insert(htable h, char *str){
    int i = htable_word_to_int(str) % h->capacity;
    int x;
    do{
        if(h->keys == NULL){
            h->keys[i] = emalloc(sizeof str[0] * (strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(strcmp(h->keys[i], str)){
            break;
        }
        i = (i+1) % h->capacity;
    }while(i != x);
}

void htable_insert(htable h, char *str){
    int i = htable_word_to_int(str) % h->capacity;
    int x;
    do{
        if(h->keys[i] == NULL){
            h->keys[i] = emalloc(sizeof str * (strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(strcmp(h->keys[i], str)){
            break;
        }
        i = (i+1) % h->capacity;
    } while(x != i);
    
}


htable htable_new(int capacity) {
    int i;
    htable h = emalloc(sizeof *h);
    h->capacity = capacity;
    h->num_keys = 0;
    h->keys = emalloc(h->capacity * sizeof (char*));
    for(i = 0; i < h->capacity ; i++){
        h->keys[i] = NULL;
    }
    return h;
}

void htable_free(htable h) {
    int i;
    for(i = 0; i < h->capacity ; i++){
        if(h->keys[i] != NULL){
            free(h-keys[i]);
        }
    }
    free(h->keys);
    free(h);
}

int htable_insert(htable h, char *key) {
    int i = htable_word_to_int(str)% h->capacity;
    int x = i;
    do{
        if(h->keys[i] == NULL){
            h->keys[i] = emalloc(sizeof str[0] * (strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(!strcmp(h->keys[i], str)){
            break;
        }
        i = (i+1) % h->capacity;
    }while(x != i);  
}

int htable_insert(htable h, char *key) {
    int i = htable_word_to_int(str) % h->capacity;
    int x = i;
    do{
        if(h->keys[i] == NULL){
            h->keys[i] = emalloc(sizeof str[0] * (strlen(str)+1));
            strcpy(h->keys[i], str);
            break;
        }else if(!strcmp(h->keys[i], str)){
            break;
        }
        i = (i+1) % h->capacity;
    }while(i != x);
}
    
bst bst_insert(bst b, char *str){
    if(b == NULL){
        b = emalloc(sizeof(*b));
        b->left=b->right=NULL;
        b->key = emalloc((strlen(str)+1) *sizeof(str[0]));
        strcpy(b->key, str);
    }else if(strcmp(b->key, str)){
        if(strcmp(b->key, str) > 0){
            b->left = bst_insert(b->left, str);
        }else{
            b->right = bst_insert(b->right, str);
        }
    }
    return b;
            
}

bst bst_insert(bst b, char *str){
    if(b == NULL){
        b = emalloc(sizeof (*b));
        b->left = b->right = NULL;
        b-key = emalloc((strlen(str)+1) * sizeof str[0]);
    }else if(strcmp(b->key, str)){
        if(strcmp(b->key, str) > 0){
            b->left = bst_insert(b->left, str);
        }else{
            b->right = bst_insert(b->right, str);
        }
    }
    return b;
}

bst bst_insert(bst b, char *str){
    if(b == NULL){
        b = emalloc(sizeof (*b));
        b->left = b->right = NULL;
        b->key = emalloc((strlen(str)+1) * sizeof str[0]);
        strcpy(h->key, str);
    }else if(strcmp(h->key, str)){
        if(strcmp(h->key, str) > 0){
            b->left = bst_insert(b->left, str);
        }else{
            b->right = bst_insert(b->right, str);
        }
    }
    return b;
    
}

int bst_search(bst b, char *str){
    if(b == NULL) return 0;
    if(!strcmp(b->key, str)) return 1;
    else if(strcmp(b->key, str) > 0){
        return bst_search(b->left, str);
    }else{
        return bst_search(b->right, str);
    }
    
}

int bst_search(bst b, char *str){
    if(b == NULL)return 0;
    if(!strcmp(b->key, str))return 0;
    else if(strcmp(h->key, str)>0){
        return bst_search(b->left, str);
    }else{
        return bst_search(b->right, str);
    }
}

int bst_search(bst b, char *str){
    if(b == NULL)return 0;
    if(!strcmp(b->key, str))return 1;
    else if(strcmp(b->key, str)>0){
        return bst_search(b->left, str);
    }else{
        return bst_search(b->right, str);
    }
}

void bst_inorder(bst b, void f(char *str)){
    if(b==NULL)return;
    bst_inorder(b->left, f);
    f(b->key);
    bst_inorder(b->right, f);
}

void bst_inorder(bst b, void f(char *str)){
    if(b == NULL)return;
    bst_inorder(b->left, f);
    f(b->key);
    bst_inorder(b->right, f);
}

void bst_preorder(bst b, void f(char *str)){
    if(b == NULL)return;
    f(b->key);
    bst_preorder(b->left, f);
    bst_preorder(b->right, f);
    
}

void bst_preorder(bst b, void f(char *str)){
    if(b==NULL)return;
    f(b->key);
    bst_preorder(b->left, f);
    bst_preorder(b->right, f);
