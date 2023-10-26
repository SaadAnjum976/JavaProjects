import java.util.Scanner;

public class PoemGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Personalized Poem Generator!");

        // Take user input for name and ID
        String name;
        boolean isValid = false;
        
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            isValid = checkForNumbers(name);
            if (!isValid) {
                System.out.println("Invalid input. Please enter alphabetic characters only.");
            }
        } while (!isValid);

        // Generate a personalized poem
        String poem = generatePoem(name);

        System.out.println("\nHere's your personalized poem:");
        System.out.println(poem);
    }

    public static String generatePoem(String name) {
        // Create a unique poetic line based on the user's ID
        String poeticLine = "In the world of " + name + ", ";

        // Generate a poetic structure based on the length of the name
        String poemStructure = (name.length() % 2 == 0) ? "you find beauty," : "strength and grace,";

        // Compose the final poem
        String poem = "Dear " + name + ",\n\n"
                + poeticLine + "\n"
                + "Where " + poemStructure + "\n"
                + "Embracing challenges, you find your place.\n"
                + "With every step, you leave a trace.\n"
                + "\nKeep shining, " + name + "!";

        return poem;
    }

    public static boolean checkForNumbers(String name) {
        return name.matches("[a-zA-Z]+");
    }
}
