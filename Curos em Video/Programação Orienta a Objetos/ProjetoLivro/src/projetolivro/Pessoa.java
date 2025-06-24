package projetolivro;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    protected Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    protected String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private char getSexo() {
        return sexo;
    }

    private void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    protected void statusPessoa() {
        System.out.println("Nome: " + this.getNome() + '\n' + "Idade: " + this.getIdade());
        switch (this.getSexo()) {
            case 'M':
                System.out.println("Sexo: Mascolino");
                break;
            case 'F':
                System.out.println("Sexo: Feminino");
                break;
            default:
                System.out.println("Sexo: Alguma bosta LGBT");
                break;
        }
        System.out.println("----------------------------------------" + '\n');
    }
}
