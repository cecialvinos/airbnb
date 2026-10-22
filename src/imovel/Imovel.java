package imovel;

public class Imovel {

    private Endereco endereco;
    private TipoImovel tipo;
    private double precoDiaria;
    private Disponibilidade dataEntrada;
    private Disponibilidade dataSaida;

    public Imovel () {
    }

    public Imovel(Endereco endereco,TipoImovel tipo, double precoDiaria, Disponibilidade dataEntrada, Disponibilidade dataSaida) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }



}

