#include <stdio.h>

int main()
{
     int a; //Declaraci�n de variable entera de tipo entero
     int *puntero; //Declaraci�n de variable puntero de tipo entero
     puntero = &a; //Asignaci�n de la direcci�n memoria de a
     printf("ingresa valor a mostrar:");
     scanf("%d",&a);

     printf("El valor de a es: %d. \nEl valor de *puntero es: %d. \n",a,*puntero);
     printf("La direcci�n de memoria de *puntero es: %p",puntero);

     return 0;
}
