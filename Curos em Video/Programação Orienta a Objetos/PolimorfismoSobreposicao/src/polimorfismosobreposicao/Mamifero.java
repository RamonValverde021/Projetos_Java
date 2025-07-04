package polimorfismosobreposicao;

public class Mamifero extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Animal onivaro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Respiração profunda");
    }

}
