package projetolivro;
public interface PublicacaoLivro {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int paginas);
    public abstract void avancarPag();
    public abstract void voltarPag();
}