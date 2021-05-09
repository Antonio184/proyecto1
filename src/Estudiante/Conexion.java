
package Estudiante;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Conexion {
    
    private final String servidor = "jdbc:mysql://127.0.0.1:3306/bd_estudiante";
    private final String usuario = "root";
    private final String clave = "";
    private final String driverConector = "com.mysql.jdbc.Driver";
    private static Connection conexion;


} 
