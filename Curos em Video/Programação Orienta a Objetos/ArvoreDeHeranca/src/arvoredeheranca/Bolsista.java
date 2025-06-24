package arvoredeheranca;

public final class Bolsista extends Aluno {

    private float bolsa;

    public final void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade do bolsista paga!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
