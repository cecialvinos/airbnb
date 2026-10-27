package promocao;

public class ProgramaFidelidade {
    private int pontosAcumulados;
    private String nivelCategoria; // ex: Prata, Ouro, Diamante
    private boolean ativo;

    public ProgramaFidelidade() {
    }

    public ProgramaFidelidade(int pontosAcumulados, String nivelCategoria, boolean ativo) {
        this.pontosAcumulados = pontosAcumulados;
        this.nivelCategoria = nivelCategoria;
        this.ativo = ativo;
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void setPontosAcumulados(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }

    public String getNivelCategoria() {
        return nivelCategoria;
    }

    public void setNivelCategoria(String nivelCategoria) {
        this.nivelCategoria = nivelCategoria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
