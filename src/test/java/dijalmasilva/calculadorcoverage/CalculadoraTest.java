/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.calculadorcoverage;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class CalculadoraTest {
    
    private Calculadora calculadora;
    
    public CalculadoraTest() {
        
    }
    
    @Before
    public void init(){
        this.calculadora = new Calculadora();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSomarNuloA() {
        Integer a = null;
        Integer b = null;
        
        assertEquals(0, calculadora.somar(a, b));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSomarNuloB() {
        Integer a = 2;
        Integer b = null;
        
        assertEquals(0, calculadora.somar(a, b));
    }
}
