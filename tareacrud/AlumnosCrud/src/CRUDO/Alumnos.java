package CRUDO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import org.mariadb.jdbc.Statement;

public class Alumnos {
	int codigo;
	String carrera;
	String nombre;
	String apellido;
	String nota1;
	String nota2;
	String nota3;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNota1() {
		return nota1;
	}
	public void setNota1(String string) {
		this.nota1 = string;
	}
	public String getNota2() {
		return nota2;
	}
	public void setNota2(String string) {
		this.nota2 = string;
	}
	public String getNota3() {
		return nota3;
	}
	public void setNota3(String string) {
		this.nota3 = string;
	}
	
	public void InsertarAlumno(JTextField paramCarrera, JTextField paramNombre, JTextField paramApellido, JTextField paramNota1, JTextField paramNota2, JTextField paramNota3 ) {
		
		setCarrera(paramCarrera.getText());
		setNombre(paramNombre.getText());
		setApellido(paramApellido.getText());
		setNota1(paramNota1.getText());
		setNota2(paramNota2.getText());
		setNota3(paramNota3.getText());
		
		
		conexion objetoConexion = new conexion();
		String consulta = "INSERT INTO `alumnos`.`datosalumnos` (`CarreraAlumno`, `nombreAlumno`, `ApellidoAlumno`, `nota1`, `nota2`, `nota3`) VALUES (?, ?, ?, ?, ?, ?);";
		
		try {
			PreparedStatement cs = objetoConexion.estableceConexion().prepareStatement(consulta);
			
			cs.setString(1, getCarrera());
			cs.setString(2, getNombre());
			cs.setString(3, getApellido());
			cs.setString(4, getNota1());
			cs.setString(5, getNota2());
			cs.setString(6, getNota3());
			
			cs.execute();
			
			JOptionPane.showMessageDialog(null, "se inserto correctamente");
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error no se inserto:"+e.toString());
		}
	}

	public void MostrarAlumnos(JTable paramTablaTotalAlumnos) {
		//if (paramTablaTotalAlumnos == null) {
	   //     System.out.println("El objeto paramTablaTotalAlumnos es nulo");
	   //     return;
	    //}
		
		conexion ObjetoConexion = new conexion();
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		TableRowSorter<TableModel> OrdenarTabla= new TableRowSorter<TableModel>(modelo);
		
		paramTablaTotalAlumnos.setRowSorter(OrdenarTabla);
		
		String sql="";
		
		modelo.addColumn("id");
		modelo.addColumn("carrera");
		modelo.addColumn("nombre");
		modelo.addColumn("apellido");
		modelo.addColumn("nota 1");
		modelo.addColumn("nota 2");
		modelo.addColumn("nota 3");
		
		paramTablaTotalAlumnos.setModel(modelo);
		
		sql ="SELECT * FROM `datosalumnos`;";
		
		String[] datos = new String[7];
		Statement st;
		
		try {
			st= (Statement) ObjetoConexion.estableceConexion().createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				datos[0]=rs.getString(1);
				datos[1]=rs.getString(2);
				datos[2]=rs.getString(3);
				datos[3]=rs.getString(4);
				datos[4]=rs.getString(5);
				datos[5]=rs.getString(6);
				datos[6]=rs.getString(7);
				
				modelo.addRow(datos);
				
			}
			paramTablaTotalAlumnos.setModel(modelo);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se muestra:"+e.toString());
			
		}
		
		
	}
	
	public void SeleccionarAlumno(JTable paramTablaAlumnos,JTextField paramId, JTextField paramCarrera, JTextField paramNombre, JTextField paramApellido, JTextField paramNota1, JTextField paramNota2, JTextField paramNota3) {
	
		try {
			int fila = paramTablaAlumnos.getSelectedRow();
			
			if (fila>=0) {
				
				paramId.setText(( paramTablaAlumnos.getValueAt(fila, 0).toString()));
				paramCarrera.setText(( paramTablaAlumnos.getValueAt(fila, 1).toString()));
				paramNombre.setText(( paramTablaAlumnos.getValueAt(fila, 2).toString()));
				paramApellido.setText(( paramTablaAlumnos.getValueAt(fila, 3).toString()));
				paramNota1.setText(( paramTablaAlumnos.getValueAt(fila, 4).toString()));
				paramNota2.setText(( paramTablaAlumnos.getValueAt(fila, 5).toString()));
				paramNota3.setText(( paramTablaAlumnos.getValueAt(fila, 6).toString()));
			}
			else {
				JOptionPane.showMessageDialog(null, "nada seleccionado");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error:"+ e.toString());
		}
	}
	
	public void ModificarAlumnos (JTextField paramId,JTextField paramCarrera, JTextField paramNombre, JTextField paramApellido, JTextField paramNota1, JTextField paramNota2, JTextField paramNota3) {
		
		setCodigo(Integer.parseInt(paramId.getText()));
		setCarrera(paramCarrera.getText());
		setNombre(paramNombre.getText());
		setApellido(paramApellido.getText());
		setNota1(paramNota1.getText());
		setNota2(paramNota2.getText());
		setNota3(paramNota3.getText());
		
		conexion objetoConexion = new conexion();
		String consulta = "UPDATE datosalumnos SET datosalumnos.carreraAlumno = ?, datosalumnos.nombreAlumno = ?, datosalumnos.apellidoAlumno = ?, datosalumnos.nota1 = ?, datosalumnos.nota2 = ?, datosalumnos.nota3 = ? WHERE datosalumnos.idAlumno=?;";
	
	try {
		PreparedStatement cs = objetoConexion.estableceConexion().prepareStatement(consulta);
		
		cs.setString(1, getCarrera());
		cs.setString(2, getNombre());
		cs.setString(3, getApellido());
		cs.setString(4, getNota1());
		cs.setString(5, getNota2());
		cs.setString(6, getNota3());
		cs.setInt(7, getCodigo());
		
		cs.execute();
		
		JOptionPane.showMessageDialog(null, "modificacion Exitosa");
		
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null, "error al modificar:"+e.toString());
	    
	}
	
	}
	public void EliminarAlumnos (JTextField paramCodigo) {
		
		setCodigo(Integer.parseInt(paramCodigo.getText()));
		
	conexion objetoConexion = new conexion();
	
	String consulta = "DELETE FROM datosalumnos WHERE datosalumnos.idAlumno=?;";
	
	try {
		PreparedStatement cs = objetoConexion.estableceConexion().prepareStatement(consulta);
		cs.setInt(1, getCodigo());
		cs.execute();
		JOptionPane.showMessageDialog(null, "eliminado");
		
	
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null, "error:"+e.toString());
	}
	}

}
