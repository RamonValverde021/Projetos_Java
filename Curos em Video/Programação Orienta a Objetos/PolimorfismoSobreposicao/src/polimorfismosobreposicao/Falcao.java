package polimorfismosobreposicao;

public class Falcao extends Ave {

    public void cacar() {
        System.out.println("Falcão: Caçando animais pequenos");
    }

    @Override
    public void alimentar() {
        System.out.println("Falcão: Roedores e outras aves");
    }
}
