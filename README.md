
# Projeto: Sistema de Cadastro e Gerenciamento de Pokémons

## Informações Gerais sobre o Projeto

Este projeto é um sistema de cadastro e gerenciamento de Pokémons, desenvolvido em Java. Ele permite adicionar, listar e gerenciar diferentes tipos de Pokémons, categorizados por suas características (água, fogo e grama).

### Objetivos

- Criar um sistema que permita o cadastro de diferentes tipos de Pokémons.
- Gerenciar as informações dos Pokémons cadastrados.
- Implementar funcionalidades básicas de CRUD (Create, Read, Update, Delete) para Pokémons.

### Funcionalidades Principais

- **Cadastro de Pokémons**: Permite adicionar novos Pokémons ao sistema, especificando seu tipo (água, fogo ou grama).
- **Listagem de Pokémons**: Exibe todos os Pokémons cadastrados.
- **Gerenciamento de Pokémons**: Facilita a organização e consulta das informações dos Pokémons cadastrados.
- **Tratamento de Exceções**: Implementa tratamento adequado de erros para garantir a robustez da aplicação.
- **Persistência de Dados**: Leitura e gravação de dados em arquivos de texto para armazenar as informações dos Pokémons.

## Informações sobre as Classes e suas Relações

### Classes

- **Pokemon.java**: Classe abstrata que define as propriedades e métodos comuns a todos os Pokémons.
- **PokemonAgua.java**: Classe que herda de `Pokemon` e representa Pokémons do tipo água.
- **PokemonFogo.java**: Classe que herda de `Pokemon` e representa Pokémons do tipo fogo.
- **PokemonGrama.java**: Classe que herda de `Pokemon` e representa Pokémons do tipo grama.
- **Treinador.java**: Classe que representa um treinador de Pokémons.
- **CadastroPokemons.java**: Classe responsável pelo cadastro dos Pokémons.
- **SistemaPokemon.java**: Classe que gerencia o sistema de Pokémons, incluindo adição e listagem.
- **Console.java**: Classe que gerencia a interface do console para interação com o usuário.
- **Main.java**: Classe principal que contém o método `main` para iniciar a aplicação.

### Relações entre as Classes

- **Associação**: `Treinador` possui uma associação com `Pokemon` indicando que um treinador pode ter vários Pokémons.
- **Herança**: `PokemonAgua`, `PokemonFogo` e `PokemonGrama` herdam da classe abstrata `Pokemon`.
- **Composição**: `CadastroPokemons` e `SistemaPokemon` utilizam instâncias de `Pokemon` para realizar suas funcionalidades.

## Como Executar o Projeto

1. **Pré-requisitos**: 
    - Certifique-se de ter o JDK instalado em sua máquina.
    - Um ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA.

2. **Clonar o Repositório**:
    ```bash
    git clone <URL do repositório>
    cd AtividadeFinal-main
    ```

3. **Compilar o Projeto**:
    - Abra o projeto em seu IDE de preferência e compile os arquivos `.java`.

4. **Executar o Projeto**:
    - Execute a classe `Main.java` que contém o método `main` para iniciar a aplicação.

## Uso do ChatGPT

O ChatGPT foi utilizado para auxiliar na criação da documentação do projeto, fornecendo um formato adequado para o README.md e sugerindo melhorias na descrição das classes e funcionalidades. Ele também ajudou a estruturar as instruções de execução e a organizar as informações sobre as relações entre as classes.

## Referências e Recursos

- Documentação do Java: Materiais fornecidos em aula. 
- GitHub: Plataforma para hospedagem e versionamento de código.

---

Este projeto foi desenvolvido por:
- Diônatas Gabriel, Estudante de Engenharia de Software na Universidade Positivo.
- Mariana Kleina, Estudante de Engenharia de Software na Universidade Positivo.
