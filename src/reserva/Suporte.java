package src.reserva;

import java.time.LocalDateTime;

public class Suporte{
    private int id;
    private String nomeCliente;
    private String assunto;
    private String descricao;
    private String status;
    private String respostaSuporte;
    private LocalDateTime dataAbertura;

    public Suporte(int id, String nomeCliente, String assunto, String descricao) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.assunto = assunto;
        this.descricao = descricao;
        this.status = "Aberto";
        this.respostaSuporte = "Aguardando atendimento.";
        this.dataAbertura = LocalDateTime.now();
    }

    public void responderChamado(String resposta, String novoStatus) {
        this.respostaSuporte = resposta;
        this.status = novoStatus;
        System.out.println("Chamado #" + id + " atualizado para: " + novoStatus);
    }

    public int getId() { return id; }
    public String getNomeCliente() { return nomeCliente; }
    public String getAssunto() { return assunto; }
    public String getDescricao() { return descricao; }
    public String getStatus() { return status; }
    public String getRespostaSuporte() { return respostaSuporte; }
    public LocalDateTime getDataAbertura() { return dataAbertura; }

    public void setStatus(String status) { this.status = status; }

}
