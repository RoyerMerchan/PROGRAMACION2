#include <stdio.h>

int main()
{

int array[10]={0,2,3,5,5,6,7,8,9,0}; //Declarar e inicializar un arreglo.
int *puntero = &array[0]; //Le damos la dirección de inicio del arreglo
int i; //variable contadora...

for (i=0;i<10;i++)
printf("%d\n",*(puntero+i)); //imprimimos los valores del puntero que es equivalente a imprimir los valores del arreglo.

return 0;

}
