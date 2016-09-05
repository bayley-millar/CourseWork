/**figure skating.c
 *Bayley Millar
 *Lab2
 */
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void) {
    double s1,s2,s3,result;
    double max = 0.0;

    int n,contestant=0;

    while(4==scanf("%d%lg%lg%lg" , &n, &s1, &s2, &s3)){

        if(s1 < s2 && s1 < s3){
            result= (s2+s3)/2;
        
        }else if (s2 < s1 && s2 <s3){
            result=(s1 + s3)/2;
        }else{
            result=(s1 + s2)/2;
        }
        if(max < result){
            max = result;
            contestant = n;
        
        }
    }
    printf("%d\n",contestant);
    return EXIT_SUCCESS;
}
    
