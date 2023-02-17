
public class Uso_Moto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto Moto1 = new Moto();
		
		Moto1.establecerColor("verde");
		
		Moto1.establecerModelo("Arsen II");
		
		Moto1.establecerMarca("Empire Kewayy");
		
		Moto1.configuraFrenos("si");
		
		system.out.println(Moto1.DimeDatosGenerales() +""+ Moto1.dimeColor() + Moto1.precioTotal() 
		+ Moto1.dimeModelo + Moto1.dimeMarca());

	}

}
