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

        System.out.println("=== 1. Construtores com parametros ===");
        Proprietario dono = new Proprietario("Ana Souza", "111.222.333-44", "ana@email.com", "1234");
        Hospede hospede = new Hospede("Carlos Lima", "555.666.777-88", "carlos@email.com", "abcd");
        Endereco endereco = new Endereco("Av. Beira Mar", "100", "Boa Viagem", "Recife", "PE", "51111-000");
        TipoImovel tipo = new TipoImovel("Casa", "Casa de praia com varanda");
        Disponibilidade periodo = new Disponibilidade(LocalDate.of(2026, 12, 20), LocalDate.of(2026, 12, 27));
        Pagamento pagamento = new Pagamento(1, 2450.0, "Pix");
        System.out.println("Objetos criados: " + dono.getNome() + ", " + hospede.getNome()
                + ", " + tipo.getNome() + " e pagamento " + pagamento.getId());

        System.out.println();
        System.out.println("=== 2. Construtores sem parametros + setters ===");
        Hospede novoHospede = new Hospede();
        novoHospede.setNome("Maria Silva");
        novoHospede.setCpf("999.888.777-66");
        novoHospede.setEmail("maria@email.com");
        novoHospede.setSenha("0000");
        Endereco outroEndereco = new Endereco();
        outroEndereco.setRua("Rua do Comercio");
        outroEndereco.setNumero("45");
        outroEndereco.setBairro("Centro");
        outroEndereco.setCidade("Caruaru");
        outroEndereco.setEstado("PE");
        outroEndereco.setCep("55000-000");
        Disponibilidade periodoVazio = new Disponibilidade();
        TipoImovel tipoVazio = new TipoImovel();
        tipoVazio.setNome("Apartamento");
        tipoVazio.setDescricao("Apartamento no centro");
        System.out.println("Hospede criado sem parametros: " + novoHospede.getNome());
        System.out.println("Periodo vazio disponivel: " + periodoVazio.isDisponivel());

        System.out.println();
        System.out.println("=== 3. Getters ===");
        System.out.println("Proprietario: " + dono.getNome() + " | CPF: " + dono.getCpf());
        System.out.println("Hospede: " + hospede.getNome() + " | E-mail: " + hospede.getEmail());
        System.out.println("Cidade: " + endereco.getCidade() + "/" + endereco.getEstado());
        System.out.println("Entrada: " + periodo.getDataEntrada() + " | Saida: " + periodo.getDataSaida());
        System.out.println("Valor do pagamento: R$ " + pagamento.getValor());

        System.out.println();
        System.out.println("=== 4. Setters e validacao ===");
        hospede.setEmail("carlos.lima@email.com");
        System.out.println("E-mail alterado para: " + hospede.getEmail());
        hospede.setEmail("email-sem-arroba");
        System.out.println("E-mail continua: " + hospede.getEmail());
        pagamento.setValor(-100);
        System.out.println("Valor continua: R$ " + pagamento.getValor());
        pagamento.setMetodo("Cartao");
        System.out.println("Metodo alterado para: " + pagamento.getMetodo());

        System.out.println();
        System.out.println("=== 5. Heranca: metodos herdados de Usuario ===");
        System.out.println("Hospede e Proprietario herdam getNome() e getEmail():");
        System.out.println(hospede.getNome() + " / " + dono.getNome());
        dono.setNome("Ana Souza Lima");
        System.out.println("Nome do proprietario apos setNome herdado: " + dono.getNome());

        System.out.println();
        System.out.println("=== 6. Metodos dos objetos ===");
        endereco.exibirEndereco();
        tipo.exibirTipo();
        periodo.reservar();
        periodo.reservar();
        periodo.liberar();
        pagamento.realizarPagamento();
        pagamento.estornarPagamento();
        pagamento.estornarPagamento();
    }
}