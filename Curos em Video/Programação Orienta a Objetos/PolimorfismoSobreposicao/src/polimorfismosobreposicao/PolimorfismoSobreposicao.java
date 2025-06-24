package polimorfismosobreposicao;

public class PolimorfismoSobreposicao {

    public static void main(String[] args) {

        Ave a1 = new Ave();
        a1.alimentar();

        Falcao f1 = new Falcao();
        f1.alimentar();

        Tartaruga t1 = new Tartaruga();
        t1.setEcosistema();
        System.out.println(t1.getEcosistema());

        Cachorro c1 = new Cachorro();
        c1.setCorPelo("Marrom");
        c1.emitirSom();

        c1.reagir("Olá");
        c1.reagir("Vai apanhar!");
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);
    }
}
