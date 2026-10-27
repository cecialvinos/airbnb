package br.com.airbnb.airbnb.src.hospedagem;

public class Acomodacao {
    private String titulo;
    private String endereco;
    private double precoPorNoite;
    private boolean disponivel;

    public Acomodacao() {
    }

    public Acomodacao(String titulo, String endereco, double precoPorNoite, boolean disponivel) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
