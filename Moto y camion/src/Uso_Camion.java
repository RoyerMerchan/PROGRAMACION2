
public static void main(string[] args) {
	Camion Camion1 = new Camion();
	
	Camion1.establecerColor("azul");
	
	Camion1.configuraCargamento1("no");
	
	system.out.println(Camion1.DimeDatosGenerales() +""+ Camion1.dimeColor() + Camion1.precioTotal());

}}
