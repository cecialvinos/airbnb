package br.com.airbnb.airbnb.src.reserva;

public class Reserva {
    private String dataCheckIn;
    private String dataCheckOut;
    private double valorTotal;
    private String status; // ex: Pendente, Confirmada, Cancelada

    public Reserva() {
    }

    public Reserva(String dataCheckIn, String dataCheckOut, double valorTotal, String status) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
