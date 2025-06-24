package controleremoto;

public class ClasseControle implements InterfaceControle {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ClasseControle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("A televisão está ligada.");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("A televisão está desligada.");
    }

    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
    }

    @Override
    public void maisVolume() {
        int vol = this.getVolume();
        if (vol < 100) {
            vol += 5;
            this.setVolume(vol);
            System.out.println("Volume aumentado para " + vol);
        } else {
            System.out.println("Volume máximo");
        }
    }

    @Override
    public void menosVolume() {
        int vol = this.getVolume();
        if (vol > 0) {
            vol -= 5;
            this.setVolume(vol);
            System.out.println("Volume diminuido para " + vol);
        } else {
            System.out.println("Volume minimo");
        }
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pouse() {
    }

}
