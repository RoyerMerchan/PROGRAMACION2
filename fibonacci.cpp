#include<stdlib.h>
#include<stdio.h>

void suma(int a, int b, int n){

     int actual;
     printf("%d\n", b);
     if(n>1){
     actual=a+b;
     n--;
     suma(b, actual, n);
    }
}
int main(int argc, char *argv[]){
    suma(0, 1, 20);

return 0 ;
}


