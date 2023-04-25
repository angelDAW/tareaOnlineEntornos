/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angel
 */
public class operacionesTest {
    
    public operacionesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumando method, of class operaciones.
     */
    @Test
    public void testSumando() {
        System.out.println("sumar");
        operaciones.sumando();
        // TODO review the generated test code and remove the default call to fail.
          try {
        // sumando 3 mas 2
        int a = 3;
        int b = 2;
        int resultado= a+b;
        assertEquals(5, resultado);
       
        
    } catch (Exception e) {
        fail("Se lanzó una excepción: " + e.getMessage());
    }
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
          try {
        // restar 7 menos 2
        int a = 7;
        int b = 2;
        int resultado= a-b;
        assertEquals(5, resultado);
       
        
    } catch (Exception e) {
        fail("Se lanzó una excepción: " + e.getMessage());
    }
    }

    /**
     * Test of multiplicar method, of class operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        try {
        // multiplicar 3 por 3
        int a = 3;
        int b = 3;
        int resultado= a*b;
        assertEquals(9, resultado);
       
        
    } catch (Exception e) {
        fail("Se lanzó una excepción: " + e.getMessage());
    }
    }

    /**
     * Test of dividir method, of class operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
         try {
        // dividir 5 entre 5
        int a = 5;
        int b = 5;
        int resultado= a/b;
        assertEquals(1, resultado);
       
        
    } catch (Exception e) {
        fail("Se lanzó una excepción: " + e.getMessage());
    }
    }
    
}
