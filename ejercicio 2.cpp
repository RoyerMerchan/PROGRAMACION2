#include <stdio.h>

int main()
{
     int a; //Declaración de variable entera de tipo entero
     int *puntero; //Declaración de variable puntero de tipo entero
     puntero = &a; //Asignación de la dirección memoria de a
     printf("ingresa valor a mostrar:");
     scanf("%d",&a);

     printf("El valor de a es: %d. \nEl valor de *puntero es: %d. \n",a,*puntero);
     printf("La dirección de memoria de *puntero es: %p",puntero);

     return 0;
}
