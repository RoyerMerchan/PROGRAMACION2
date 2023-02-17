
public class Moto {

	private int ruedas;
	
	private int motor;
	
	private string modelo;
	
	private string marca;
	
	private string color;
	
	private int peso;
	
	private int tanque;
	
	private boolean FrenosHidraulicos;


public Camion() {
	
	ruedas= 2;
	motor= 600;
	tanque= 25;
	peso= 250;
	
}

public string DimeDatosGenerales() {
	return "la moto tiene "+ ruedas+
	" ruedas"+" su motor es "+ motor+ 
	", su tanque de gasolina puede ocupar" + tanque+ 
	"litros.";
}
public void establecerColor(string colorMoto) {
	
color = colorMoto;
}
public void establecerModelo(string modeloMoto) {
	
modelo = modeloMoto;
}
public void establecerMarca(string marcaMoto) {
	
marca = marcaMoto;
}
public String dimeColor() {
	return "el color de la moto es " +color;}
	
public String dimeModelo() {
return "el modelo es " +modelo;}
		
public String dimeMarca() {
return "La marca es" +marca;}
	
}
public void configuraFrenos(String FrenosHidraulicos) {
	if(FrenosHidraulicos.equalsIgnoreCase("si")) {
		this.FrenosHidraulicos= true;
}else {
		this.FrenosHidraulicos= false;
}
}
public string dimeFrenosHidraulicos() {

	if(FrenosHidraulicos== true) {
		return "Tiene frenos hidraulicos";
	}	else {
		return "Tiene frenos de disco";
	}
}
public int precioTotal() {
	
	int precioFinal =1000;
	
	if(FrenosHidraulicos) {
	precioFinal+=200;
	}
}
}
