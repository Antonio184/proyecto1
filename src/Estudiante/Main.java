package Estudiante;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
        throws SQLException {
        desplegarMenu(); 
        
    }
        public static void desplegarMenu() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String menu;
        
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("|                       OPCIONES                          |");
        System.out.println("|-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|");
        System.out.println("|                                                         |");
        System.out.println("|                 1. Crear  registros                     |");
        System.out.println("|                 2. Consultar registros                  |");
        System.out.println("|                 3. Actualizar registros                 |");
        System.out.println("|                 4. Eliminar registros                   |");
        System.out.println("|                 5. Salir                                |");
        System.out.println("|                                                         |");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Seleccionar opcion: ");
        menu = sc.next();
   
}
    }
