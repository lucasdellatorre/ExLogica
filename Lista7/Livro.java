
/**
 * Lucas Dellatorre de Freitas
 */
public class Livro
{
    private int codigo, anoPubli;
    private String[] autor;
    private String titulo;      
    public Livro(int codigo)
    {
        if (codigo < 0) this.codigo = 1;
        this.codigo = codigo;
        titulo = "NAO DEFINIDO";    
        //autor[0] = "NAO DEFINIDO";
    }
    public int getCodigo()
    {
        return codigo;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public String[] getAutor()
    {
        return autor;
    }
    public int getAnoPubli()
    {
        return anoPubli;
    }
    public void setAnoPubli(int anoPubli)
    {
        int ANO_ATUAL = 2021;
        if(anoPubli<0 || anoPubli > ANO_ATUAL) anoPubli = 0;
        else this.anoPubli = anoPubli;        
    }
    public void setAutor(String[] autores)
    {
        //autor = new String[autores.length];
        this.autor = autores;
        //for(int i = 0; i<autor.length ; i++)
        //{
        //    autor[i] = autores[i];    
        //}
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;    
    }
    public String toString()
    {
        String msg = "";
        if(getAutor() != null) 
        {
            for(int i = 0; i < getAutor().length ; i++)
            {
                msg = msg + getAutor()[i];
            }   
        }
        return "Titulo: , " + getTitulo() + ", Codigo:  " + getCodigo() + ", Autor: " + msg + ", Ano de publicacao: " + getAnoPubli();
    }
}
