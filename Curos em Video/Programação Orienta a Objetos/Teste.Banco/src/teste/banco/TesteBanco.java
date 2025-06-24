package teste.banco;

public class TesteBanco {

    public static void main(String[] args) {
        Contas conta = new Contas();

        // Criar Conta
        conta.abrirConta("Jose", "15151665", 'C', 150);
        conta.abrirConta("Maria", "8451665", 'P', 800);
        conta.abrirConta("Trioxa", "798985498", 'C', 60);
        conta.abrirConta("Mauro", "755751665", 'P', 445);
        conta.abrirConta("Luana", "747845665", 'P', 100);

        // Fechar Conta
        conta.fecharConta(5);

        // Depositar
        conta.depositar(3, 335);

        // Saque
        conta.sacar(2, 285);
        conta.sacar(4, 285);

        conta.status();

        // Mensalidade
        conta.pagarMensal(1);
        conta.pagarMensal(2);
        conta.pagarMensal(3);
        conta.pagarMensal(4);
        conta.pagarMensal(5);

        // Mudar tipo de conta
        conta.mudarTipo(1, 'P');

        // Status das Contas
        conta.status();
    }
}