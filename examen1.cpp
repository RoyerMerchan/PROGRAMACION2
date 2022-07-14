#include<stdio.h>
#include<conio.h>
#include<math.h>

void ecuacion();
void volumen();
void movimiento();
int opcion;

int main(){

	printf("tenemos las siguientes opciones:\n1. polinomio de segundo grado \n2.Volumen de una esfera \n3.Calculo del MRUV");
	scanf("%d",&opcion);

	switch(opcion){
		case 1:
			ecuacion();
		break;
		case 2:
			volumen();
		break;
		case 3:
			movimiento();
		break;
	}
	return 0;
}


void ecuacion(){
	float a,b,c,x1,x2;

	  printf("valor de a: ");
	  scanf("%f",&a);
	  printf("valor de b: ");
	  scanf("%f",&b);
	  printf("valor de c: ");
	  scanf("%f",&c);

        x1=(-b+sqrt((b*b)-(4*a*c)))/(2*a);
	    x2=(-b-sqrt((b*b)-(4*a*c)))/(2*a);

		printf ("El resultado de x1 es: %f", x1);
		printf ("El resultado de x2 es: %f", x2);

}

void volumen(){
	float v,r,pi;

	pi = 3.1416;

	printf("Digite el valor del radio: ");
	scanf("%f",&r);

		v=(1.33333)*pi*(r*r*r);
		printf("el volumen de la esfera es\nv: %f",v);

}

void movimiento(){
	float mov,xi,v,acc,t;

	printf("Ingrese el desplazamiento : ");
	scanf("%f",&xi);
	printf("Ingrese la velocidad : ");
	scanf("%f",&v);
	printf("Ingrese la aceleracion : ");
	scanf("%f",&acc);
	printf("Ingrese el tiempo de desplazamiento: ");
	scanf("%f",&t);

	mov=xi+v+((acc*pow(t,2))/2);
	printf("el movimiento sera: \nmov: %f",mov);
}
