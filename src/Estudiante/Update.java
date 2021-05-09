
package Estudiante;

import java.sql.SQLException;
import java.util.Scanner;


public class Update {

    Update() throws SQLException {
        Scanner sc = new Scanner(System.in);
        Est person = new Est();
        Conexion utilerias = new Conexion();
        System.out.println("<< ACTUALIZA REGISTROS >>");

        System.out.println("Ingresar id del registro a modificar: ");
        person.setIdEstudiante(sc.nextInt());

        String tablaBuscar = "tb_estudiante";
        String camposBuscar = "id_estudiante, nom_estudiante, ape_estudiante, carnet_estudiante, edad_estudiante";
        String condicionBuscar = "id_estudiante = " + person.getIdEstudiante();
        utilerias.desplegarRegistros(tablaBuscar, camposBuscar, condicionBuscar);

        System.out.println("Nombre: ");
        person.setNomEstudiante(sc.next());

        System.out.println("Apellidos: ");
        person.setApeEstudiante(sc.next());

        System.out.println("Carnet: ");
        person.setCarnetEstudiante(sc.next());
        
        System.out.println("Edad: ");
        person.setEdadEstudiante(sc.nextInt());

        String tabla = "tb_estudiante";
        String camposValoresNuevos = "nom_estudiante = '" + person.getNomEstudiante() + "', ape_estudiante = '" + person.getApeEstudiante() + "', carnet_estudiante = '" + person.getCarnetEstudiante() + "', edad_estudiante = " + person.getEdadEstudiante();

        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("Modificado correctamente!");

        Main.desplegarMenu();

    }
}

