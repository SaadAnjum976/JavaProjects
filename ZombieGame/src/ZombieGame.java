import java.util.Scanner;
import java.util.Random;

public class ZombieGame {

    static int userHealth = 100;
    static int zombiesCount = 3;
    static int zombieHealth = 20;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Zombie Game!");

        char userCharacter = selectCharacter();
        System.out.println("You've selected: " + userCharacter);

        while (zombiesCount > 0 && userHealth > 0) {
            System.out.println("\nCurrent Status:");
            System.out.println("Your Health: " + userHealth);
            System.out.println("Zombies Remaining: " + zombiesCount);

            char action = selectAction();

            switch (action) {
                case 'A':
                    int damage = random.nextInt(10) + 1; // Random damage between 1 and 10
                    int zombieDamage = random.nextInt(5) + 1; // Random zombie damage between 1 and 5

                    userHealth -= zombieDamage;
                    zombieHealth -= damage;

                    System.out.println("You attacked the zombies and dealt " + damage + " damage.");
                    System.out.println("The zombies counter-attacked and dealt " + zombieDamage + " damage.");
                    break;

                case 'R':
                    System.out.println("You chose to run!");
                    if (random.nextBoolean()) {
                        System.out.println("You successfully escaped!");
                        return;
                    } else {
                        System.out.println("The zombies caught up to you!");
                        int zombieDamageOnRun = random.nextInt(15) + 5; // Random damage between 5 and 20
                        userHealth -= zombieDamageOnRun;
                        System.out.println("The zombies dealt " + zombieDamageOnRun + " damage.");
                    }
                    break;

                default:
                    System.out.println("Invalid action. Please choose 'A' to attack or 'R' to run.");
                    break;
            }

            if (zombieHealth <= 0) {
                zombiesCount--;
                zombieHealth = 20; // Reset zombie health for the next encounter
            }

            if (userHealth <= 0) {
                System.out.println("Game Over. You were overwhelmed by zombies.");
            }
        }

        if (userHealth > 0) {
            System.out.println("Congratulations! You defeated all the zombies.");
        }
    }

    static char selectCharacter() {
        System.out.println("Select your character:");
        System.out.println("A - Archer");
        System.out.println("S - Swordsman");
        System.out.println("M - Mage");

        char choice = Character.toUpperCase(scanner.next().charAt(0));

        if (choice != 'A' && choice != 'S' && choice != 'M') {
            System.out.println("Invalid choice. Defaulting to Archer.");
            return 'A';
        }

        return choice;
    }

    static char selectAction() {
        System.out.println("Choose your action:");
        System.out.println("A - Attack");
        System.out.println("R - Run");

        return Character.toUpperCase(scanner.next().charAt(0));
    }
}
