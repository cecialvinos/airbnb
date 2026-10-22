# Registro das etapas - Projeto Airbnb (POO em Java)

**Aluno(a)/equipe:** Maria Cecília Alvino
**Turma:** segundo período
**Data:** 21/10/26

## 1. Compreensão do problema
O sistema representa uma plataforma de aluguel por temporada: proprietários anunciam imóveis e hóspedes fazem reservas.
Funcionalidades básicas: cadastrar/remover imóveis (proprietário) e reservar/cancelar reservas (hóspede).

## 2. Entidades escolhidas
Usuario, Hospede, Proprietario, Imovel, Endereco, TipoImovel, Disponibilidade e Pagamento (8 entidades) + Main de testes (9 classes).

**Decisão:** a primeira versão não tinha a classe `Imovel`, apesar de ser a entidade central do sistema, então ela foi criada
para ligar `Endereco`, `TipoImovel` e `Disponibilidade`. As classes de menu foram removidas: eram apenas telas de texto
(funcionalidades, não entidades) e a `Main` de testes passou a demonstrar o funcionamento do sistema.

## 3. Abstração e atributos
| Classe | Atributo | Tipo | Significado |
|---|---|---|---|
| Usuario | nome, cpf, email, senha | String | Dados de identificação e acesso |
| Hospede | totalReservas | int | Reservas ativas do hóspede |
| Proprietario | totalImoveis | int | Imóveis cadastrados pelo proprietário |
| Imovel | titulo | String | Nome do anúncio |
| Imovel | precoDiaria | double | Valor da diária |
| Imovel | endereco, tipo, disponibilidade | Endereco, TipoImovel, Disponibilidade | Objetos que compõem o imóvel |
| Endereco | rua, numero, cidade, estado, cep | String | Localização do imóvel |
| TipoImovel | nome, descricao | String | Categoria do imóvel (casa, apartamento...) |
| TipoImovel | numeroQuartos | int | Quantidade de quartos |
| Disponibilidade | dataEntrada, dataSaida | LocalDate | Período do anúncio |
| Disponibilidade | disponivel | boolean | Se o período pode ser reservado |
| Pagamento | id | int | Identificador |
| Pagamento | valor | double | Valor a pagar |
| Pagamento | metodo | String | Forma de pagamento (Pix, cartão...) |
| Pagamento | pago | boolean | Se o pagamento foi realizado |

**Ignorado na abstração:** fotos, avaliações, bairro, comodidades, regras da casa.

## 4 e 5. Classes e modificadores de acesso
Primeiro todos os atributos `public`; depois alterados para `private` para proteger os dados (encapsulamento).
Acessar `imovel.precoDiaria` fora da classe deixou de compilar; o acesso passou a ser por getters e setters.

## 6. Construtores
Todas as classes têm um construtor sem parâmetros e outro com os principais atributos. `this` diferencia o atributo
do parâmetro de mesmo nome. Nas subclasses o construtor completo chama `super(...)`.

## 7. Getters, setters e validação
Cada atributo tem `get`/`set`. Validações nos setters:
- `Usuario.setEmail` exige '@' e `Usuario.setNome` não aceita vazio;
- `Imovel.setPrecoDiaria` e `Pagamento.setValor` exigem valor maior que zero;
- `Endereco.setCep` exige 8 dígitos;
- `TipoImovel.setNumeroQuartos` exige ao menos 1;
- `Disponibilidade.setDataSaida` não aceita data anterior à entrada.

Os construtores com parâmetros usam os setters para reaproveitar essas validações.

## 8 e 9. Herança
Hospede **é um** Usuario e Proprietario **é um** Usuario. Compartilham nome, cpf, email e senha (ficam em Usuario).
Cada subclasse mantém o atributo próprio (`totalReservas` / `totalImoveis`) e seus métodos.
Usa-se `extends` e `super()`. As demais classes **não** usam herança: Imovel, Endereco, TipoImovel, Disponibilidade e
Pagamento não são "um tipo de" outra classe; têm relação de composição ("tem um"), por exemplo Imovel tem um Endereco.
Método herdado demonstrado: `exibirDados()`.

## 10. Testes (Main) - saída real da execução
```
=== 1. Construtores com parametros ===
Criados: Ana Souza, Carlos Lima e Casa na praia

=== 2. Construtor sem parametros + setters ===
Imovel: Apartamento centro | Diaria: R$ 180.0
Tipo de imovel: Apartamento
Descricao: Apartamento no centro da cidade
Quartos: 2
Rua do Comercio, 45
Caruaru/PE
CEP: 55000-000
Disponivel: sim

=== 3. Getters ===
Nome do proprietario: Ana Souza
E-mail do hospede: carlos@email.com
Preco da casa: R$ 350.0
Cidade da casa: Recife
Quartos da casa: 3

=== 4. Setters com validacao ===
Preco invalido: -50.0 (deve ser maior que zero).
Preco continua: R$ 350.0
Novo preco: R$ 400.0
E-mail invalido: email-sem-arroba
E-mail continua: carlos@email.com
CEP invalido: 123 (deve ter 8 digitos).
CEP continua: 50000-000
Data de saida invalida: 2026-12-01 (antes da entrada).
Saida continua: 2026-12-27

=== 5. Metodo herdado de Usuario (exibirDados) ===
Nome: Ana Souza
CPF: 111.222.333-44
E-mail: ana@email.com
--
Nome: Carlos Lima
CPF: 555.666.777-88
E-mail: carlos@email.com

=== 6. Metodos proprios das subclasses ===
Ana Souza cadastrou o imovel: Casa na praia
Ana Souza cadastrou o imovel: Apartamento centro
Total de imoveis de Ana Souza: 2
Carlos Lima reservou: Casa na praia
Casa na praia nao esta disponivel.
Total de reservas de Carlos Lima: 1

=== 7. Pagamento ===
Valor: R$ 2800.0 | Metodo: Pix | Pago: false
Pagamento registrado com sucesso!
Pago: true
Pagamento estornado.
Carlos Lima cancelou a reserva de: Casa na praia
Imovel: Casa na praia | Diaria: R$ 400.0
Tipo de imovel: Casa
Descricao: Casa de praia com varanda
Quartos: 3
Av. Beira Mar, 100
Recife/PE
CEP: 50000-000
Disponivel: sim

=== 8. Objeto Usuario (superclasse) ===
Nome: Maria
CPF: 999.888.777-66
E-mail: maria@email.com
```
