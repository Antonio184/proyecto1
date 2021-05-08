/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg1;

import java.sql.SQLException;
import java.util.Scanner;


public class Proyecto11 {

    
    public static void main(String[] args) 
      
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
        
    

    
    //Despliegue del menu
        switch (menu) {
            case "1":
                //create create = new create();
                break;
            case "2":
                //read read  = new Read();
                break;
            case "3":
                //Update update = new update();
                break;
            case "4":
                //delete delete = new delete();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Selecion Invalida");
        }
}
}
