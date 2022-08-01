#include <stdio.h>

int main()
{

int *puntero[5]; //array de puntero
int a[5][5]; //Array bidimensional.
int i;
for (i=0;i<5;i++){
printf("colocar array:");
scanf("%d",&puntero[i]);
    puntero[i]=&a[i][i]; //Asignamos las filas al puntero.
}
}
