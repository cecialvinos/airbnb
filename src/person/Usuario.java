package person;

public class Usuario {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // validacao simples: o email precisa conter '@'
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("E-mail invalido: " + email);
            return;
        }
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}