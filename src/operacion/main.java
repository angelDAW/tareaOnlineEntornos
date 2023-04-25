/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;

/**
 *
 * @author angel
 */

/**
 *comentario que implica un cambio para gitHub
 * 
 */

/**
 *comentario que implica otro cambio para gitHub
 * 
 */

/**
 * Clase principal del proyecto que contiene el método main, el cual es el punto de entrada del programa.
 * Permite realizar operaciones aritméticas básicas (suma, resta, multiplicación y división) mediante un menú de opciones.
 * Las operaciones se realizan a través de los métodos de la clase "operaciones".
 * @see operaciones
 */
public class main {
    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
     /**
     * Método principal que inicia la ejecución del programa.
     * Muestra un menú con diferentes opciones para realizar operaciones aritméticas básicas.
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
       int opcion;
        do {
           operaciones.menu();
           opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    operaciones.sumando(); // llamar al método sumando
                    break;
                case 2:
                    operaciones.restar(); // llamar al método restar
                    break;
                case 3:
                    operaciones.multiplicar(); // llamar al método multiplicar
                    break;
                case 4:
                    operaciones.dividir(); // llamar al método dividir
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }
        } while (opcion != 5);
    }
}
