package teste.banco;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Contas {

    public final int cadastroNumero[] = new int[100];
    private final String cadastroNome[] = new String[100];
    private final String cadastroCPF[] = new String[100];
    protected final char cadastroTipoConta[] = new char[100];
    private final int cadastroSaldo[] = new int[100];
    private final boolean cadastroStatus[] = new boolean[100];

    public void abrirConta(String nome, String cpf, char tipoConta, int saldo) {
        int comprimentoUtil = 0;
        for (int c = 1; c < cadastroNome.length + 1; c++) {
            if (cadastroNome[c] == null) {
                this.cadastroNumero[c] = c;
                this.cadastroNome[c] = nome;
                this.cadastroCPF[c] = cpf;
                this.cadastroTipoConta[c] = tipoConta;
                this.cadastroSaldo[c] = saldo;
                this.cadastroStatus[c] = true;
                comprimentoUtil = c;
                break;
            }
        }

        String tipo;
        String status;
        if (cadastroTipoConta[comprimentoUtil] == 'C') {
            tipo = "Corrente";
        } else {
            tipo = "Poupança";
        }
        if (cadastroStatus[comprimentoUtil] == true) {
            status = "Ativada";
        } else {
            status = "Desativada";
        }
        System.out.println(
                "Numero da Conta: " + cadastroNumero[comprimentoUtil] + '\n'
                + "Nome do Cliente: " + cadastroNome[comprimentoUtil] + '\n'
                + "CPF do Cliente:  " + cadastroCPF[comprimentoUtil] + '\n'
                + "Tipo de Conta:  " + tipo + '\n'
                + "Tipo de Conta:  " + cadastroSaldo[comprimentoUtil] + '\n'
                + "Status da Conta:  " + status + '\n'
                + "--------------------------------------");
    }

    public void status() {
        System.out.println('\n' + "------------------------------- STATUS CONTAS -------------------------------" + '\n');
        //for (int c = 1; c < cadastroNome.length + 1; c++) {
        for (int c = 1; c < 6; c++) {
            String tipoConta;
            String statusConta;
            if (cadastroTipoConta[c] == 'C') {
                tipoConta = "Corrente";
            } else {
                tipoConta = "Poupança";
            }
            if (cadastroStatus[c] == true) {
                statusConta = "Ativada";
            } else {
                statusConta = "Desativada";
            }
            System.out.println(
                    "Numero da Conta: " + cadastroNumero[c] + '\n'
                    + "Nome do Cliente: " + cadastroNome[c] + '\n'
                    + "CPF do Cliente:  " + cadastroCPF[c] + '\n'
                    + "Tipo de Conta:  " + tipoConta + '\n'
                    + "Tipo de Conta:  " + cadastroSaldo[c] + '\n'
                    + "Status da Conta:  " + statusConta + '\n'
                    + "--------------------------------------");
        }
    }

    public void fecharConta(int numero) {
        this.cadastroStatus[numero] = false;
    }

    public void depositar(int numConta, int valor) {
        int saldo = cadastroSaldo[numConta];
        int deposito = saldo + valor;
        boolean status = cadastroStatus[numConta];
        if (status == true) {
            this.cadastroSaldo[numConta] = deposito;
        } else {
            JOptionPane.showMessageDialog(null, "<html>Essa conta está desativada!<br> Ativi-a para poder efutar depósitos e outras operações</html>", "Atenção", WARNING_MESSAGE);
        }
    }

    public void sacar(int numConta, int valor) {
        int saldo = cadastroSaldo[numConta];
        int saldoRestante = saldo - valor;
        boolean status = cadastroStatus[numConta];
        if (status) {
            if (saldoRestante <= 0) {
                JOptionPane.showMessageDialog(null, "Você não tem saldo o suficiente para remover essa quantia!", "Atenção", WARNING_MESSAGE);
            } else {
                this.cadastroSaldo[numConta] = saldoRestante;
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html>Essa conta está desativada!<br> Ativi-a para poder efutar saques e outras operações</html>", "Atenção", WARNING_MESSAGE);
        }
    }

    public void pagarMensal(int numConta) {
        int saldo = cadastroSaldo[numConta];
        boolean status = cadastroStatus[numConta];
        char tipo = cadastroTipoConta[numConta];

        if (status == true) {
            if (tipo == 'C') {
                int saldoRestante = saldo - 12;
                if (saldoRestante <= 0) {
                    JOptionPane.showMessageDialog(null, "Você não tem saldo o suficiente para realizar essa operação!", "Atenção", WARNING_MESSAGE);
                } else {
                    this.cadastroSaldo[numConta] = saldoRestante;
                }
            } else {
                int saldoRestante = saldo - 20;
                if (saldoRestante <= 0) {
                    JOptionPane.showMessageDialog(null, "Você não tem saldo o suficiente para realizar essa operação!", "Atenção", WARNING_MESSAGE);
                } else {
                    this.cadastroSaldo[numConta] = saldoRestante;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html>Essa conta está desativada!<br> Está conta está desativada, ativi-a para poder realizar operações</html>", "Atenção", WARNING_MESSAGE);
        }

    }

    public void mudarTipo(int numConta, char tipoConta) {
        boolean status = cadastroStatus[numConta];
        char tipo = cadastroTipoConta[numConta];
        if (status == true) {
            if (tipo == 'C') {
                this.cadastroTipoConta[numConta] = 'P';
            } else {
                this.cadastroTipoConta[numConta] = 'C';
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html>Essa conta está desativada!<br> Ativi-a para poder mudar seu tipo e outras operações</html>", "Atenção", WARNING_MESSAGE);
        }
    }

}
