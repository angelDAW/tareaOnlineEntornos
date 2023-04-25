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
 * Clase que contiene los métodos para realizar operaciones aritméticas básicas.
 * Los métodos pueden ser llamados desde la clase "main".
 * @see main
 */
public class operaciones {
    static Scanner leer = new Scanner(System.in);
   
    
    public static void menu(){
     System.out.println("-----CALCULADORA-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("---------------------");
            System.out.println("Selecciona una opción:");
            
    
    }
    
    
   /**
     * Método que realiza la suma de dos números enteros introducidos por el usuario.
     * Imprime el resultado de la suma en consola.
     */ 
    public static void sumando(){
    System.out.println("introducle el primer operador: ");
    int a = leer.nextInt();
    System.out.println("introducle el segundo operador: ");
    int b = leer.nextInt();
    int rSuma= a+b;
    System.out.println("el reusultado de "+a+" y "+b+" es :"+rSuma);
    leer.close();
    }
    /**
     * Método que realiza la resta de dos números enteros introducidos por el usuario.
     * Imprime el resultado de la resta en consola.
     */
    public static void restar(){
    System.out.println("introducle el primer operador: ");
    int a = leer.nextInt();
    System.out.println("introducle el segundo operador: ");
    int b = leer.nextInt();
    int rResta= a-b;
    System.out.println("el reusultado de "+a+" y "+b+" es :"+rResta);
    leer.close();
    }
    /**
 * Método que realiza la multiplicación de dos números enteros introducidos por el usuario.
 * Imprime el resultado por consola.
 * Si alguno de los operadores es cero, el resultado será cero.
 * Si alguno de los operadores es negativo, el resultado será negativo.
 */
    public static void multiplicar(){
    System.out.println("introducle el primer operador: ");
    int a = leer.nextInt();
    System.out.println("introducle el segundo operador: ");
    int b = leer.nextInt();
    int rultiplicacion= a*b;
    System.out.println("el reusultado de "+a+" y "+b+" es :"+rultiplicacion);
    leer.close();
    }
    /**
 * Método que realiza la división de dos números enteros introducidos por el usuario.
 * Imprime el resultado por consola.
 * Si el segundo operador es cero, lanzará una excepción ArithmeticException indicando que la división entre cero no está definida.
 * Si alguno de los operadores es negativo, el resultado será negativo.
 */
    public static void dividir(){
    System.out.println("introducle el primer operador: ");
    int a = leer.nextInt();
    System.out.println("introducle el segundo operador: ");
    int b = leer.nextInt();
    int rDivision= a/b;
    System.out.println("el reusultado de "+a+" y "+b+" es :"+rDivision);
    leer.close();
    }
    
    
}

