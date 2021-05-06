/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg1;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Proyecto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
        //las pruebas de commit se eliminaron
        throws SQLException {
        desplegarMenu();
    }

    private static void desplegarMenu() {
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
        System.out.println("Seleccionar opcion: ");
        menu = sc.next();
        
    }

}
