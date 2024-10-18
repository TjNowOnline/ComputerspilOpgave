import java.util.ArrayList;
//Opretter klassen "GameSystem" med 2 arraylister til spillere og spil
public class GameSystem {
    private ArrayList<Game> games;
    private ArrayList<Player> players;
    //Opretter konstruktør
    public GameSystem() {
        games = new ArrayList<>();
        players = new ArrayList<>();
    }
    //Tilføjer spil til arraylisten
    public void addGame(Game game) {
        games.add(game);
    }
    //Tilføjer spiller til arraylisten
    public void addPlayer(Player player) {
        players.add(player);
    }
    //Viser alle spil som er tilføjet til arraylisten games
    public void displayAllGames() {
        for (Game game : games) {
            game.displayDetails();
            System.out.println("============================================");
        }
    }
    //Viser alle spillere som er tilføjet til arraylisten players
    public void displayAllPlayers() {
        for (Player player : players) {
            player.displayDetails();
            System.out.println("=============================================");
        }
    }
    //Opdaterer en given spillers score ud fra spillerens gameId, hvis gameId ikke tilhører en oprettet spiller, udskrives fejl besked
    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);
        if (player != null) {
            player.updateScore(newScore);
        } else {
            System.out.println("Player not found in system");
        }
    }

    //Finder spil ud fra given gameId, hvis nummeret ikke tilhører et spil, returneres intet
    public Game findGameById(int gameId) {
        for (Game game : games) {
            if (game.getGameId() == gameId) {
                return game;
            }
        }
        return null;
    }
    //Finder spiller ud fra given playerId, hvis nummeret ikke tilhører et spiller, returneres intet
    public Player findPlayerById(int playerId) {
        for (Player player : players) {
            if (player.getPlayerId() == playerId) {
                return player;
            }
        }
        return null;
    }
    //Metode til at beregne den samlede indtjening
    public double calculateTotalRevenue(){
        double totalRevenue = 0;
        for(Game game : games){
            totalRevenue += game.getPrice();
        }
        return totalRevenue;
    }
    //Metode til at finde den højst rangerede spiller, hvis arraylisten er tom returneres intet
    public Player findTopScoringPlayer(){
        if (players.isEmpty()) {
            return null;
        }
        Player topScoringPlayer = players.get(0);
        for (Player player : players){
            if (player.getScore() > topScoringPlayer.getScore()){
                topScoringPlayer = player;
            }
        }
        return topScoringPlayer;
    }
}
