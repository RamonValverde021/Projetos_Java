package heranca;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudarTrablhando() {
        if (this.isTrabalhando() == true) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
