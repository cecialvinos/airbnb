package comunicacao;

public class Mensagem {
    private String texto;
    private String dataEnvio;
    private boolean lida; //123456789101112136767

    public Mensagem() {
    }

    public Mensagem(String texto, String dataEnvio, boolean lida) {
        this.texto = texto;
        this.dataEnvio = dataEnvio;
        this.lida = lida;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }
}
