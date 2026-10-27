package br.com.airbnb.airbnb.src.comunicacao;

public class Notificacao {
    private String titulo;
    private String conteudo;
    private String dataHora;
    private boolean enviada;

    public Notificacao() {
    }

    public Notificacao(String titulo, String conteudo, String dataHora, boolean enviada) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataHora = dataHora;
        this.enviada = enviada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }
}
