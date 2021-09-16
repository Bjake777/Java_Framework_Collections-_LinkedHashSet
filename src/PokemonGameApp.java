public class PokemonGameApp {
    public static void main(String[] args) {
        Team team = new Team();

        Player player1 = new Player("Adaś", "Możdżonek");
        Player player2 = new Player("John", "Isner");
        Player player3 = new Player("Paul", "Kowalsky");
        Player player4 = new Player("Krzysztof", "Zawadzki");
        Player player5 = new Player("Michał", "Bujak");
        Player player6 = new Player("Ksawery", "Jacek");

        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);
        team.addPlayer(player4);
        team.addPlayer(player5);
        team.addPlayer(player6);

        Pokemon pokemon1 = new Pokemon('A');
        Pokemon pokemon2 = new Pokemon('B');
        Pokemon pokemon3 = new Pokemon('C');
        Pokemon pokemon4 = new Pokemon('D');
        Pokemon pokemon5 = new Pokemon('E');
        Pokemon pokemon6 = new Pokemon('F');
        Pokemon pokemon7 = new Pokemon('G');
        Pokemon pokemon8 = new Pokemon('H');
        Pokemon pokemon9 = new Pokemon('I');
        Pokemon pokemon10 = new Pokemon('A');
        Pokemon pokemon11 = new Pokemon('A');
        Pokemon pokemon12 = new Pokemon('E');
        Pokemon pokemon13 = new Pokemon('E');
        Pokemon pokemon14 = new Pokemon('G');
        Pokemon pokemon15 = new Pokemon('X');
        Pokemon pokemon16 = new Pokemon('Y');
        Pokemon pokemon17 = new Pokemon('Z');


        pokemon1.setOwner(player1);
        pokemon2.setOwner(player3);
        pokemon3.setOwner(player4);
        pokemon12.setOwner(player5);
        pokemon4.setOwner(player6);
        pokemon5.setOwner(player5);
        pokemon14.setOwner(player1);
        pokemon6.setOwner(player1);
        pokemon7.setOwner(player1);
        pokemon13.setOwner(player2);
        pokemon8.setOwner(player1);
        pokemon11.setOwner(player4);
        pokemon9.setOwner(player2);
        pokemon10.setOwner(player4);
        pokemon15.setOwner(player4);
        pokemon16.setOwner(player4);
        pokemon17.setOwner(player4);

        team.addPokemon(pokemon1);
        team.addPokemon(pokemon2);
        team.addPokemon(pokemon3);
        team.addPokemon(pokemon12);
        team.addPokemon(pokemon4);
        team.addPokemon(pokemon5);
        team.addPokemon(pokemon14);
        team.addPokemon(pokemon6);
        team.addPokemon(pokemon7);
        team.addPokemon(pokemon13);
        team.addPokemon(pokemon8);
        team.addPokemon(pokemon11);
        team.addPokemon(pokemon9);
        team.addPokemon(pokemon10);
        team.addPokemon(pokemon17);
        team.addPokemon(pokemon16);
        team.addPokemon(pokemon15);

        team.calculatePoints();

        team.displayAllPokemon();

        team.displayAllPlayers();

    }
}
