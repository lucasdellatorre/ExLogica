
/**
 * 
 */
public class Carro
{
    private String placa, marca, modelo, cor;
    private double consumo, km, capacidade;
    public Carro(String placa)
    {
        modelo = "NAO INFORMADO";
        cor = "NAO INFORMADA";
        capacidade = 50;
        marca = "NAO INFORMADA";             
        this.placa = placa;
        km = 0;
        consumo = 10;
    }
    public String getPlaca()
    {
        return placa;    
    }
    public String getMarca()
    {
        return marca;    
    }
    public String getModelo()
    {
        return modelo;    
    }
    public String getCor()
    {
        return cor;    
    }
    public double getKm()
    {
        return km;
    }
    public double getCapacidade()
    {
        return capacidade;
    }
    public double getConsumo()
    {
        return consumo;
    }
    //---------------------SET----------------------------
    public void setPlaca(String placaInicial)
    {
        placa = placaInicial;
    }
    public void setModelo(String modeloInicial)
    {
        modelo = modeloInicial;
    }
    public void setCor(String corInicial)
    {
        cor = corInicial;
    }
    public void setMarca(String marcaInicial)
    {
        marca = marcaInicial;
    }
    public void setKm(double kmInicial)
    {
        if (kmInicial >= 0) km = kmInicial;
    }
    public void setCapacidade(double capacidadeInicial)
    {
        if (capacidadeInicial > 0) capacidade = capacidadeInicial;
    }
    public void setConsumo(double km)
    {
        if (consumo > 0) consumo = km;
        else consumo = 1;
    }
}
