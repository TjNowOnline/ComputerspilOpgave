public class Game {

    private int gameId;
    private String title;
    private String genre;
    private double price;

    // Konstruktør for Game-klassen
    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    // Getter for gameId
    public int getGameId() {
        return gameId;
    }

    // Setter for gameId
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Metode til at vise detaljerne om spillet i konsollen
    public void displayDetails() {
        System.out.println("Game ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
    }
}
