package heranca;

public class Heranca {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();

        a1.setNome("Tony Stark");
        a1.setIdade(15);
        a1.setSexo('M');
        a1.setMatriculado(true);
        a1.setCurso("Engenharia");
        a1.fazerAniv();

        p1.setNome("Bruce Baner");
        p1.setIdade(38);
        p1.setSexo('M');
        p1.setEspecialidade("Radioatividade");
        p1.setSalario(18000);
        p1.receberAumento(5000);

        f1.setNome("Maria Hill");
        f1.setIdade(35);
        f1.setSexo('f');
        f1.setSetor("Subdiretora");
        f1.setTrabalhando(false);
        f1.mudarTrablhando();

        Status(a1, p1, f1);
    }

    public static void Status(Aluno a, Professor p, Funcionario f) {

        System.out.println("Nome: " + a.getNome() + '\n' + "Idade: " + a.getIdade());
        switch (a.getSexo()) {
            case 'M':
            case 'm':
                System.out.println("Sexo: Homem");
                break;
            case 'F':
            case 'f':
                System.out.println("Sexo: Mulher");
                break;
            default:
                System.out.println("Alguma bosta LGBT");
                break;
        }
        if (a.isMatriculado() == true) {
            System.out.println("Matriculado: Sim");
            System.out.println("Curso: " + a.getCurso());
        } else {
            System.out.println("Matriculado: Não");
        }
        System.out.println("---------------------------------------" + '\n');

        System.out.println("Nome: " + p.getNome() + '\n' + "Idade: " + p.getIdade());
        switch (p.getSexo()) {
            case 'M':
            case 'm':
                System.out.println("Sexo: Homem");
                break;
            case 'F':
            case 'f':
                System.out.println("Sexo: Mulher");
                break;
            default:
                System.out.println("Alguma bosta LGBT");
                break;
        }
        System.out.println("Especialidade: " + p.getEspecialidade() + '\n' + "Salário: $ " + p.getSalario() + ",00");
        System.out.println("---------------------------------------" + '\n');

        System.out.println("Nome: " + f.getNome() + '\n' + "Idade: " + f.getIdade());
        switch (f.getSexo()) {
            case 'M':
            case 'm':
                System.out.println("Sexo: Homem");
                break;
            case 'F':
            case 'f':
                System.out.println("Sexo: Mulher");
                break;
            default:
                System.out.println("Alguma bosta LGBT");
                break;
        }
        System.out.println("Setor: " + f.getSetor());
        if (f.isTrabalhando() == true) {
            System.out.println("Trabalhando: Sim");
        } else {
            System.out.println("Trabalhando: Não");
        }
        System.out.println("---------------------------------------" + '\n');

    }

}
