package javarunner.core.designpattern.state;

public class TestPokemonState {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        
        //level state is default
        pokemon.printStats();

        //Changing to level 2
        pokemon.changeLevel(pokemon.getLevel2());

        //Level 2 Stats
        pokemon.printStats();
    }
}
