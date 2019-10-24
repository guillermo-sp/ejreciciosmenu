/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomenu;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class EjercicioMenu {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) {
        // TODO code application logic here
       do{
        System.out.println("Bienbenido al menu Guillermotronix");
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Opcion 4");
        System.out.println("Opcion 5");
        System.out.println("Introduce la opcion deseada");
        opcion = teclado.nextInt();
           switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la primera opcion");
                break;
            case 2:
                System.out.println("Has seleccionado la segunda opcion");
                break;
            case 3:
                System.out.println("Has seleccionado la tercera opcion");
                break;
            case 4:
                System.out.println("Has seleccionado la cuartaa opcion");
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion incorrecta");

        } 
       }while(opcion!=5);

    }

}
