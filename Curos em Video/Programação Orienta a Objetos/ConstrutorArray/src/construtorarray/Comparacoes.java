package construtorarray;

public class Comparacoes {

    private Baterias comparado;
    private Baterias comparador;
    private boolean aprovado;

    public void modelosComparador(Baterias b1, Baterias b2) {
        this.comparado = b1;
        this.comparador = b2;

        int tamB1 = tamanhos(this.comparado.getTamanho());
        int tamB2 = tamanhos(this.comparador.getTamanho());
        String tipoB1 = tipo(this.comparado.getTipo());
        String tipoB2 = tipo(this.comparador.getTipo());

        System.out.println("Bateria comparada: " + this.comparado.getMarca() + " " + this.comparado.getTamanho() + " " + tipoB1);
        System.out.println("Bateria comparadora: " + this.comparador.getMarca() + " " + this.comparador.getTamanho() + " " + tipoB2);

        if (this.comparado.getMarca().equals(this.comparador.getMarca()) && this.comparado.getTamanho().equals(this.comparador.getTamanho())) {
            System.out.println("Ambas as baterias são iguais");
        } else {

            // Tamanhos
            if (tamB1 > tamB2) {
                System.out.println("A bateria comparada é maior.");
            } else if (tamB1 == tamB2) {
                System.out.println("Ambas as baterias tem tamanhos iguais.");
            } else {
                System.out.println("A bateria comparadora é maior.");
            }

            // Tensões
            if (this.comparado.getTensao() > this.comparador.getTensao()) {
                System.out.println("A bateria comparada tem a maior tensão = " + this.comparado.getTensao() + " Volts");
            } else if (this.comparado.getTensao() == this.comparador.getTensao()) {
                System.out.println("Ambas as baterias tem tensões iguais = " + this.comparado.getTensao() + " Volts");
            } else {
                System.out.println("A bateria comparadora tem a maior tensão = " + this.comparador.getTensao() + " Volts");
            }

            // Correntes
            if (this.comparado.getCorrente() > this.comparador.getCorrente()) {
                System.out.println("A bateria comparada tem a maior consumo de corrente = " + this.comparado.getCorrente() + " mAh");
                System.out.println("A bateria comparadora resiste por mais tempo = " + this.comparador.getCorrente() + " mAh");
            } else if (this.comparado.getCorrente() == this.comparador.getCorrente()) {
                System.out.println("Ambas as baterias tem correntes iguais = " + this.comparado.getCorrente() + " mAh");
            } else {
                System.out.println("A bateria comparadora tem a maior consumo de corrente = " + this.comparador.getCorrente() + " mAh");
                System.out.println("A bateria comparada resiste por mais tempo = " + this.comparado.getCorrente() + " mAh");
            }

        }

        System.out.println('\n');
    }

    private int tamanhos(String tamanho) {
        switch (tamanho) {
            case "cr2032":
                return 1;
            case "A23":
                return 2;
            case "AAA":
                return 3;
            case "AA":
                return 4;
            case "C":
                return 5;
            case "PP3":
                return 6;
            case "D":
                return 7;
            default:
                break;

        }
        return 0;
    }

    private String tipo(char tipo) {
        switch (tipo) {
            case 'c':
                return "Comum";
            case 'a':
                return "Alcalina";
            case 'l':
                return "Lithium";
            case 'r':
                return "Recarregavel";
            default:
                break;
        }
        return null;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
