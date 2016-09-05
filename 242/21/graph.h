#ifndef GRAPH_H
#define GRAPH_H_
#include <stdio.h>
typedef struct graphrec *graph;
typedef struct vertexrec *vertex;
typedef enum {UNVISITED, VISITED_SELF, VISITED_DESCENDANTS} state_t;
extern graph graph_new(int capacity);
extern graph graph_free(graph g);
extern void graph_add_directed(graph g,int u,int v);
extern void graph_add_undirected(graph g,int u,int v);
extern void graph_print(graph g);
extern void graph_bfs(graph g, int source);
#endif
