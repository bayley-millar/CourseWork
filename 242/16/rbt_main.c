#include <stdio.h>
#include <stdlib.h>
#include "mylib.h"
#include "rbt.h"
void print_key(char *s,char *c) {
    printf("%s %s\n", c, s);
}
int main(void) {
    rbt r = rbt_new(18143);
    char word[256];
    while (getword(word, sizeof word, stdin) != EOF) {
        r = rbt_insert(r, word);
    }
    rbt_preorder(r, print_key);
    /*rbt_inorder(r, print_key);*/
    rbt_free(r);
    return EXIT_SUCCESS;
}
