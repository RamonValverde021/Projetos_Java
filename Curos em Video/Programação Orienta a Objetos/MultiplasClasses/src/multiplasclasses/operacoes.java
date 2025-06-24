/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplasclasses;

import java.time.Year;

/**
 *
 * @author LABORATORIO
 */
public class operacoes {
    public static int idade(int ano_nascimento){
        int ano_atual = Year.now().getValue();
        int i = ano_atual - ano_nascimento;
        return i;
    }
    public static String nomes(String nome, String sobrenome){
        String n = nome + " " + sobrenome;
        return n;
    }
    
    
    private int numero;
    private float valor;
    String dado;
    /*
    // Método Setter
    public void setNumero(int n){
        this.numero = n;
    }
    // Método Getter
    public int getNumero(){
        return this.numero;
    }
    */

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }


    
}
