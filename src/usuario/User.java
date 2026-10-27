package usuario;

public class User{
    private String nome;
    private String senha;
    private boolean ehAnfitriao;

    public User(String nome, String senha, String telefone, boolean ehAnfitriao){
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.ehAnfitriao = ehAnfitriao;
    }

    public String getNome() { return nome; }
    public String getSenha() { return senha; }
    public String getTelefone() { return telefone; }
    public boolean isEhAnfitriao() { return ehAnfitriao; }
}
