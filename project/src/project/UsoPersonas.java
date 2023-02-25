package project;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersonas {
	
	public static void main(String[] args) {
		
		Persona[] personas = new Persona[5];
	personas[0] = new Empleado("",1000,0,0,0);	
	personas[1] = new Empleado("",1500,0,0,0);
	personas[2] = new Empleado("",2200,0,0,0);
	personas[3] = new Empleado("",5000,0,0,0);
	personas[4] = new Empleado("",3400,0,0,0);
	
	for(Persona persona: personas) {
		System.out.println(persona.DameDescripcion());
	}
	}

}

abstract class Persona {
	
	String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}
	
	public String DameNombre() {
	
	return this.nombre;
		
}

	public abstract String DameDescripcion();

}

class Empleado extends Persona {
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1, dia);
		altaContrato = calendario.getTime();
}
	public String DameDescripcion() {
		return "el sueldo de este empleado es= "+sueldo;
	}
}

