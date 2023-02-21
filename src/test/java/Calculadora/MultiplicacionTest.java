/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Makaia
 */
public class MultiplicacionTest {
    
    public MultiplicacionTest() {
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double a = 2.0;
        double b = 3.0;
        Multiplicacion instance = new Multiplicacion();
        double expResult = 6.0;
        double result = instance.multiplicar(a, b);
        assertEquals(expResult, result, 0);
    }
    
}
