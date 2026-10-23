package service;

import imovel.Endereco;
import imovel.Imovel;

import java.util.Scanner;

public class ImovelService {

    private Scanner sc;

    public void cadastrarEndereco() {

        Endereco endereco = new Endereco();
        Imovel imovel = new Imovel();

        System.out.println("============ CADASTRO DE IMÓVEL ============");
        System.out.print("Digite 0 para voltar e 1 para continuar: ");
        int escolha = sc.nextInt();
        System.out.println();

        do {
            imovel.getNomeImovel();
            endereco.getPais();
            endereco.getEstado();
            endereco.getCidade();
            endereco.getCep();
            endereco.getRua();
            endereco.getNumero();
            endereco.getBairro();
        } while (escolha != 0);
    }
}
