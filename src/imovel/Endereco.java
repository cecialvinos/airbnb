package imovel;

import java.util.Scanner;

public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private Scanner sc;

    public Endereco() {
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        System.out.print("Digite sua rua: ");
        return sc.nextLine();
    }

    public int getNumero() {
        System.out.print("Digite seu número: ");
        return sc.nextInt();
    }

    public String getBairro() {
        System.out.print("Digite seu bairro: ");
        return sc.nextLine();
    }

    public String getCidade() {
        System.out.print("Digite sua cidade: ");
        return sc.nextLine();
    }

    public String getEstado() {
        System.out.print("Digite seu estado: ");
        return sc.nextLine();
    }

    public int getCep() {
        System.out.print("Digite seu CEP: ");
        return sc.nextInt();
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void exibirEndereco() {
        System.out.println(rua + ", " + numero);
        System.out.println(bairro + " - " + cidade + "/" + estado);
        System.out.println("CEP: " + cep);
    }
}