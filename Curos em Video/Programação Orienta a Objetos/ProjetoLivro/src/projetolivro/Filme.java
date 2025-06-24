package projetolivro;

public class Filme implements PublicacaoFilme {

    private String titulo;
    private String diretor;
    private int duracao;
    private int assistido;
    private boolean ligado;
    private Pessoa espectador;

    protected Filme(String titulo, String diretor, int duracao, int assistido, boolean ligado, Pessoa espectador) {
        this.setTitulo(titulo);
        this.setDiretor(diretor);
        this.setDuracao(duracao);
        this.setAssistido(assistido);
        this.setLigado(ligado);
        this.setEspectador(espectador);
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getDiretor() {
        return diretor;
    }

    private void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private int getDuracao() {
        return duracao;
    }

    private void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    private int getAssistido() {
        return assistido;
    }

    private void setAssistido(int assistido) {
        this.assistido = assistido;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private String getEspectador() {
        return espectador.getNome();
    }

    private void setEspectador(Pessoa espectador) {
        this.espectador = espectador;
    }

    public void detalhes() {
        System.out.println("Titulo: " + this.getTitulo() + '\n' + "Diretor: " + this.getDiretor() + '\n'
                + "Duração: " + this.getDuracao() + " min " + '\n' + "Assitido: " + this.getAssistido() + " min ");

        if (this.isLigado() == true) {
            System.out.println("Ligado: Sim");
        } else {
            System.out.println("Ligado: Não");
        }

        System.out.println("Espectador: " + this.getEspectador() + '\n' + "----------------------------------------" + '\n');
    }

    @Override
    public void iniciar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void capitulo(int capitulo) {
        this.setAssistido(assistido = (capitulo*10));
    }

    @Override
    public void avancarCena(int tempo) {
        this.setAssistido(assistido += tempo);
    }

    @Override
    public void voltarCena(int tempo) {
        this.setAssistido(assistido -= tempo);
    }

}
