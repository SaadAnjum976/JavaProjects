import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BodyBuilding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.next();

        System.out.print("Enter your goal (mass/shred/strength): ");
        String goal = scanner.next();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Calculate caloric intake
        int caloricIntake = calculateCaloricIntake(weight, height, age, gender, goal);

        // Provide exercise suggestions
        String exerciseSuggestions = getExerciseSuggestions(goal);

        // Display results
        System.out.println("\nResults:");
        System.out.println("BMI: " + bmi);
        System.out.println("Caloric Intake: " + caloricIntake + " calories/day");
        System.out.println("Exercise Suggestions: " + exerciseSuggestions);

        // Save data and encourage return
        saveUserData(height, age, weight, gender, goal);
        encourageReturn();
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static int calculateCaloricIntake(double weight, double height, int age, String gender, String goal) {
        double bmr;

        if (gender.equalsIgnoreCase("M")) {
            // For males
            bmr = 88.362 + (13.397 * weight) + (4.799 * height * 100) - (5.677 * age);
        } else if (gender.equalsIgnoreCase("F")) {
            // For females
            bmr = 447.593 + (9.247 * weight) + (3.098 * height * 100) - (4.330 * age);
        } else {
            // Invalid gender input
            throw new IllegalArgumentException("Invalid gender input. Please enter 'M' for male or 'F' for female.");
        }

        // Adjust BMR based on goal (mass, shred, strength)
        switch (goal.toLowerCase()) {
            case "mass":
                bmr *= 1.2;
                break;
            case "shred":
                bmr *= 0.8;
                break;
            case "strength":
                bmr *= 1.5;
                break;
            default:
                // Invalid goal input
                throw new IllegalArgumentException("Invalid goal input. Please enter 'mass', 'shred', or 'strength'.");
        }

        return (int) bmr;
    }

    public static String getExerciseSuggestions(String goal) {
        String suggestions;

        switch (goal.toLowerCase()) {
            case "mass":
                suggestions = "For mass gain, focus on compound exercises like squats, deadlifts, and bench presses. Aim for 3-5 sets of 6-10 reps.";
                break;
            case "shred":
                suggestions = "For shredding, incorporate high-intensity interval training (HIIT) and include exercises like sprints, burpees, and jump squats. Aim for 20-30 minutes of intense workouts.";
                break;
            case "strength":
                suggestions = "To build strength, prioritize heavy lifts such as squats, deadlifts, and overhead presses. Aim for lower reps (3-5) with higher weights.";
                break;
            default:
                suggestions = "Invalid goal input. Please enter 'mass', 'shred', or 'strength'.";
                break;
        }

        return suggestions;
    }


    public static void saveUserData(double height, int age, double weight, String gender, String goal) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("userData.txt", true));
            
            // Write user data to the file
            writer.write("Height: " + height + "cm\n");
            writer.write("Age: " + age + " years\n");
            writer.write("Weight: " + weight + "kg\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Goal: " + goal + "\n\n");
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("deprecation")
	public static void encourageReturn() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Add a specified number of days to encourage return
        int returnDays = 30; // Modify as needed
        currentDate.setDate(currentDate.getDate() + returnDays);

        System.out.println("\nRemember to come back and track your progress on " + dateFormat.format(currentDate));
    }
}
