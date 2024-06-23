import java.util.ArrayList;
import java.util.List;

public class CadastroPokemons {
    private static List<Pokemon> listaPokemons = new ArrayList<>(); 

    public static void cadastrar(Pokemon pokemon) {
        listaPokemons.add(pokemon);
    }

        public static List<Pokemon> getListaPokemons() {
        return new ArrayList<>(listaPokemons);
    }

    public static List<Pokemon> getPokemonsPorTipo(Class<? extends Pokemon> tipo) {
        List<Pokemon> listaFiltrada = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (tipo.isInstance(pokemon)) {
                listaFiltrada.add(pokemon);
            }
        }
        return listaFiltrada;
    }

    public static boolean excluir(String nomePokemon) {
        return listaPokemons.removeIf(pokemon -> pokemon.getNome().equalsIgnoreCase(nomePokemon));
    }

    public static void excluirTodos() {
        listaPokemons.clear();
    }

    public static boolean editarPokemon(String nomeAntigo, String novoNome, String novoTipo, int novoNivel) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomeAntigo)) {
                pokemon.setNome(novoNome);
                pokemon.setTipo(novoTipo);
                pokemon.setNivel(novoNivel);
                return true;
            }
        }
        return false;
    }

    public static Pokemon buscarPokemon(String nomePokemon) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomePokemon)) {
                return pokemon;
            }
        }
        return null;
    }
}
