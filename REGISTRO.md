# Registro das etapas - Projeto Airbnb (POO em Java)

## 1. Compreensão do problema
O sistema representa uma plataforma de aluguel por temporada: proprietários anunciam imóveis e hóspedes fazem reservas.
Funcionalidades básicas: cadastrar/editar/remover imóveis (proprietário) e pesquisar/reservar/cancelar reservas (hóspede).

## 2. Entidades escolhidas
Usuario, Hospede, Proprietario, Endereco, TipoImovel, Disponibilidade e Pagamento.
Além delas: MenuPrincipal, MenuHospede e MenuProprietario (menus de console) e a classe Main, que testa as classes.

## 3. Abstração e atributos
| Classe | Atributos | Tipos | Significado |
|---|---|---|---|
| Usuario | nome, cpf, email, senha | String | Dados de identificação e acesso |
| Endereco | rua, numero, bairro, cidade, estado, cep | String | Localização do imóvel |
| TipoImovel | nome, descricao | String | Categoria do imóvel (casa, apartamento...) |
| Disponibilidade | dataEntrada, dataSaida | LocalDate | Período do anúncio |
| Disponibilidade | disponivel | boolean | Se o período pode ser reservado |
| Pagamento | id | int | Identificador |
| Pagamento | valor | double | Valor a pagar |
| Pagamento | metodo | String | Forma de pagamento |
| Pagamento | pago | boolean | Se o pagamento foi realizado |

Hospede e Proprietario não têm atributos próprios: usam os herdados de Usuario e acrescentam apenas métodos.

## 4 e 5. Classes e modificadores de acesso
Primeiro todos os atributos `public`; depois alterados para `private` para proteger os dados (encapsulamento).
O acesso passou a ser feito por getters e setters.

## 6. Construtores
Todas as classes têm um construtor sem parâmetros e outro com os principais atributos. `this` diferencia o atributo
do parâmetro de mesmo nome. Em Hospede e Proprietario, o construtor completo chama `super(...)`.

## 7. Getters, setters e validação
Cada atributo tem `get`/`set`. Validações simples nos setters:
- `Usuario.setEmail` exige que o e-mail contenha '@';
- `Pagamento.setValor` exige valor maior que zero.

## 8 e 9. Herança
Hospede **é um** Usuario e Proprietario **é um** Usuario. Compartilham nome, cpf, email e senha (ficam em Usuario).
Usa-se `extends` e `super()`. Métodos herdados demonstrados na Main: `getNome()`, `getEmail()` e `setNome()`.
As outras classes não usam herança: Endereco, TipoImovel, Disponibilidade e Pagamento não são "um tipo de" outra classe.

## 10. Testes (Main) - saída real da execução
```
=== 1. Construtores com parametros ===
Objetos criados: Ana Souza, Carlos Lima, Casa e pagamento 1

=== 2. Construtores sem parametros + setters ===
Hospede criado sem parametros: Maria Silva
Periodo vazio disponivel: true

=== 3. Getters ===
Proprietario: Ana Souza | CPF: 111.222.333-44
Hospede: Carlos Lima | E-mail: carlos@email.com
Cidade: Recife/PE
Entrada: 2026-12-20 | Saida: 2026-12-27
Valor do pagamento: R$ 2450.0

=== 4. Setters e validacao ===
E-mail alterado para: carlos.lima@email.com
E-mail invalido: email-sem-arroba
E-mail continua: carlos.lima@email.com
Valor invalido: -100.0 (deve ser maior que zero).
Valor continua: R$ 2450.0
Metodo alterado para: Cartao

=== 5. Heranca: metodos herdados de Usuario ===
Hospede e Proprietario herdam getNome() e getEmail():
Carlos Lima / Ana Souza
Nome do proprietario apos setNome herdado: Ana Souza Lima

=== 6. Metodos dos objetos ===
Av. Beira Mar, 100
Boa Viagem - Recife/PE
CEP: 51111-000
Tipo de imovel: Casa
Descricao: Casa de praia com varanda
Periodo reservado com sucesso!
Este periodo ja esta reservado.
Periodo liberado para reserva.
Pagamento registrado com sucesso!
Pagamento estornado.
O pagamento ainda não foi realizado.
```
