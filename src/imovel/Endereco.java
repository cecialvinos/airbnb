package imovel;

import java.util.Scanner;

public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private  String pais;
    private Scanner sc;

    public Endereco() {
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, int cep, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = pais;
    }

    public String getRua() {
        System.out.print("Digite a rua: ");
        return sc.nextLine();
    }

    public int getNumero() {
        System.out.print("Digite o número: ");
        return sc.nextInt();
    }

    public String getBairro() {
        System.out.print("Digite o bairro: ");
        return sc.nextLine();
    }

    public String getCidade() {
        System.out.print("Digite a cidade: ");
        return sc.nextLine();
    }

    public String getEstado() {
        System.out.print("Digite 0 estado: ");
        return sc.nextLine();
    }

    public int getCep() {
        System.out.print("Digite o CEP: ");
        return sc.nextInt();
    }

    public String getPais() {
        System.out.print("Digite o país: ");
        return  sc.nextLine();
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