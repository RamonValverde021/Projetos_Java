package polimorfismosobreposicao;

import java.util.Scanner;

public class Tartaruga extends Reptil {

    private String ecosistema;

    Scanner teclado = new Scanner(System.in);

    public void setEcosistema() {
        System.out.println("Qual ecosistem ela pertence: " + '\n' + "1 = Marinho" + '\n' + "2 = Terrestre");
        String tipo = teclado.nextLine();
        int dado = Integer.parseInt(tipo);

        switch (dado) {
            case 1:
                this.ecosistema = "Tartaruga marinha";
                break;
            case 2:
                this.ecosistema = "Tartaruga terrestre";
                break;
            default:
                break;
        }
    }

    public String getEcosistema() {
        if (this.ecosistema != null) {
            return ecosistema;
        } else {
        return "Sem resposta";
        }
    }

    @Override
    public void locomover() {
        System.out.println("Andando bem devagar");
    }
}
