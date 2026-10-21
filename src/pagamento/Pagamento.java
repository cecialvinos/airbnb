package pagamento;

public class Pagamento {

    private int id;
    private double valor;
    private String metodo;
    private boolean pago;

    public Pagamento() {

    }

    public Pagamento(int id, double valor, String metodo) {
        this.id = id;
        this.valor = valor;
        this.metodo = metodo;
        this.pago = false;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public boolean isPago() {
        return pago;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor deve ser maior que zero."
            );
        }
        this.valor = valor;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void realizarPagamento() {
        pago = true;
        System.out.println("Pagamento registrado com sucesso!");
    }

    public void estornarPagamento() {
        if (pago) {
            pago = false;
            System.out.println("Pagamento estornado.");
        } else {
            System.out.println("O pagamento ainda não foi realizado.");
        }
    }
}
