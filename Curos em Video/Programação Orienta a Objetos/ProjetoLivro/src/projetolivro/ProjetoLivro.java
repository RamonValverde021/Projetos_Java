package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa p[] = new Pessoa[5];
        Livro l[] = new Livro[5];
        Filme f[] = new Filme[5];

        p[0] = new Pessoa("Luana", 20, 'F');
        p[1] = new Pessoa("Lucas", 25, 'T');
        p[2] = new Pessoa("Mateus", 27, 'M');
        p[3] = new Pessoa("Ana", 24, 'G');
        p[4] = new Pessoa("Luiza", 18, 'F');

        l[0] = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 264, 55, false, p[2]);
        l[1] = new Livro("O Senhor dos Aneis A Sociedade do Anel", "J. R. R. Tolkien", 468, 387, true, p[0]);
        l[2] = new Livro("O Ladrão de Raios", "Rick Riordan", 400, 149, true, p[4]);

        f[0] = new Filme("Vingadores: Guerra Infinita", "Anthony Russo e Joe Russo", 149, 102, true, p[3]);
        f[1] = new Filme("Círculo de Fogo", "Guillermo del Toro", 132, 35, false, p[1]);
        f[2] = new Filme("Homem-Aranha 2", "Sam Raimi", 127, 125, false, p[0]);

        p[0].fazerAniversario();
        p[2].fazerAniversario();

        for (int c = 0; c < 5; c++) {
            System.out.println("Usuario: " + c);
            p[c].statusPessoa();
        }

        l[0].folhear(22);
        l[0].voltarPag();
        l[0].abrir();

        for (int c = 0; c < 3; c++) {
            System.out.println("Livro: " + c);
            l[c].detalhes();
        }

        f[1].capitulo(2);
        f[1].avancarCena(35);
        f[1].desligar();

        for (int c = 0; c < 3; c++) {
            System.out.println("Filme: " + c);
            f[c].detalhes();
        }

    }

}
