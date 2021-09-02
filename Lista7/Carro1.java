
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    private String marca, modelo, cor, placa;
    private double kilometragem, capacidadeDoTanque, consumo, quantidadeCombustivel;

    public Carro (String marcaInicial, String modeloInicial, String corInicial, double capacidadeInicial){
        marca = marcaInicial.toUpperCase();
        modelo = modeloInicial.toUpperCase();
        cor = corInicial.toUpperCase();
        placa = "NAO PLACADO";
        kilometragem = 0;
        if(capacidadeInicial>=20 && capacidadeInicial<=100) capacidadeDoTanque = capacidadeInicial;
        else capacidadeDoTanque = 46;
        consumo = 15;
        quantidadeCombustivel = 0;
    }
    public Carro (String marcaInicial, String modeloInicial, String corInicial){
        marca = marcaInicial.toUpperCase();
        modelo = modeloInicial.toUpperCase();
        cor = corInicial.toUpperCase();
        placa = "NAO PLACADO";
        kilometragem = 0;
        capacidadeDoTanque = 46;
        consumo = 15;
        quantidadeCombustivel = 0;
    }
    public void setConsumo(double novoConsumo){
        if(novoConsumo>0) consumo = novoConsumo;
    }
    public void setMarca(String novaMarca){
        marca = novaMarca;
    }
    public void setModelo(String novoModelo){
        modelo = novoModelo;
    }
    public void setCor(String novaCor){
        cor = novaCor;
    }
    public void setPlaca(String novaPlaca){
        placa = novaPlaca;
    }
    public String toString(){
        return "Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo + " Cor : " + cor + "\n" + "Kilometragem: " + kilometragem +
               " Capacidade do tanque: " + capacidadeDoTanque + "litros" + " Consumo medio: " + consumo + "km/litros" + 
               " Combustivel no tanque: " + quantidadeCombustivel + "litros";
    }
    
    public void abastecerLitros(double litros){
        if(litros>0 && quantidadeCombustivel+litros<=capacidadeDoTanque) quantidadeCombustivel = quantidadeCombustivel + litros;
    }
    
    public void abastecerReais(double valor, double preco){
        if(valor>0 && preco>0){
            double quant = valor/preco;
            abastecerLitros(quant);
        }
    }
    
    public void andar(double distancia){
        if(distancia>0){
            double distanciaMax = consumo * quantidadeCombustivel;
            if(distancia<=distanciaMax){
                kilometragem = kilometragem + distancia;
                double gastou = distancia/consumo;
                quantidadeCombustivel = quantidadeCombustivel - gastou;
            }
        }
    }
    public double getQuantidadeCombustivel(){
        return quantidadeCombustivel;
    }
    public double getConsumo(){
        return consumo;
    }
    public double getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getPlaca(){
        return placa;
    }
    public double getKilometragem(){
        return kilometragem;
    }
}
