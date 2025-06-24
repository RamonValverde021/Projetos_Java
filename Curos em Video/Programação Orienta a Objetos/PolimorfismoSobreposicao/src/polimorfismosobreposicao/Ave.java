package polimorfismosobreposicao;

public class Ave extends Animal {

    private String corPena;

    public void fazerNinho() {
        System.out.println("Aves: Ninho de galhos feito");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Aves: Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Aves: Minhocas e frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Aves: Assobio");
    }

}
