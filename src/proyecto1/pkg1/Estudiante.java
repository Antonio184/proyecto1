/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg1;

/**
 *
 * @author manto
 */
public class Estudiante {
    
    private final String servidor = "jdbc:mysql://127.0.0.2:3306/bd_estudiante";
    private final String usuario = "admin";
    private final String clave = "admin";
    private final String driver = "com.mysql.jbdc.Driver";
    private static Connection conexion;
}
