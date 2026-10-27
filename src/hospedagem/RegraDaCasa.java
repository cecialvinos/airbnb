package br.com.airbnb.airbnb.src.hospedagem;

public class RegraDaCasa {
    private String descricao;
    private boolean obrigatoria;

    public RegraDaCasa() {
    }

    public RegraDaCasa(String descricao, boolean obrigatoria) {
        this.descricao = descricao;
        this.obrigatoria = obrigatoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }
}
