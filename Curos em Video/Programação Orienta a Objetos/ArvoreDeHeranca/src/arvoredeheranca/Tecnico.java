package arvoredeheranca;

public final class Tecnico extends Aluno {

    private int resgistroProfissional;

    public final void praticar() {
        System.out.println("Pratica realizada!");
    }

    public int getResgistroProfissional() {
        return resgistroProfissional;
    }

    public void setResgistroProfissional(int resgistroProfissional) {
        this.resgistroProfissional = resgistroProfissional;
    }

}
