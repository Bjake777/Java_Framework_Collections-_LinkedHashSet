import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Team {
    private static final int MAX_POKEMON_QUANTITY = 10;
    private Set<Player> players;
    private Set<Pokemon> earnedPokemon;

    public Team() {
        this.players = new HashSet<>();
        this.earnedPokemon = new LinkedHashSet<>();
    }

    public void addPlayer(Player player) {
        if (players.size() < 5) {
            players.add(player);
        } else {
            System.out.println("za dużo graczy");
        }
    }

    public void addPokemon(Pokemon pokemon) {
        if (earnedPokemon.size() >= MAX_POKEMON_QUANTITY) {
            System.out.println("Koniec gry");
            return;
        }
        if (players.contains(pokemon.getOwner())) {
            earnedPokemon.add(pokemon);
        } else {
            System.out.println("nie możesz dodać pokemona, jesteś spoza zespołu");
        }
    }

    public void calculatePoints() {
        int counter = 0;
        for (Pokemon pokemon : earnedPokemon) {
            Player owner = pokemon.getOwner();
            if (counter < 3) {
                owner.addPoints(10);
            } else if (counter < 6) {
                owner.addPoints(5);
            } else {
                owner.addPoints(1);
            }
            counter++;
        }
    }

    public void displayAllPokemon() {
        for (Pokemon pokemon : earnedPokemon) {
            System.out.println(pokemon);
        }
    }

    public void displayAllPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
