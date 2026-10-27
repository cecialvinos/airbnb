package pagamento;

public class Pagamento {

    private int id;
    private double valor;
    private String metodoPagamento; // ex: Cartao, PIX
    private String dataPagamento;
    private boolean aprovado;

    public Pagamento() {
    }

    public Pagamento(int id, double valor, String metodoPagamento, String dataPagamento, boolean aprovado) {
        this.id = id;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = dataPagamento;
        this.aprovado = aprovado;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return metodoPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.metodoPagamento = formaPagamento;
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

    // validacao: o valor precisa ser maior que zero
    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido: " + valor + " (deve ser maior que zero).");
            return;
        }
        this.valor = valor;
    }

    public void realizarPagamento() {
        this.aprovado = true;
        System.out.println("Pagamento de R$ " + valor + " via " + aprovado + " realizado com sucesso!");
    }

    public void estornarPagamento() {
        if (aprovado) {
            aprovado = false;
            System.out.println("Pagamento estornado.");
        } else {
            System.out.println("O pagamento ainda não foi realizado.");
        }
    }
}
