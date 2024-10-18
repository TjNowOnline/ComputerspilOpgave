public class Main {
    public static void main(String[] args) {
        //Opretter nyt spilsystem
        GameSystem system = new GameSystem();

        //Tilføjer 3 nye spil til arraylisten
        Game game1 = new Game(1, "TFT", "AutoChess", 0);
        Game game2 = new Game(2, "Once Human", "MMO", 10);
        Game game3 = new Game(3, "CS2", "FPS", 19.99);
        system.addGame(game1);
        system.addGame(game2);
        system.addGame(game3);

        //Tilføjer 3 nye spillere til arraylisten
        Player player1 = new Player(1, "Daniel", 23, 1200);
        Player player2 = new Player(2, "Theis", 23, 1201);
        Player player3 = new Player(3, "Marcus", 21, 3500);
        system.addPlayer(player1);
        system.addPlayer(player2);
        system.addPlayer(player3);

        System.out.println("Every game in the system: ");
        system.displayAllGames();

        System.out.println("All players");
        system.displayAllPlayers();

        System.out.println("Update Theis' score: ");
        system.updatePlayerScore(2,1500);
        system.findPlayerById(2).displayDetails();

        System.out.println();

        System.out.println("Find game with GameID 1: ");
        Game foundGame = system.findGameById(1);
        if(foundGame != null) {
            foundGame.displayDetails();
        } else {
            System.out.println("Game not found");
        }

        System.out.println();

        System.out.println("Total revenue: " + system.calculateTotalRevenue());

        System.out.println();

        System.out.println("Top scoring player: " + system.findTopScoringPlayer().getName());
    }
}