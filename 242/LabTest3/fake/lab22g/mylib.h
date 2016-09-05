#ifndef MYLIB_H_
#define MYLIB_H_
#include <stddef.h>

int getword(char *s, int limit, FILE *stream);
void *emalloc(size_t);
#endif
