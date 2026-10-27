package src.pag;

public class Pag{
    private String metodo;
    private double valor;
    private boolean pago;


    public Pag(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
        this.pago = false;
    }


    public void realizarPagamento() {
        this.pago = true;
        System.out.println("Pagamento de R$ " + valor + " via " + metodo + " realizado com sucesso!");
    }


    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }
}
