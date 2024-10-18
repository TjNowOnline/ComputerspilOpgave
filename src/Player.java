public class Player {
    private int playerId;
    private String name;
    private int age;
    private double score;

    // Konstruktør til at initialisere en Player med de specificerede værdier
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getter for playerId - bruges til at hente spillerens id
    public int getPlayerId() {
        return playerId;
    }

    // Setter for playerId - bruges til at ændre spillerens id
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    // Getter for name - bruges til at hente spillerens navn
    public String getName() {
        return name;
    }

    // Setter for name - bruges til at ændre spillerens navn
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age - bruges til at hente spillerens alder
    public int getAge() {
        return age;
    }

    // Setter for age - bruges til at ændre spillerens alder
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for score - bruges til at hente spillerens score
    public double getScore() {
        return score;
    }

    // Setter for score - bruges til at ændre spillerens score
    public void setScore(double score) {
        this.score = score;
    }

    // Metode til at vise spillerens detaljer på konsollen
    public void displayDetails() {
        System.out.println("Player ID: " + playerId);  // Udskriver spillerens ID
        System.out.println("Name: " + name);           // Udskriver spillerens navn
        System.out.println("Age: " + age);             // Udskriver spillerens alder
        System.out.println("Score: " + score);         // Udskriver spillerens score
    }

    // Metode til at opdatere spillerens score ved at tilføje en ny score
    public void updateScore(double score) {
        this.score += score;  // Tilføjer den nye score til den eksisterende score
    }
}