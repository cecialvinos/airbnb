package br.com.airbnb.airbnb.src.promocao;

public class OfertaEspecial {
    private String titulo;
    private double descontoPercentual;
    private String dataInicio;
    private String dataFim;

    public OfertaEspecial() {
    }

    public OfertaEspecial(String titulo, double descontoPercentual, String dataInicio, String dataFim) {
        this.titulo = titulo;
        this.descontoPercentual = descontoPercentual;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
