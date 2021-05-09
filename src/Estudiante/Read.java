package Estudiante;

import java.sql.SQLException;

public class Read {
    public Read() throws SQLException {
        System.out.println("<< CONSULTA DE REGISTROS >>");
        mostrarResultados();
    }

    private void mostrarResultados() throws SQLException {
        try{
            Conexion utilerias = new Conexion();
            String tabla = "tb_estudiante";
            String camposTabla = "*";
            
            String condicionBusqueda = "";
            
            utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido el siguiente error: " + e.getMessage());
        } finally {
            Main.desplegarMenu();
        }
    }
}