package br.com.airbnb.airbnb.src.reserva;

public class Avaliacao {
    private int nota; // 1 a 5
    private String comentario;
    private String dataAvaliacao;

    public Avaliacao() {
    }

    public Avaliacao(int nota, String comentario, String dataAvaliacao) {
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
