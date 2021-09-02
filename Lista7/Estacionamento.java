
/** METODOS PRINCIPAIS
 * - INSERE CARRO
 * - MANOBRA CARRO: PELA PLACA, PELA POSICAO
 * - SAIDA DE CARRO: PELA POSICAO, PELA PLACA
 * -
 * - METODOS AUXILIARES
 * - VALIDA PLACA: NOVA, ANTIGA, E AMBAS
 * - PROCURA VAGA PELA PLACA 
 * - VALIDA VAGA (VERIFICA NO VETOR SE HA ALGUM CARRO ALOCADO)
 * - VALIDA POSICAO
 */
public class Estacionamento
{
    private Carro[] vagas;
    private String nomeDoEstacionamento, VAGACONDICAO;
    public Estacionamento(String nomeDoEstacionamento)
    {
        vagas = new Carro[50];
        this.nomeDoEstacionamento = nomeDoEstacionamento;
        VAGACONDICAO = "ESPACO VAZIO";
    }
    public void inicializar()
    {
        for(int i = 0; i<vagas.length; i++)
        {
            vagas[i] = new Carro(VAGACONDICAO);   
        }
    }
    public void setEstacionamento(String estacionamento)
    {
        nomeDoEstacionamento = estacionamento;
    }
    public String getNomeDoEstacionamento()
    {
        return nomeDoEstacionamento;
    }    
    public boolean saidaDeCarroPelaPlaca(String placa)
    {
        if (!validaPlaca(placa)) return false;
        if (placa.equalsIgnoreCase(VAGACONDICAO)) return false;
        for(int i = 0; i<vagas.length; i++)
        {
            if (vagas[i].getPlaca().equalsIgnoreCase(placa)) vagas[i].setPlaca(VAGACONDICAO);
        }
        return true;
    }
    public boolean saidaDeCarroPelaPosicao(int vaga)
    {
        if (!validaPosicao(vaga)) return false;
        if (vagas[vaga].getPlaca().equalsIgnoreCase(VAGACONDICAO)) return false;
        for(int i = 0; i<vagas.length; i++)
        {
            if (vaga == i) vagas[i].setPlaca(VAGACONDICAO);
        }
        return true;
    }
    public boolean validaVaga(int vaga)  
    {
        if (!validaPosicao(vaga)) return false;
        for(int i = 0; i < vagas.length; i++)
        {
            if (vaga == i)
            {
                if(vagas[i].getPlaca().equalsIgnoreCase(VAGACONDICAO)) return true;
            }
        }
        return false;
    }
    public boolean manobrarCarroPelaPosicao(int posInicial, int posFinal) 
    {
        if (!validaPosicao(posInicial) && !validaPosicao(posFinal)) return false;
        if (!validaVaga(posFinal)) return false;
        if (validaVaga(posInicial)) return false;
        Carro aux;
        aux = vagas[posInicial];
        vagas[posInicial] = vagas[posFinal];
        vagas[posFinal] = aux;
        return true;
    }
    public boolean manobrarCarroPelaPlaca(String placa, int posFinal)
    {
        if (!validaPlaca(placa)) return false;
        if (!validaPosicao(posFinal)) return false;
        int posInicial = procuraVagaPelaPlaca(placa);
        if(posInicial == -1) return false;
        Carro aux;
        aux = vagas[posInicial];
        vagas[posInicial] = vagas[posFinal];
        vagas[posFinal] = aux;
        return true;
    }
    public int procuraVagaPelaPlaca(String placa)
    {
        if(!validaPlaca(placa)) return -1;
        for(int i = 0; i<vagas.length; i++)
        {
            if (vagas[i].getPlaca().equalsIgnoreCase(placa)) return i;
        }
        return -1;
    }
    public boolean inserir(String placa, int vaga)
    {
        if (!validaPlaca(placa)) return false;
        if (!validaVaga(vaga)) return false; 
        if (!validaPlacaExistente(placa)) return false;
        vagas[vaga] = new Carro(placa);
        return true;
    }
    public boolean validaPlacaExistente(String placa)
    {
        if (!validaPlaca(placa)) return false;
        for(int i = 0; i<vagas.length; i++)
        {
            if (vagas[i].getPlaca().equalsIgnoreCase(placa)) return false;
        }
        return true;
    }
    public boolean validaPosicao(int posicao)
    {
        if (!(posicao >= 0 && posicao<vagas.length)) return false;       
        return true;
    }
    public boolean validaPlaca(String placa)
    {
        if ((validaPlacaNova(placa) || validaPlacaAntiga(placa)) == false) return false;
        return true;
    }
    public boolean validaPlacaNova(String placa)
    {
        if (placa.length() != 7) return false;
        int i;
        for (i = 0; i < 3; i++)
        {
            if (!Character.isLetter(placa.charAt(i))) return false;
        }
        for (i = 3; i < 4; i++)
        {
            if (!Character.isDigit(placa.charAt(i))) return false;
        }
        for (i = 4; i < 5; i++)
        {
            if (!Character.isLetter(placa.charAt(i))) return false;
        }
        for(i = 5; i < 7; i++)   
        {
            if (!Character.isDigit(placa.charAt(i))) return false;
        }
        return true;    
    }
    public boolean validaPlacaAntiga(String placa)
    {
        if(placa.length() != 7) return false;
        int i;
        for(i = 0; i < 3; i++)
        {
            if(!Character.isLetter(placa.charAt(i))) return false;    
        }
        for(i = 3; i < 7; i++)
        {
            if(!Character.isDigit(placa.charAt(i))) return false;    
        }
        return true;
    }
    public String toString()
    {
        String msg = "Lista de Carros no Estacionamento\n";
        for(int i = 0; i<vagas.length; i++)
        {
           if (i<10) msg = msg + "\nVaga: 0" + i + " | " + "Placa do carro: " + vagas[i].getPlaca();
           else msg = msg + "\nVaga: " + i + " | " + "Placa do carro: " + vagas[i].getPlaca();
        }
        return msg; 
    }
}
