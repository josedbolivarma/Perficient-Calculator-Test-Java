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
public class DivisionTest {
    
    public DivisionTest() {
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        double a = 10.0;
        double b = 2.0;
        Division instance = new Division();
        double expResult = 5.0;
        double result = instance.dividir(a, b);
        assertEquals(expResult, result, 0);
    }
    
}
