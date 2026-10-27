package src.Imovel1;

import java.time.LocalDate;

public class Dispo{
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ocupado;

    public Dispo(LocalDate dataInicio, LocalDate dataFim){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ocupado = false;
    }

    public boolean verificarConflito(LocalDate dataDesejada) {

        return !dataDesejada.isBefore(dataInicio) && !dataDesejada.isAfter(dataFim);
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
