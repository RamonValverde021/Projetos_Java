package projetolivro;

public class Livro implements PublicacaoLivro {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // E uma classe

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(pagAtual);
        this.setAberto(aberto);
        this.setLeitor(leitor);
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private String getLeitor() {
        return leitor.getNome();
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Titulo: " + this.getTitulo() + '\n' + "Autor: " + this.getAutor() + '\n'
                + "Total de páginas: " + this.getTotPaginas() + " páginas " + '\n' + "Página atual: " + this.getPagAtual() + "º");

        if (this.isAberto() == true) {
            System.out.println("Livro aberto: Sim");
        } else {
            System.out.println("Livro aberto: Não");
        }

        System.out.println("Leitor: " + this.getLeitor()+ '\n' + "----------------------------------------" + '\n');
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int paginas) {
        this.setPagAtual(pagAtual += paginas);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(pagAtual++);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(pagAtual--);
    }

}
