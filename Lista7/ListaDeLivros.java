    
/**
 * Write a description of class ListaDeLivros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListaDeLivros
{
    public Livro[] lista;
    private int indice, identificador;
    
    public ListaDeLivros(int qtd)
    {
        if(qtd < 10) qtd = 11;
        lista = new Livro[qtd];
        identificador = 1000;
        indice = 0;
    }
    public boolean cadastraLivro()
    {
        if(indice == lista.length) return false;
        Livro novoLivro = new Livro(identificador);
        identificador++;
        lista[indice] = novoLivro;
        indice++;
        return true;
    }
    public Livro buscaLivroCodigo(int codigo)
    {
        if(codigo < 0) return null; 
        for(int i = 0; i < indice; i++)
        {
            if(lista[i].getCodigo() == codigo) return lista[i];
        }
        return null;
    }
    public Livro buscaLivroAutor(String autor)
    {
        for(int i = 0; i < indice; i++)
        {
            for(int j = 0; j < lista[i].getAutor().length; i++)
            {
                if(lista[i].getAutor()[j].equalsIgnoreCase(autor)) return lista[i];
            }
        }
        return null;
    }
    public boolean excluiLivro(int codigo)
    {
        if(buscaLivroCodigo(codigo) == null) return false;
        int pos = 0;
        for(int j = 0 ; j < indice ; j++)
        {
            if(lista[j].getCodigo() == codigo) pos = j;
        }
        for(int i = pos ; i < indice; i++)
        {
            lista[i] = lista[i+1];
        }
        lista[indice] = null;
        return true;
    }
    public String toString()
    {
        String msg = "\nLista de Livros\n";
        if(lista[0] != null)
        {
            for(int i = 0; i < indice ; i++)
            {   
                msg = msg + lista[i].toString();
            }
        }
        else msg = "Nenhum livro";
        return msg;
    }
}
