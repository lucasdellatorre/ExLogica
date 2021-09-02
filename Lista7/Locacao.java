
/**
 * Write a description of class Locacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Locacao
{
    private int usuario;
    private String livro, autor;
    public Locacao(String livro, int numero)
    {
        this.livro = livro;
        usuario = numero;
        autor = "NAO INFORMADO";
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    public String getAutor()
    {
        return autor;
    }
    public void setLivro(String livro)
    {
        this.livro = livro;
    }
    public String getLivro()
    {
        return livro;
    }
    public int getUsuario()
    {
        return usuario;
    }
    public String toString()
    {
        return " Nome do livro: " + getLivro() + " | " + "Numero: " + getUsuario() + " | " + "Autor: " + getAutor();
    }
}
