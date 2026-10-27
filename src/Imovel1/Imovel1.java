package src.Imovel1;

public class Imovel1{
    private String endereco;
    private int capacidadeHospedes;
    private double precoDiaria;
    private double notaMedia;

    public Imovel1(String endereco, int capacidadeHospedes, double precoDiaria) {
        this.endereco = endereco;
        this.capacidadeHospedes = capacidadeHospedes;
        this.precoDiaria = precoDiaria;
        this.notaMedia = 0.0;
    }

    public String getEndereco() { return endereco; }
    public int getCapacidadeHospedes() { return capacidadeHospedes; }
    public double getPrecoDiaria() { return precoDiaria; }
    public double getNotaMedia() { return notaMedia; }
}
