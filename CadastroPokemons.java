import java.util.ArrayList;
import java.util.List;

public class CadastroPokemons {
    private static List<Pokemon> listaPokemons = new ArrayList<>();
    private static List<Treinador> listaTreinadores = new ArrayList<>();

    public static void cadastrar(Pokemon pokemon) {
        listaPokemons.add(pokemon);
    }

    public static void cadastrarTreinador(Treinador treinador) {
        listaTreinadores.add(treinador);
    }

    public static Pokemon buscarPokemon(String nome) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nome)) {
                return pokemon;
            }
        }
        return null;
    }

    public static Treinador buscarTreinador(String nome) {
        for (Treinador treinador : listaTreinadores) {
            if (treinador.getNome().equalsIgnoreCase(nome)) {
                return treinador;
            }
        }
        return null;
    }

    public static List<Treinador> getListaTreinadores() {
        return new ArrayList<>(listaTreinadores);
    }

    public static List<Pokemon> getPokemonsPorTipo(Class<? extends Pokemon> tipo) {
        List<Pokemon> pokemonsPorTipo = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (tipo.isInstance(pokemon)) {
                pokemonsPorTipo.add(pokemon);
            }
        }
        return pokemonsPorTipo;
    }

    public static List<Pokemon> getListaPokemons() {
        return new ArrayList<>(listaPokemons);
    }

    public static boolean excluir(String nome) {
        Pokemon pokemon = buscarPokemon(nome);
        if (pokemon != null) {
            listaPokemons.remove(pokemon);
            return true;
        }
        return false;
    }

    public static void excluirTodos() {
        listaPokemons.clear();
    }

    public static boolean editarPokemon(String nomeAntigo, String novoNome, String novoTipo, int novoNivel) {
        Pokemon pokemon = buscarPokemon(nomeAntigo);
        if (pokemon != null) {
            listaPokemons.remove(pokemon);

            switch (novoTipo.toLowerCase()) {
                case "água":
                    pokemon = new PokemonAgua(novoNome, novoNivel, true);
                    break;
                case "fogo":
                    pokemon = new PokemonFogo(novoNome, novoNivel, 100);
                    break;
                case "grama":
                    pokemon = new PokemonGrama(novoNome, novoNivel, 50);
                    break;
                default:
                    System.out.println("Tipo de Pokémon inválido.");
                    return false;
            }

            listaPokemons.add(pokemon);
            return true;
        }
        return false;
    }
}