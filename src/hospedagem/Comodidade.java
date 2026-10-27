package br.com.airbnb.airbnb.src.hospedagem;

public class Comodidade {
    private String nome; // ex: Wi-Fi, Ar Condicionado, Piscina
    private String categoria;
    private boolean essencial;

    public Comodidade() {
    }

    public Comodidade(String nome, String categoria, boolean essencial) {
        this.nome = nome;
        this.categoria = categoria;
        this.essencial = essencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEssencial() {
        return essencial;
    }

    public void setEssencial(boolean essencial) {
        this.essencial = essencial;
    }
}
