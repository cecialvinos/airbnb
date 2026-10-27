package imovel;

import java.util.Scanner;

public class Imovel {

    private String nomeImovel;
    private Endereco endereco;
    private TipoImovel tipo;
    private double precoDiaria;
    private Disponibilidade dataEntrada;
    private Disponibilidade dataSaida;
    private int capacidadeHospedes;
    private double notaMedia;
    private Scanner sc;

    public Imovel () {
    }

    public Imovel(String nomeImovel, Endereco endereco,TipoImovel tipo, double precoDiaria, Disponibilidade dataEntrada, Disponibilidade dataSaida, int capacidadeHospedes, double notaMedia) {
        this.nomeImovel = nomeImovel;
        this.endereco = endereco;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.capacidadeHospedes = capacidadeHospedes;
        this.notaMedia = 0.0;
    }

    public String getNomeImovel () {
        System.out.print("Digite nome do imóvel: ");
        return sc.nextLine();
    }


}