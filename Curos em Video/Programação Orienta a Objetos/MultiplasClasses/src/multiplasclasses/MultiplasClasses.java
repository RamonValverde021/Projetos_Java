/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplasclasses;

import java.util.Scanner;

/**lj
 *
 * @author LABORATORIO
 */
public class MultiplasClasses {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        operacoes op = new operacoes();
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int ano = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Seu nome completo é: ");
        System.out.println(operacoes.nomes(nome, sobrenome));
        System.out.print("Sua idade é: ");
        System.out.println(operacoes.idade(ano) + " anos");
        
        op.setNumero(8263);
        System.out.println(op.getNumero());
                
        
    }
    
}
