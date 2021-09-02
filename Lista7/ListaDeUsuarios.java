
/**
 * Write a description of class ListaDeUsuarios here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListaDeUsuarios
{
    private Usuario[] lista;
    private int indice, matricula;
    public ListaDeUsuarios(int quantidade)
    {
        if(quantidade < 5) quantidade = 5;
        lista = new Usuario[quantidade];
        matricula = 210000;
        indice = 0;
    }
    public boolean cadastrar(String nome)
    {
        if(indice == lista.length) return false;
        Usuario novoU = new Usuario(matricula, nome.toUpperCase());
        matricula++;
        lista[indice] = novoU;
        indice++;
        return true;
    }
    public Usuario buscarMatricula(int matricula)
    {
        for(int i = 0; i < indice; i++)
        {
            if (matricula == lista[i].getMatricula()) return lista[i];    
        }
        return null;
    }
    public Usuario buscarNome(String nome)
    {
        Usuario novoU;
        for(int i = 0; i<indice; i++)
        {
            novoU = lista[i];
            if (nome.equalsIgnoreCase(novoU.getNome())) return novoU;    
        }
        return null;    
    }
    public boolean excluir(int matricula)
    {
        int pos = -1;
        for(int i=0; i<indice; i++)
        {
           if(lista[i].getMatricula()==matricula) pos = i;
        }
        if (pos == -1) return false;
        for(int j = pos; j<indice-1; j++)
        {
            lista[j] = lista[j+1];
        }
        indice--;
        lista[indice] = null;
        return true;
    }
    public String toString()
    {
        String msg = "Lista de Usuarios\n";
        for(int i=0; i<indice; i++){
           msg = msg + lista[i].toString() + "\n";
        }
        return msg; 
    }
}
