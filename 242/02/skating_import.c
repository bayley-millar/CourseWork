/**skating import.c
 *Bayley Millar
 *Lab2
 */
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void){
    double n;
    double a;
    double b;
    double c;
    double highestScore;
    double winningCompetitor;
    double tempScore;
    double tempCompetitor;
    
    fflush(stdout);
    while(4 == scanf("%lg %lg %lg %lg", &n, &a, &b, &c)){
            tempScore = ("%f", ((a + b + c)/3));
            tempCompetitor = ("%f" , n);
            if(tempScore > highestScore){
                highestScore = tempScore;
                winningCompetitor = tempCompetitor;
            }
           
        }
    printf("%f %f \n", highestScore, winningCompetitor);
    return EXIT_SUCCESS;
}
