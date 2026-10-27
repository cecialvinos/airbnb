package comunicacao;

public class ChamadoSuporte {
    private String motivo;
    private String status;

    private String dataAbertura;

    public ChamadoSuporte() {
    }

    public ChamadoSuporte(String motivo, String status, boolean urgente, String dataAbertura) {
        this.motivo = motivo;
        this.status = status;
        this.urgente = urgente;
        this.dataAbertura = dataAbertura;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
