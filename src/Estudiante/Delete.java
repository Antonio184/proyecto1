
package Estudiante;
import java.sql.SQLException;
import java.util.Scanner;


public class Delete {
    Delete() throws SQLException {
        Scanner sc = new Scanner(System.in);
        Conexion utilerias = new Conexion();
        System.out.println("<< ELIMINAR REGISTROS >> ");
        
        System.out.println("Ingresar el id del registro: ");
        String idContactoEliminar = sc.next();
        
        String tabla = "tb_estudiante";
        String campos = "*";
        String condicion = "id_estudiante = " + idContactoEliminar;
        utilerias.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("Presionar << Y >> para confirmar: ");
        String confirmarBorrar = sc.next();
        
        if("Y".equals(confirmarBorrar)) {
            String valoresCamposNuevos = "";
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("Registro borrado satisfactoriamente!!!");
        } 
        Main.desplegarMenu();
    }
}
