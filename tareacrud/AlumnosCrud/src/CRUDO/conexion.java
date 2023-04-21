package CRUDO;

import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
	
	Connection conectar = null;
	
	String usuario = "root";
	String contrasenia = "Alejo.17";
	String bd ="alumnos";
	String ip = "localhost";
	String puerto =	"3306";

	String cadena = "jdbc:mariadb://"+ip+":"+puerto+"/"+bd;
	
	public Connection estableceConexion() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
			JOptionPane.showMessageDialog(null, "la conexion ha sido exitosa");
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al conectar"+e.toString());
		}
		return conectar;
		
	}
	

}
