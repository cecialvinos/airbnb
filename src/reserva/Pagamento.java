package br.com.airbnb.airbnb.src.reserva;

public class Pagamento {
    private double valor;
    private String formaPagamento; // ex: Cartao, PIX
    private String dataPagamento;
    private boolean aprovado;

    public Pagamento() {
    }

    public Pagamento(double valor, String formaPagamento, String dataPagamento, boolean aprovado) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
        this.aprovado = aprovado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
