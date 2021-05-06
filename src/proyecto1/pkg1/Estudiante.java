
package proyecto1.pkg1;


public class Estudiante {
    
    private final String servidor = "jdbc:mysql://127.0.0.2:3306/bd_estudiante";
    private final String usuario = "admin";
    private final String clave = "admin";
    private final String driver = "com.mysql.jbdc.Driver";
    private static Connection conexion;
}
