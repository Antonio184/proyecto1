
package proyecto1.pkg1;


public class Estudiante {
    
    private final String servidor = "jdbc:mysql://127.0.0.2:3306/bd_estudiante";
    private final String usuario = "admin";
    private final String clave = "admin";
    private final String driver = "com.mysql.jbdc.Driver";
    private static Connection conexion;
    
    //soy Carmen
 
    public Conexion() {​​​​​​​
        try{​​​​​​​
               Class.forName(driver);
               conexion=DriverManager.getConnection(servidor, usuario, clave);
        }​​​​​​​ catch (ClassNotFoundException | SQLException e) {​​​​​​​
            System.out.println("Conexion fallida: Error: " + e.getMessage());
        }​​​​​​​

}
