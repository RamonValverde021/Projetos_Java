/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrandom;

/**
 *
 * @author Ramon Valverde
 */
public class MathRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num = 1 + Math.random()*(1000-1);
        System.out.println(Math.round(num));
        
    }
    
}
