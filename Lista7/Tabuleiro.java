
/**
 * Escreva a descrição da classe Tabuleiro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Tabuleiro
{
    private char[][] tab;
    private int contJogadas;
    public Tabuleiro(){
        tab = new char[3][3];
        inicializa();
        contJogadas = 0;
    }
    
    public void inicializa(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tab[i][j] = '_';
            }
        }
    }
    public boolean verificaVencedor(char letra)
    {
        if(venceuEmLinha(letra)) return true;
        if(venceuEmColuna(letra)) return true;
        if(venceuEmDiagonal(letra)) return true;
        return false;
    }
    public boolean venceuEmLinha(char letra)
    {
        int cont;
        for(int lin = 0; lin<3; lin++)
        {
            cont = 0;
            for(int col = 0; col<3; lin++)
            {
                if (tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean venceuEmColuna(char letra)
    {
        int cont;
        for(int col = 0; col<3; col++)
        {
            cont = 0;
            for(int lin = 0; lin<3; lin++)
            {
                if (tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean venceuEmDiagonal(char letra)
    {
        int cont;
        for(int lin = 0; lin<3; lin++)
        {
            cont = 0;
            for(int col = 0; col<3; lin++)
            {
                if ((lin == col) && tab[lin][col] == letra) cont++;
            }
            if (cont == 3) return true;
        }
        return false;
    }
    public boolean alteraCelula(int lin, int col, char letra)
    {
        //if (contJogadas == 9) return false;
        if (celulaLivre(lin,col)) 
        {
            tab[lin][col] = letra;
            contJogadas++;
            return true;
        }
        return false;
    }
    public int getContJogadas()
    {
        return contJogadas;
    }
    public boolean celulaLivre(int lin, int col)
    {
        if(lin < 0 || lin > 2 || col < 0 || col > 2) return false; 
        if (tab[lin][col]!= '.') return false;
        return true;
    }
    public void posicao(int lin, int col, char jogador)
    {
        for(int i=0; i<lin; i++)
        {
            for(int j=0; j<col; j++)
            {
                tab[i][j] = jogador;
            }
        }
    }
    public String toString(){
        String msg = "\n\n--- Jogo da Velha ---\n";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                msg = msg + tab[i][j] + "\t";
            }
            msg = msg + "\n";
        }
        return msg;
    }
}
