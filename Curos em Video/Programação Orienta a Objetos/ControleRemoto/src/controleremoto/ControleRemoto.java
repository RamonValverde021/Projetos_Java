package controleremoto;

public class ControleRemoto {

    public static void main(String[] args) {
        ClasseControle controle = new ClasseControle();
        controle.ligar();
        controle.maisVolume();
        controle.maisVolume();
        controle.maisVolume();
        controle.menosVolume();
        controle.desligar();
    }
}
