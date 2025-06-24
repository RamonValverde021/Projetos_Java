package projetolivro;
public interface PublicacaoFilme {
    public abstract void iniciar();
    public abstract void desligar();
    public abstract void capitulo(int capitulo);
    public abstract void avancarCena(int tempo);
    public abstract void voltarCena(int tempo);
}
