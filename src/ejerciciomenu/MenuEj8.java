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
public class MenuEj8 {

    static Scanner teclado = new Scanner(System.in);
    static int num1, num2;
    static int opcion;
    static double resultado=0;

    public static void main(String[] args) {
        do {
            System.out.println("Bienbenido a la calculadora Guillermotronix");
            System.out.println("Introduce el numero 1");
            num1 = teclado.nextInt();
            System.out.println("Introduce el numero 2");
            num2 = teclado.nextInt();
            System.out.println("Opcion 1 suma");
            System.out.println("Opcion 2 resta ");
            System.out.println("Opcion 3 multiplicar");
            System.out.println("Opcion 4 dividir");
            System.out.println("Opcion 5 modulo");
            System.out.println("Opcion 6 salir");
            System.out.println("introduce la opcion deseada");
            opcion = teclado.nextInt();
            String operacion="";
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la primera opcion");
                    resultado = num1 + num2;
                    operacion = "suma";
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado la segunda opcion");
                    resultado = num1 - num2;
                    operacion = "resta";
                    
                    break;
                case 3:
                    System.out.println("Has seleccionado la tercera opcion");
                    resultado = num1 * num2;
                    operacion = "multiplicacion";
                    
                    break;
                case 4:
                    System.out.println("Has seleccionado la cuartaa opcion");
                    resultado = num1 / num2;
                    operacion = "division";
                   
                    break;
                case 5:
                    System.out.println("Has seleccionado la cuartaa opcion");
                    resultado = num1 % num2;
                    operacion = "modulo";                    
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
            if (opcion <6 && opcion>0){
                System.out.printf("La operacion de %s es : %.2f %n",operacion,resultado);
            }
            
            
        } while (opcion != 6);

    }

}
