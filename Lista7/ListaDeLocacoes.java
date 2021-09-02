
/**
 * Write a description of class ListaDeLocacoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListaDeLocacoes
{
    private Locacao[] lista;
    private int indice, matricula;
    public ListaDeLocacoes(int qtd)
    {
        if(qtd<5) qtd = 5;
        lista = new Locacao[qtd];
        matricula = 1000;
        indice = 0;
    }
    public boolean excluiAlocacao(int cod)
    {
        int pos = buscaPorMatriculaPosicao(cod);
        if(pos == -1) return false;
        for(int i = pos; i < indice-1; i++)
        {
            lista[i] = lista[i+1];
        }
        indice--;
        lista[indice] = null;
        return true;
    }
    public boolean emprestimo(String livro)
    {
        if(lista.length == indice ) return false;
        lista[indice] = new Locacao(livro, matricula);
        indice++;
        matricula++;
        return true;
    }
    public int buscaPorMatriculaPosicao(int matricula)
    {
        if(matricula < 1000) return -1;
        for(int i = 0; i < indice; i++)
        {
            if(lista[i].getUsuario() == matricula) return i;
        }
        return -1;
    }
    public Locacao buscaPorMatricula(int matricula)
    {
        if(matricula < 1000) return null;
        for(int i = 0; i < indice; i++)
        {
            if(lista[i].getUsuario() == matricula) return lista[i];
        }
        return null;
    }
    public Locacao buscaPorAutor(String autor)
    {
        for(int i = 0; i < indice; i++)
        {
            if(lista[i].getAutor().equalsIgnoreCase(autor)) return lista[i];
        }
        return null;
    }
    public String toString()
    {
        String msg = "";
        for(int i = 0; i < indice; i++)
        {
            msg = msg + lista[i].toString();
        }
        return msg;
    }
}
