# Sistema de Gestão de Concessionária de Motos

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos (POO). Trata-se de um sistema desktop completo em Java Swing para gerenciar as operações de uma concessionária de motos, construído com o objetivo de aplicar na prática os principais conceitos de POO e desenvolvimento de interfaces gráficas.

O sistema evoluiu de uma aplicação de console para uma interface gráfica funcional, utilizando `ArrayList` como base de dados em memória e aplicando padrões de projeto como o Singleton para o gerenciamento de janelas e dados.

## Funcionalidades Principais

O sistema oferece um CRUD (Create, Read, Update, Delete) completo para as principais entidades de uma concessionária:

- **Cadastro de Motocicletas:**
  - Inclusão de motos de três categorias distintas: **Nacionais**, **Importadas** e **Esportivas**, cada uma com seus atributos específicos.
- **Cadastro de Acessórios:**
  - Inclusão de acessórios avulsos que podem ser vendidos na concessionária.
- **Gestão Completa (Consulta, Alteração e Exclusão):**
  - Uma tela dedicada para buscar, visualizar, alterar e excluir registros de motos e acessórios, consolidando as operações de gerenciamento.
- **Relatórios Detalhados:**
  - **Relatório Geral:** Exibe todas as motocicletas cadastradas em uma `JTable`, demonstrando o uso de polimorfismo para exibir detalhes específicos de cada tipo de moto.
  - **Relatórios Específicos:** Filtra e exibe em tabelas separadas apenas as motos Nacionais, Importadas ou Esportivas.
  - **Relatório de Acessórios:** Apresenta todos os acessórios cadastrados utilizando um componente `JList`.

## Tecnologias e Conceitos de POO Aplicados

Este projeto foi uma oportunidade para aplicar de forma prática um vasto conjunto de tecnologias e conceitos fundamentais.

- **Linguagem:** Java (JDK 11+)
- **Interface Gráfica:** Java Swing (`JFrame`, `JPanel`, `JButton`, `JTextField`, `JLabel`, `JTable`, `JList`, `JOptionPane`).
- **Build Tool:** Apache Maven
- **Conceitos de POO:**
  - **Encapsulamento:** Utilização de modificadores de acesso `private` para os atributos e `public` para os métodos getters e setters.
  - **Herança:** Classe `Motocicleta` como superclasse abstrata e `MotoNacional`, `MotoImportada`, e `MotoEsportiva` como subclasses.
  - **Polimorfismo:** Sobrescrita de métodos (`@Override`) para comportamentos específicos e Sobrecarga de métodos.
  - **Abstração:** Uso de classes e métodos abstratos para definir contratos na hierarquia de classes.
- **Estruturas de Dados:**
  - `Interface` para definir contratos (`Anunciavel`).
  - Collections (`ArrayList`) para atuar como banco de dados em memória.
- **Tratamento de Exceções:**
  - Criação e uso de exceções customizadas para regras de negócio (ex: `MotoJaCadastradaException`).
- **Padrões de Projeto (Design Patterns):**
  - **Singleton:** Aplicado em todos os formulários (`JFrame`) e nas classes de acesso a dados (`BD...`) para garantir uma única instância de cada.

## Como Executar o Projeto

Para executar este projeto, você precisará ter o **Apache NetBeans IDE** e um **JDK (versão 11 ou superior)** instalados.

1.  Clone este repositório para a sua máquina local.
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    ```
2.  Abra o NetBeans e vá em `File > Open Project...`.
3.  Navegue até a pasta do projeto clonado e clique em `Open Project`.
4.  Clique com o botão direito sobre o projeto na aba "Projects" e selecione **`Clean and Build`** para que o Maven baixe as dependências e compile o código.
5.  Após o "Build Success", clique com o botão direito no projeto novamente e selecione **`Run`** (ou pressione a tecla F6). A aplicação será iniciada a partir do `FormPrincipal`.

## Telas da Aplicação

*Adicione aqui screenshots da sua aplicação para ilustrar as funcionalidades. Isso valoriza muito o seu README!*

**Tela Principal (Dashboard)**
![Tela Principal](caminho/para/sua/imagem_principal.png)

**Formulário de Cadastro**
![Tela de Cadastro](caminho/para/sua/imagem_cadastro.png)

**Relatório em Tabela (JTable)**
![Relatório em Tabela](caminho/para/sua/imagem_relatorio_tabela.png)

**Formulário de Gestão (CRUD)**
![Tela de Gestão](caminho/para/sua/imagem_gestao.png)

## Autor

Desenvolvido por **Samuel Ueno Fernandes** para o projeto final da disciplina de Programação Orientada a Objetos.

*Projeto desenvolvido com o auxílio e a orientação da IA Gemini da Google para fins de aprendizado, desenvolvimento de lógica e revisão de código.*
