public class PokemonGrama extends Pokemon {
    private int tamanhoFolhas;

    public PokemonGrama(String nome, int nivel, int tamanhoFolhas) {
        super(nome, "Grama", nivel);
        this.tamanhoFolhas = tamanhoFolhas;
    }

    public int getTamanhoFolhas() {
        return tamanhoFolhas;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nTamanho das Folhas: " + tamanhoFolhas + " cm";
    }
}
