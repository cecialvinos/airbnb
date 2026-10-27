package br.com.airbnb.airbnb.src.reserva;

public class PoliticaCancelamento {
    private String tipo; // ex: Flexivel, Moderada, Rigorosa
    private double porcentagemReembolso;
    private int diasAntecedenciaMinima;

    public PoliticaCancelamento() {
    }

    public PoliticaCancelamento(String tipo, double porcentagemReembolso, int diasAntecedenciaMinima) {
        this.tipo = tipo;
        this.porcentagemReembolso = porcentagemReembolso;
        this.diasAntecedenciaMinima = diasAntecedenciaMinima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPorcentagemReembolso() {
        return porcentagemReembolso;
    }

    public void setPorcentagemReembolso(double porcentagemReembolso) {
        this.porcentagemReembolso = porcentagemReembolso;
    }

    public int getDiasAntecedenciaMinima() {
        return diasAntecedenciaMinima;
    }

    public void setDiasAntecedenciaMinima(int diasAntecedenciaMinima) {
        this.diasAntecedenciaMinima = diasAntecedenciaMinima;
    }
}
