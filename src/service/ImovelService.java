package service;

import imovel.Endereco;
import imovel.Imovel;
import java.util.Scanner;

public class ImovelService {

    public void cadastrarEndereco() {

        Endereco endereco = new Endereco();
        Imovel imovel = new Imovel();
        Scanner sc = new Scanner(System.in);

        System.out.println("============ CADASTRO DE IMÓVEL ============");
        System.out.println();
        System.out.print("Digite 0 para voltar e 1 para continuar: ");
        int escolha = sc.nextInt();
        System.out.println();

        switch (escolha) {

            case 1:
                imovel.getNomeImovel();
                endereco.getPais();
                endereco.getEstado();
                endereco.getCidade();
                endereco.getCep();
                endereco.getRua();
                endereco.getNumero();
                endereco.getBairro();
                System.out.println();
                break;

            case 0:
                System.out.println();
                break;

            default:
                System.out.print("Tente novamente. Digite: ");
                escolha = sc.nextInt();
                System.out.println();
                break;
        }
    }
}
