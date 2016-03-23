/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.calculadorcoverage;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Calculadora {

    public int somar(Integer a, Integer b){
        
        if (a == null){
            throw new IllegalArgumentException();
        }
        
        if (b == null){
            throw new IllegalArgumentException();
        }
        
        return a + b;
    }
}
