package arvoredeheranca;

public class ArvoreDeHeranca {

    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Rubens");
        v1.setIdade(38);
        v1.setSexo('M');
        v1.fazerAniversario();
        System.out.println("Nome: " + v1.getNome() + '\n' + "Idade: " + v1.getIdade()
                + '\n' + "Sexo: " + v1.getSexo() + '\n' + "----------------------------------------" + '\n');

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(15);
        a1.setSexo('F');
        a1.setMatricula(3756);
        a1.setCurso("Ensino Médio");
        System.out.println("Nome: " + a1.getNome() + '\n' + "Idade: " + a1.getIdade()
                + '\n' + "Sexo: " + a1.getSexo() + '\n' + "Matricula: " + a1.getMatricula()
                + '\n' + "Curso: " + a1.getCurso());
        a1.pagarMensalidade();
        System.out.println("----------------------------------------" + '\n');

        Professor p1 = new Professor();
        p1.setNome("Fábio");
        p1.setIdade(55);
        p1.setSexo('M');
        p1.setEspecialidade("Química");
        p1.setSalario(2800f);
        p1.receberAumento(1700f);
        System.out.println("Nome: " + p1.getNome() + '\n' + "Idade: " + p1.getIdade()
                + '\n' + "Sexo: " + p1.getSexo() + '\n' + "Especialidade: " + p1.getEspecialidade()
                + '\n' + "Salário: " + p1.getSalario() + '\n' + "----------------------------------------" + '\n');

        Bolsista b1 = new Bolsista();
        b1.setNome("Júlia");
        b1.setIdade(15);
        b1.setSexo('F');
        b1.setMatricula(1623);
        b1.setBolsa(50f);
        b1.setCurso("Pré Vestibular");
        b1.fazerAniversario();
        System.out.println("Nome: " + b1.getNome() + '\n' + "Idade: " + b1.getIdade()
                + '\n' + "Sexo: " + b1.getSexo() + '\n' + "Matricula: " + b1.getMatricula()
                + '\n' + "Curso: " + b1.getCurso() + '\n' + "Bolsa: " + b1.getBolsa() + "%");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        System.out.println("----------------------------------------" + '\n');

        Tecnico t1 = new Tecnico();
        t1.setNome("Rick");
        t1.setIdade(18);
        t1.setSexo('M');
        t1.setMatricula(3323);
        t1.setResgistroProfissional(112587);
        t1.setCurso("Informática");
        System.out.println("Nome: " + t1.getNome() + '\n' + "Idade: " + t1.getIdade()
                + '\n' + "Sexo: " + t1.getSexo() + '\n' + "Matricula: " + t1.getMatricula()
                + '\n' + "Curso: " + t1.getCurso() + '\n' + "Registro Profissional: " + t1.getResgistroProfissional());
        t1.pagarMensalidade();
        t1.praticar();
        System.out.println("----------------------------------------" + '\n');
    }

}
