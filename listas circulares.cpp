#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<winsock.h>
#include<locale.h>

void clrscr();


struct lista
{
	int info;
	struct lista *sig,*ant;
}*CAB=NULL,*AUX=NULL,*P=NULL,*FD=NULL,*QD=NULL,*Fd=NULL,*Qd=NULL;

int main()
{
	setlocale(LC_CTYPE, "Spanish");
	void insertard(void);
	void extraerd(void);
	void visualizard(void);
	void visualizari(void);
	void eliminardespues();
	void eliminarantes();

	char opc;
	do{
		clrscr();
		printf("____________________________________________________\n");
		printf("|_¡¡¡MENU DE LISTA CIRCULAR DOBLEMENTE ENLAZADA!!!__|\n");
		printf("|___________________________________________________|\n");
		printf("|___________________________________________________|\n");
		printf("|___________SELECCIONE UNA OPCION___________________|\n");
		printf("|___________________________________________________|\n");
		printf("|___________________________________________________|\n");
		printf("|_________1) INSERTAR_______________________________|\n");
		printf("|_________2) VISUALIZAR ASCENDENTE__________________|\n");
		printf("|_________3) VISUALIZAR DESCENDENTE_________________|\n");
		printf("|_________4) INGRESAR Y ELIMINAR SIGUIENTE__________|\n");
		printf("|_________5) INGRESAR Y ELIMINAR ANTERIOR___________|\n");
		printf("|_________6) SALIR__________________________________|\n");
		printf("|___________________________________________________|\n");
		opc=getch();
		switch(opc)
		{
		case '1':
			insertard();
			break;
		case '2':
			visualizard();
			break;
		case '3':
			visualizari();
			break;
		case '4':
			eliminardespues();
			break;
			case'5':
				eliminarantes();
				break;
		}

	}while(opc!='6');
	getch();
	return 0;
}

void insertard(void)
{
	P=CAB;
	AUX=(struct lista *)malloc(sizeof(struct lista));
	clrscr();
	printf("INGRESE UN NUMERO ENTERO: ");
	scanf("%d",&AUX->info);
	AUX->sig=CAB;
	AUX->ant=CAB;
	if(CAB==NULL){
		CAB=AUX;
		P=AUX;
	}else{
		while(P->sig!=CAB){
			P=P->sig;
		}
	}
	P->sig=AUX;
	AUX->ant=P;
	CAB->ant=AUX;
}

void eliminardespues(){
	int x;
	clrscr();
	printf("INGRESE UN NUMERO PARA ELIMINAR EL SIGUIENTE: ");
	scanf("%d",&x);

	FD=CAB;
	QD=CAB;
	while(FD->info!=x&&FD->sig!=CAB){
		FD=FD->sig;
	}
	QD=FD->sig;
	if(FD->sig==CAB&&FD->info==x){
		printf("\nES LA CABECERA! NO SE PUEDE ELIMINAR");
	}else
	   if(FD->sig==CAB&&FD->info!=x){
		printf("\nEL NUMERO INGRESADO NO SE ENCUENTRA EN LA LISTA");
	}else{
		   FD->sig=QD->sig;
		   (QD->sig)->ant=FD;
		   printf("\nELIMINADO %d",QD->info);
		   free(QD);
	   }
	   getch();
}

void eliminarantes()
{
	int xd;
	clrscr();
	printf("INGRESE UN NUMERO PARA ELIMINAR EL ANTERIOR: ");
	scanf("%d",&xd);

	Fd=CAB;
	Qd=CAB;
	while(Fd->info!=xd){
		Fd=Fd->ant;
	} Qd=Fd->ant;

	if(Fd==CAB){
		printf("\nES LA CABECERA! NO SE PUEDE ELIMINAR");
	}else{
		if(Qd==CAB){
			CAB=CAB->sig;
			Fd->ant=Qd->ant;
			(Fd->ant)->sig=Fd;
			printf("\nELIMINADO %d",Qd->info);
		}else{
			Fd->ant=Qd->ant;
			(Qd->ant)->sig=Fd;
			printf("\nELIMINADO %d",Qd->info);
		}
		free(Qd);
	}
	getch();
}

void visualizard(void)
{
	clrscr();
	if(CAB==NULL){
		printf("LISTA VACIA");
		getchar();
	}
	AUX=CAB;
	printf("LISTA:\n\n");
	while(AUX->sig!=CAB){
		printf("->%d\n",AUX->info);
		AUX=AUX->sig;
	}
	if(AUX->sig==CAB){
		printf("->%d\n",AUX->info);
	}
	getch();
}

void visualizari(void)
{
	clrscr();
	if(CAB==NULL){
		printf("LISTA VACIA");
		getchar();
	}
	AUX=CAB->ant;
	printf("LISTA:\n");
	do{
		printf("->%d\n",AUX->info);
		AUX=AUX->ant;
	}while(AUX->sig!=CAB);
	getch();
}
void clrscr()
{
	HANDLE hStdOut = GetStdHandle(STD_OUTPUT_HANDLE);
	COORD coord = {0, 0};
	DWORD count;
	CONSOLE_SCREEN_BUFFER_INFO csbi;
	GetConsoleScreenBufferInfo(hStdOut, &csbi);
	FillConsoleOutputCharacter(hStdOut, ' ', csbi.dwSize.X * csbi.dwSize.Y, coord, &count);
	SetConsoleCursorPosition(hStdOut, coord);
}
