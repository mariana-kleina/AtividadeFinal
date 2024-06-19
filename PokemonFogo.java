public class PokemonFogo extends Pokemon {
    private int temperaturaChamas;

    public PokemonFogo(String nome, int nivel, int temperaturaChamas) {
        super(nome, "Fogo", nivel);
        this.temperaturaChamas = temperaturaChamas;
    }

    public int getTemperaturaChamas() {
        return temperaturaChamas;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nTemperatura das Chamas: " + temperaturaChamas + " °C";
    }
}
