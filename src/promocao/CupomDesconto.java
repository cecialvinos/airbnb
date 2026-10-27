package br.com.airbnb.airbnb.src.promocao;

public class CupomDesconto {
    private String codigo;
    private double porcentagemDesconto;
    private String dataValidade;
    private boolean ativo;

    public CupomDesconto() {
    }

    // Construtor com parâmetros
    public CupomDesconto(String codigo, double porcentagemDesconto, String dataValidade, boolean ativo) {
        this.codigo = codigo;
        this.porcentagemDesconto = porcentagemDesconto;
        this.dataValidade = dataValidade;
        this.ativo = ativo;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setPorcentagemDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
