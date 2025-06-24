/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.bancaria;

/**
 *
 * @author LABORATORIO
 */
public class Contas {

    private String nome;
    private String cpf;
    private char tipoConta;
    private int saldo;

    private String cadastroNome[] = new String[100];
    private String cadastroCPF[] = new String[100];

    public void novaConta(String nome, String cpf, char tipoConta, int saldo) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTipoConta(tipoConta);
        this.setSaldo(saldo);

        System.out.println(nome + "  " + cpf);

        int comprimentoUtil = 0;
        for (int c = 0; c < cadastroNome.length; c++) {
            if (cadastroNome[c] == null) {
                this.cadastroNome[c] = nome;
                this.cadastroCPF[c] = cpf;
                comprimentoUtil = c + 1;
                break;
            }
        }
        for (int c = 0; c < 3; c++) {
            //for (int c = 0; c < comprimentoUtil; c++) {
            //for (int c = 0; c < cadastroNome.length; c++) {
            System.out.println("ID: " + c + '\n' + "Nome do Cliente: " + cadastroNome[c] + '\n'
                    + "CPF do Cliente:  " + cadastroCPF[c] + '\n' + "--------------------------------------");
        }

        for (int c = 0; c < 5; c++) {
            System.out.println("Criar: " + this.cadastroCPF[c]);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(char tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void acessoConta() {
        this.cadastroNome[23] = "Ramon Aguiar Valverde";
        this.cadastroCPF[23] = "132.611.666-57";

        //this.setNome("Jose");
        //this.setCpf("12356478");
        System.out.println(this.getNome() + "  " + this.getCpf() + "  " + this.getSaldo() + "   " + this.getTipoConta());

        for (int c = 0; c < 3; c++) {
            System.out.println("Enviar: " + this.cadastroCPF[c]);
        }
    }

}
