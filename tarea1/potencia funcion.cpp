#include <stdio.h>
#include <math.h>
void Datos();
float potencia(float(n), float(s));
float n1;
float n2;
int main(){
    Datos();
    printf("La potencia es: %f",potencia(n1, n2));
    return 0;
}

void Datos(){
    printf("Digite un numero y un exponente:\n");
    scanf("%f %f",&n1, &n2);
}

float potencia(float (n), float (s)){
    float resultado= pow(n1,n2);
    return resultado ;
}
