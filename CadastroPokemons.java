import java.util.ArrayList;
import java.util.List;

public class CadastroPokemons {
    private static List<Pokemon> listaPokemons = new ArrayList<>(); // Lista para armazenar os Pokémons

    // Método para cadastrar um novo Pokémon
    public static void cadastrar(Pokemon pokemon) {
        listaPokemons.add(pokemon);
    }

    // Retorna uma cópia da lista de Pokémons para evitar modificações externas
    public static List<Pokemon> getListaPokemons() {
        return new ArrayList<>(listaPokemons);
    }

    // Retorna uma lista de Pokémons filtrada por tipo
    public static List<Pokemon> getPokemonsPorTipo(Class<? extends Pokemon> tipo) {
        List<Pokemon> listaFiltrada = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (tipo.isInstance(pokemon)) {
                listaFiltrada.add(pokemon);
            }
        }
        return listaFiltrada;
    }

    // Exclui um Pokémon pelo nome, se encontrado
    public static boolean excluir(String nomePokemon) {
        return listaPokemons.removeIf(pokemon -> pokemon.getNome().equalsIgnoreCase(nomePokemon));
    }

    // Exclui todos os Pokémons da lista
    public static void excluirTodos() {
        listaPokemons.clear();
    }

    // Edita os dados de um Pokémon, se encontrado
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

    // Busca um Pokémon pelo nome
    public static Pokemon buscarPokemon(String nomePokemon) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomePokemon)) {
                return pokemon;
            }
        }
        return null;
    }
}
