package heranca;

public class Aluno extends Pessoa {

    private boolean matriculado;
    private String curso;

    public void cancelarMatricula() {
        if (this.isMatriculado() == true) {
            this.setMatriculado(false);
        } else {
            this.setMatriculado(true);
        }
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    void isMatriculado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
