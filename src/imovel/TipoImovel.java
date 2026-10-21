package imovel;

public class TipoImovel {

    private String nome;
    private String descricao;

    public TipoImovel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTipo() {
        System.out.println("Tipo de imovel: " + nome);
        System.out.println("Descricao: " + descricao);
    }
}
