public class Camion {

	private int ruedas;
	
	private int carga;
	
	private int motor;
	
	private int tanque;
	
	private string color;
	
	private int tamaño;
	
	private int pesototal;
	
	private boolean cargamento1, cargamento2;
	
	


public Camion() {
	
	ruedas= 4;
	carga= 300;
	motor= 350;
	tanque= 100;
	pesototal= 1500;
	
}

public string DimeDatosGenerales() {
	return "el camion tiene "+ ruedas+
	" ruedas"+"tiene un cargamento de "+ carga+" kg"+"su motor es "+ motor+ 
	", su tanque de gasolina puede ocupar" + tanque+ 
	"litros, obteniendo un peso total de "+ pesototal+" kg.";
}
public void establecerColor(sting colorCamion) {
	
color = colorCamion;
}

public String dimeColor() {
	return "el color del camion es" +color;
	
}
public void configuraCargamento1(String cargamento1) {
	if(cargamento1.equalsIgnoreCase("si")) {
		this.cargamento1= true;
}else {
		this.cargamento1= false;
}
}
public string dimeCargamento1() {

	if(cargamento1 == true) {
		return "El cargamento contiene Comida";
	}	else {
		return "El cargamento no contiene nada";
	}
}
public int precioTotal() {
	
	int precioFinal =5000;
	
	if(cargamento1) {
	precioFinal+=1000;
	}
}

}	
	
	
	
