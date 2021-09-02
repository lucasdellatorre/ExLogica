
/**
 * Write a description of class Usuario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Usuario
{
    private int matricula;
    private String nome;
    public Usuario(int matricula, String nome)
    {
        this.matricula = matricula;
        this.nome = nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getMatricula()
    {
        return matricula;
    }
    public String getNome()
    {
        return nome;
    }
    public String toString()
    {
        //return "Matricula: " + matricula + " | nome: " + nome; 
        return String.format("Matricula %s, Nome: %s", matricula, nome);
    }
}
