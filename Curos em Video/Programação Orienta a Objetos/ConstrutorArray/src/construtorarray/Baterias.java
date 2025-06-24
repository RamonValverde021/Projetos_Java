package construtorarray;

public final class Baterias {

    private String marca;
    private String tamanho;
    private char tipo;
    private float tensao;
    private int corrente;

    public Baterias(String marca, String tamanho, char tipo, float tensao, int corrente) {
        this.setMarca(marca);
        this.setTamanho(tamanho);
        this.setTipo(tipo);
        this.setTensao(tensao);
        this.setCorrente(corrente);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public int getCorrente() {
        return corrente;
    }

    public void setCorrente(int corrente) {
        this.corrente = corrente;
    }

    public void status() {
        System.out.println("Marca: " + this.getMarca() + '\n' + "Tamanho: " + this.getTamanho());
        System.out.print("Tipo: ");
        char tipo = this.getTipo();
        switch (tipo) {
            case 'a':
                System.out.println("Alcalina");
                break;
            case 'c':
                System.out.println("Comum");
                break;
            case 'l':
                System.out.println("Lithium");
                break;
            case 'r':
                System.out.println("Recarregavel");
                break;
            default:
                break;
        }
        System.out.println("Tensão: " + this.getTensao() + " V" + '\n' + "Corrente: " + this.getCorrente() + " mAh" + '\n' + "---------------------------------" + '\n');
    }
    
}
