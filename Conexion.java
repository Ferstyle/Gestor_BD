import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo";
	private static final String USUARIO = "xxxxxx";
	private static final String CONTRASENIA = "xxxxxx";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		}catch (ClassNotFoundException e) {
			System.out.print("Error al cargar el controlador");
			e.printStackTrace();
			
}
	}
	
	public Connection conectar() {
	Connection conexion= null;
		try {
			
			
			conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
		
			System.out.println("Conexión OK");
		
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	
	}
}
