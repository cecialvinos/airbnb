package imovel;

import java.time.LocalDate;

public class Disponibilidade {

    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private boolean disponivel;

    public Disponibilidade() {
        this.disponivel = true;
    }

    public Disponibilidade(LocalDate dataEntrada, LocalDate dataSaida) {
        setDataEntrada(dataEntrada);
        setDataSaida(dataSaida);
        this.disponivel = true;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void reservar() {
        if (!disponivel) {
            System.out.println("Este periodo ja esta reservado.");
            return;
        }

        disponivel = false;
        System.out.println("Periodo reservado com sucesso!");
    }

    public void liberar() {
        disponivel = true;
        System.out.println("Periodo liberado para reserva.");
    }
}