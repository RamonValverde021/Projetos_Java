package arvoredeheranca;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Mensalidade do aluno paga!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
