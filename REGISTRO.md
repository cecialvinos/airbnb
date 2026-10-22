# Registro das etapas - Projeto Airbnb (POO em Java)

**Aluno(a)/equipe:** Maria Cecília Alvino
**Turma:** segundo período
**Data:** 21/10/26

## 1. Compreensão do problema
O sistema representa uma plataforma de aluguel por temporada: proprietários anunciam imóveis e hóspedes fazem reservas.
Funcionalidades básicas: cadastrar/remover imóveis (proprietário) e reservar/cancelar reservas (hóspede).

## 2. Entidades escolhidas
Usuario, Hospede, Proprietario e Imovel (4 entidades) + Main de testes

## 3. Abstração e atributos
| Classe | Atributo | Tipo | Significado |
|---|---|---|---|
| Usuario | nome, cpf, email, senha | String | Dados de identificação e acesso |
| Hospede | totalReservas | int | Reservas ativas do hóspede |
| Proprietario | totalImoveis | int | Imóveis cadastrados pelo proprietário |
| Imovel | titulo, cidade | String | Nome do anúncio e localização |
| Imovel | precoDiaria | double | Valor da diária |
| Imovel | capacidade | int | Número máximo de hóspedes |
| Imovel | disponivel | boolean | Se pode ser reservado |

## 4 e 5. Classes e modificadores de acesso
Primeiro todos os atributos `public`; depois alterados para `private` para proteger os dados (encapsulamento).

## 6. Construtores
Todas as classes têm um construtor sem parâmetros e outro com os principais atributos. `this` diferencia o atributo
do parâmetro de mesmo nome. Nas subclasses o construtor completo chama `super(...)`.

## 7. Getters, setters e validação
Cada atributo tem `get`/`set`. Validações: `Usuario.setEmail` exige '@'; `Usuario.setNome` não aceita vazio;
`Imovel.setPrecoDiaria` exige valor maior que zero; `Imovel.setCapacidade` exige ao menos 1.
Os construtores com parâmetros usam os setters para reaproveitar essas validações.

## 8 e 9. Herança
Hospede **é um** Usuario e Proprietario **é um** Usuario. Compartilham nome, cpf, email e senha (ficam em Usuario).
Cada subclasse mantém o atributo próprio (`totalReservas` / `totalImoveis`) e seus métodos.
Usa-se `extends` e `super()`. Imovel **não** herda de nada: não é um tipo de usuário.
Método herdado demonstrado: `exibirDados()`.

## 10. Testes (Main) - saída real da execução
```
=== 1. Construtor com parametros ===
Criados: Ana Souza, Carlos Lima e Casa na praia

=== 2. Construtor sem parametros + setters ===
Imovel: Apartamento centro (Caruaru)
Diaria: R$ 180.0 | Capacidade: 3
Disponivel: sim

=== 3. Getters ===
Nome do proprietario: Ana Souza
E-mail do hospede: carlos@email.com
Preco da casa: R$ 350.0

=== 4. Setters com validacao ===
Preco invalido: -50.0 (deve ser maior que zero).
Preco continua: R$ 350.0
Novo preco: R$ 400.0
E-mail invalido: email-sem-arroba
E-mail continua: carlos@email.com

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
Carlos Lima cancelou a reserva de: Casa na praia
Imovel: Casa na praia (Recife)
Diaria: R$ 400.0 | Capacidade: 6
Disponivel: sim

=== 7. Objeto Usuario (superclasse) ===
Nome: Maria
CPF: 999.888.777-66
E-mail: maria@email.com
```
