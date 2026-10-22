package menu;

import imovel.Disponibilidade;
import imovel.Endereco;
import imovel.TipoImovel;
import pagamento.Pagamento;
import person.Hospede;
import person.Proprietario;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();
    }
}