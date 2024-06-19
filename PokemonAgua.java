public class PokemonAgua extends Pokemon {
    private boolean podeNadar;

    public PokemonAgua(String nome, int nivel, boolean podeNadar) {
        super(nome, "Água", nivel);
        this.podeNadar = podeNadar;
    }

    public boolean getPodeNadar() {
        return podeNadar;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nPode Nadar: " + (podeNadar ? "Sim" : "Não");
    }
}
