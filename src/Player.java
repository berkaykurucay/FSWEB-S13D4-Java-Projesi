public class Player {

    // Enum for Weapon
    public enum Weapon {
        SWORD, AXE, BOW
    }

    // Instance variables
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        // Set name
        this.name = name;

        // Set healthPercentage with validation
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }

        // Set weapon
        this.weapon = weapon;
    }

    // Method to get remaining health
    public int healthRemaining() {
        return healthPercentage;
    }

    // Method to lose health
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of the game");
            healthPercentage = 0;
        }
    }

    // Method to restore health
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public static void main(String[] args) {
        // Creating a Player object
        Player player = new Player("John", 120, Weapon.SWORD);

        // Testing methods
        System.out.println("Initial Health: " + player.healthRemaining());

        player.loseHealth(30);
        System.out.println("Health after losing 30: " + player.healthRemaining());

        player.restoreHealth(20);
        System.out.println("Health after restoring 20: " + player.healthRemaining());

        player.loseHealth(150);  // This should knock the player out of the game
        System.out.println("Final Health: " + player.healthRemaining());
    }
}