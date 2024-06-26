import java.io.*;
import java.util.List;

public class SistemaPokemon {

    private static void exibirMenu() {
        System.out.println("\n=== Menu da Pokestore ===");
        System.out.println("1. Cadastrar Pokémon");
        System.out.println("2. Buscar Pokémon");
        System.out.println("3. Listar Pokémons de Água");
        System.out.println("4. Listar Pokémons de Fogo");
        System.out.println("5. Listar Pokémons de Grama");
        System.out.println("6. Listar todos os Pokémons");
        System.out.println("7. Remover Pokémon");
        System.out.println("8. Excluir todos os Pokémons");
        System.out.println("9. Editar Pokémon");
        System.out.println("10. Salvar Pokémons em Arquivo");
        System.out.println("11. Carregar Pokémons de Arquivo");
        System.out.println("12. Cadastrar Treinador");
        System.out.println("13. Listar Treinadores");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void verificarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarPokemon();
                break;
            case 2:
                buscarPokemon();
                break;
            case 3:
                listarPokemons(CadastroPokemons.getPokemonsPorTipo(PokemonAgua.class));
                break;
            case 4:
                listarPokemons(CadastroPokemons.getPokemonsPorTipo(PokemonFogo.class));
                break;
            case 5:
                listarPokemons(CadastroPokemons.getPokemonsPorTipo(PokemonGrama.class));
                break;
            case 6:
                listarPokemons(CadastroPokemons.getListaPokemons());
                break;
            case 7:
                removerPokemon();
                break;
            case 8:
                excluirTodosPokemons();
                break;
            case 9:
                editarPokemon();
                break;
            case 10:
                salvarPokemonsEmArquivo();
                break;
            case 11:
                carregarPokemonsDeArquivo();
                break;
            case 12:
                cadastrarTreinador();
                break;
            case 13:
                listarTreinadores();
                break;
            case 0:
                System.out.println("\nSaindo da Pokestore...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
        System.out.println();
    }

    private static void cadastrarPokemon() {
        System.out.print("\nInforme o nome do Pokémon: ");
        String nome = Console.lerString();
        System.out.print("Informe o tipo (Água, Fogo, Grama): ");
        String tipo = Console.lerString();
        System.out.print("Informe o nível: ");
        int nivel = Console.lerInt();

        switch (tipo.toLowerCase()) {
            case "água":
                CadastroPokemons.cadastrar(new PokemonAgua(nome, nivel, true));
                System.out.println("\nPokémon de Água cadastrado com sucesso!");
                break;
            case "fogo":
                CadastroPokemons.cadastrar(new PokemonFogo(nome, nivel, 100));
                System.out.println("\nPokémon de Fogo cadastrado com sucesso!");
                break;
            case "grama":
                CadastroPokemons.cadastrar(new PokemonGrama(nome, nivel, 50));
                System.out.println("\nPokémon de Grama cadastrado com sucesso!");
                break;
            default:
                System.out.println("\nTipo de Pokémon inválido.");
                break;
        }
    }

    private static void buscarPokemon() {
        System.out.print("\nInforme o nome do Pokémon: ");
        String nome = Console.lerString();
        Pokemon pokemon = CadastroPokemons.buscarPokemon(nome);
        if (pokemon != null) {
            System.out.println("\nPokémon encontrado:");
            System.out.println(pokemon);
        } else {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    private static void listarPokemons(List<Pokemon> pokemons) {
        if (pokemons.isEmpty()) {
            System.out.println("Não há Pokémons cadastrados.");
        } else {
            System.out.println("\nLista de Pokémons:");
            for (Pokemon pokemon : pokemons) {
                System.out.println(pokemon);
            }
        }
    }

    private static void removerPokemon() {
        System.out.print("\nInforme o nome do Pokémon: ");
        String nome = Console.lerString();
        if (CadastroPokemons.excluir(nome)) {
            System.out.println("\nPokémon removido com sucesso!");
        } else {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    private static void excluirTodosPokemons() {
        CadastroPokemons.excluirTodos();
        System.out.println("\nTodos os Pokémons foram excluídos.");
    }

    private static void editarPokemon() {
        System.out.print("\nInforme o nome do Pokémon que deseja editar: ");
        String nomeAntigo = Console.lerString();
        System.out.print("Informe o novo nome: ");
        String novoNome = Console.lerString();
        System.out.print("Informe o novo tipo: ");
        String novoTipo = Console.lerString();
        System.out.print("Informe o novo nível: ");
        int novoNivel = Console.lerInt();
        if (CadastroPokemons.editarPokemon(nomeAntigo, novoNome, novoTipo, novoNivel)) {
            System.out.println("\nPokémon editado com sucesso!");
        } else {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    private static void cadastrarTreinador() {
        System.out.print("\nInforme o nome do Treinador: ");
        String nome = Console.lerString();
        Treinador treinador = new Treinador(nome);
        CadastroPokemons.cadastrarTreinador(treinador);
        System.out.println("\nTreinador cadastrado com sucesso!");
    }

    private static void listarTreinadores() {
        List<Treinador> treinadores = CadastroPokemons.getListaTreinadores();
        if (treinadores.isEmpty()) {
            System.out.println("Não há treinadores cadastrados.");
        } else {
            System.out.println("\nLista de Treinadores:");
            for (Treinador treinador : treinadores) {
                System.out.println(treinador);
            }
        }
    }

    public static void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = Console.lerInt();
            verificarOpcao(opcao);
        } while (opcao != 0);
    }

    public static void salvarPokemonsEmArquivo() {
        String nomeArquivo = "pokedex.txt";
        File file = new File(nomeArquivo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Pokemon pokemon : CadastroPokemons.getListaPokemons()) {
                writer.write(pokemon.toString());
                writer.newLine();
            }
            System.out.println("Pokémons salvos em " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao salvar Pokémons: " + e.getMessage());
        }
    }

    public static void carregarPokemonsDeArquivo() {
        String nomeArquivo = "pokedex.txt";
        File file = new File(nomeArquivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                String tipo = partes[0];
                String nome = partes[1];
                int nivel = Integer.parseInt(partes[2]);

                switch (tipo.toLowerCase()) {
                    case "pokemonagua":
                        boolean sabeNadar = Boolean.parseBoolean(partes[3]);
                        CadastroPokemons.cadastrar(new PokemonAgua(nome, nivel, sabeNadar));
                        break;
                    case "pokemonfogo":
                        int temperaturaCorporal = Integer.parseInt(partes[3]);
                        CadastroPokemons.cadastrar(new PokemonFogo(nome, nivel, temperaturaCorporal));
                        break;
                    case "pokemongrama":
                        int quantidadeFolhas = Integer.parseInt(partes[3]);
                        CadastroPokemons.cadastrar(new PokemonGrama(nome, nivel, quantidadeFolhas));
                        break;
                    default:
                        System.out.println("Tipo de Pokémon inválido no arquivo.");
                        break;
                }
            }
            System.out.println("Pokémons carregados de " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao carregar Pokémons: " + e.getMessage());
        }
    }
}