Como clonar o repositório noutra máquina

Segue os passos abaixo para obter o projecto na tua máquina local.

### 1. Instalar o Git

Antes de começar, certifica-te de que tens o Git instalado.

- Download: https://git-scm.com/downloads
- Para verificar a instalação, abre o terminal e executa:

```bash
git --version
```

### 2. Clonar o repositório

Abre o terminal (PowerShell, CMD ou terminal do IntelliJ IDEA) e executa:

```bash
git clone https://github.com/cecialvinos/airbnb.git
```

Este comando irá descarregar o repositório para a tua máquina, incluindo os ficheiros e o histórico de versões disponível no GitHub.

### 3. Entrar na pasta do projecto

```bash
cd airbnb
```

### 4. Abrir o projecto no IntelliJ IDEA

1. Abre o IntelliJ IDEA.
2. Selecciona **Open**.
3. Escolhe a pasta `airbnb` que acabaste de clonar.
4. Aguarda que o IntelliJ IDEA carregue e configure o projecto.

### 5. Executar o projecto

Se o projecto utilizar Java, certifica-te de que tens o JDK necessário instalado.

Podes verificar a instalação com:

```bash
java -version
```

Abre o projecto no IntelliJ IDEA, verifica a configuração do JDK e executa a classe principal (`main`) da aplicação.

**Nota:** Os passos de execução podem variar consoante a configuração e as dependências do projecto.

### 6. Actualizar o projecto

Para obter as alterações mais recentes do GitHub, executa estes comandos dentro da pasta do projecto:

```bash
git pull origin main
```

### Requisitos

- Git instalado
- IntelliJ IDEA (recomendado)
- JDK compatível com o projecto, caso seja uma aplicação Java
- Ligação à Internet

### Repositório

GitHub: https://github.com/cecialvinos/airbnb

