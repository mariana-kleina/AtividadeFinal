import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private List<Pokemon> pokemons;

    public Treinador(String nome) {
        this.nome = nome;
        this.pokemons = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void adicionarPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void removerPokemon(Pokemon pokemon) {
        this.pokemons.remove(pokemon);
    }

    @Override
    public String toString() {
        return String.format("Treinador: %s, Pokémons: %s", nome, pokemons);
    }
}