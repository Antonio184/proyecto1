
package proyecto1.pkg1;


public class Estudiante {
    
    private final String servidor = "jdbc:mysql://127.0.0.2:3306/bd_estudiante";
    private final String usuario = "admin";
    private final String clave = "admin";
    private final String driver = "com.mysql.jbdc.Driver";
    private static Connection conexion;
    
    //soy Adonay
 
     }
    public Connection getConnection(){
        return conexion;
    }
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos) {
        Conexion conectar = new Conexion();
        Connection cx = conectar.getConnection();
        try{
            String sqlQueryStmt = "INSERT INTO " + tabla + " (" + camposTabla + " ) VALUES (" + valoresCampos + " ): ";
            Statement stmt;
            stmt = cx.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            stmt.close();
            cx.close();
            System.out.println("Registro guardado correctamente:");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

}
