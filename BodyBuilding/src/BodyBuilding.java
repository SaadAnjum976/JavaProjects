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

		 System.out.println("Welcome to the Fitness Tracker!");

		 double height = 0;
		 boolean validHeightInput = false;
		 while (!validHeightInput) {
	        System.out.print("Enter your height (m/ft): ");
	        String heightUnit = scanner.nextLine().toLowerCase();

    	    if (heightUnit.equals("m")) {
	        System.out.print("Enter your height in meters: ");
		    // Check if the input is a valid double
	        if (scanner.hasNextDouble()) {
	            height = scanner.nextDouble();
			        validHeightInput = true;
			    } else {
		           System.out.println("Invalid input. Please enter a valid numeric value for height.");
			       scanner.nextLine(); // Consume the invalid input
		        }
		    } else if (heightUnit.equals("ft")) {
		        System.out.print("Enter your height in feet: ");
			    // Check if the input is a valid integer
			    if (scanner.hasNextInt()) {
			       int feet = scanner.nextInt();
			       System.out.print("Enter your height in inches: ");
			       // Check if the input is a valid integer
			       if (scanner.hasNextInt()) {
			    	   int inches = scanner.nextInt();
			           // Convert feet and inches to meters and assign it to height
			           height = (feet * 0.3048) + (inches * 0.0254);
			           validHeightInput = true;
			       } else {
			           System.out.println("Invalid input. Please enter a valid numeric value for inches.");
			           scanner.nextLine(); // Consume the invalid input
			        }
			     } else {
			         System.out.println("Invalid input. Please enter a valid numeric value for feet.");
			         scanner.nextLine(); // Consume the invalid input
			     }
			 } else {
				 System.out.println("Invalid input. Please enter 'm' for meters or 'ft' for feet and inches.");
			     scanner.nextLine(); // Consume the invalid input
			 }
		 }

		 scanner.nextLine(); // Consume the newline character

		 double weight = 0;
	     boolean validWeightInput = false;

	     while (!validWeightInput) {
	    	    System.out.print("Enter your weight (kg/lbs): ");
	    	    String weightUnit = scanner.nextLine().toLowerCase();

	    	    if (weightUnit.equals("kg")) {
	    	        System.out.print("Enter your weight in kilograms: ");
	    	        // Check if the input is a valid double
	    	        if (scanner.hasNextDouble()) {
	    	        	weight = scanner.nextDouble();
	    	        	validWeightInput = true;
	    	        } else {
	    	        	System.out.println("Invalid input. Please enter a valid numeric value for weight.");
	    	        	scanner.nextLine(); // Consume the invalid input
	    	        }
	    	    } else if (weightUnit.equals("lbs")) {
	    	    	System.out.print("Enter your weight in pounds: ");
	    	    	// Check if the input is a valid double
	    	    	if (scanner.hasNextDouble()) {
	    	    		weight = scanner.nextDouble();
	    	    		validWeightInput = true;
	    	    	} else {
	    	    		System.out.println("Invalid input. Please enter a valid numeric value for weight.");
	    	    		scanner.nextLine(); // Consume the invalid input
	    	    	}
	    	    } else {
	    	    	System.out.println("Invalid input. Please enter 'kg' or 'lbs'.");
	    	    	scanner.nextLine(); // Consume the invalid input
	    	    }
	     }   

		 double age = 0;
		 boolean validAgeInput = false;
		 while (!validAgeInput) {
		     System.out.print("Enter your age: ");
		     if (scanner.hasNextInt()) {
		         age = scanner.nextInt();
		         validAgeInput = true;
		     } else {
		         System.out.println("Invalid input. Please enter a valid integer.");
		         scanner.nextLine(); // Consume the invalid input
		     }
		 }

		 String gender = "";
		 boolean validGenderInput = false;
		 while (!validGenderInput) {
		     System.out.print("Enter your gender (M/F/Male/Female): ");
		     gender = scanner.next().toLowerCase();

		     if (gender.equals("m") || gender.equals("male")) {
		         gender = "Male";
		         validGenderInput = true;
		     } else if (gender.equals("f") || gender.equals("female")) {
		         gender = "Female";
		         validGenderInput = true;
		     } else {
		         System.out.println("Invalid input. Please enter 'M', 'F', 'Male', or 'Female'.");
		         scanner.nextLine(); // Consume the invalid input
		     }
		 }

		 String goal = "";
		 boolean validGoalInput = false;
		 while (!validGoalInput) {
		     System.out.print("Enter your goal (mass/shred/strength): ");
		     goal = scanner.next().toLowerCase();

		     if (goal.equals("mass") || goal.equals("shred") || goal.equals("strength")) {
		         validGoalInput = true;
		     } else {
		         System.out.println("Invalid input. Please enter 'mass', 'shred', or 'strength'.");
		         scanner.nextLine(); // Consume the invalid input
		     }
		 }


		 int day = 1; // Assume this is the first day

         	// Calculate BMI
		 	double bmi = calculateBMI(weight, height);
		 	String evaluationMessage = evaluateBMI(bmi);
		 	System.out.println("BMI: " + bmi);
		 	System.out.println(evaluationMessage);

		 	// Calculate caloric intake
		 	int caloricIntake = calculateCaloricIntake(weight, height, age, gender, goal);

		 	// Get exercise suggestions
		 	String exerciseSuggestions = getExerciseSuggestions(goal);

		 	// Save user data with metrics
		 	saveUserDataWithMetrics(day, height, age, weight, gender, goal, bmi, caloricIntake, exerciseSuggestions);

		 	// Give the results
		 	System.out.println("Day: " + day);
	     	System.out.println("BMI Reading: " + bmi);
	     	System.out.println("Caloric Intake You Must Consume For Your Goal: " + caloricIntake);
	     	System.out.println("Exercise Routine: " + exerciseSuggestions);
	        
	     	// Successful saved message
	     	System.out.println("User data also saved for Day " + day + ".");

	     	// Encourage return after 30 days
	     	encourageReturn(day);
	 	}

	 	public static double calculateBMI(double height, double weight) {
	 		return weight / (height * height);
	 	}
	 	
	 	public static String evaluateBMI(double bmi) {
	 	    String evaluation;
	 	    
	 	    if (bmi < 18.5) {
	 	        evaluation = "Your BMI is below normal. You may need to gain some weight.";
	 	    } else if (bmi >= 18.5 && bmi < 24.9) {
	 	        evaluation = "Your BMI is within the normal range. Great job!";
	 	    } else if (bmi >= 25 && bmi < 29.9) {
	 	        evaluation = "Your BMI is above normal. Consider losing some weight.";
	 	    } else if (bmi >= 30 && bmi < 34.9) {
	 	        evaluation = "Your BMI indicates obesity (Class 1). You should consult a healthcare provider.";
	 	    } else if (bmi >= 35 && bmi < 39.9) {
	 	        evaluation = "Your BMI indicates obesity (Class 2). You should consult a healthcare provider.";
	 	    } else {
	 	        evaluation = "Your BMI indicates severe obesity (Class 3). You should consult a healthcare provider.";
	 	    }

	 	    return evaluation;
	 	}


	 	public static int calculateCaloricIntake(double weight, double height, double age, String gender, String goal) {
	 		double bmr;

	 		if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("Male")) {
	 			// For males
	 			bmr = 88.362 + (13.397 * weight) + (4.799 * height * 100) - (5.677 * age);
	 		} else if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("Female")) {
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


	 	public static void saveUserDataWithMetrics(int day, double height, double age, double weight, String gender, String goal, double bmi, int caloricIntake, String exerciseSuggestions) {
	 		// Implement saving user data with metrics to a file or database
	 		// (e.g., use file I/O or a database)

	 		try {
	 			FileWriter writer = new FileWriter("userData.txt", true);
	 			writer.write("Day " + day + ": Height=" + height + ", Age=" + age + ", Weight=" + weight + ", Gender=" + gender
	 					+ ", Goal=" + goal + ", BMI=" + bmi + ", Caloric Intake=" + caloricIntake + ", Exercise Suggestions=" + exerciseSuggestions + "\n");
	 			writer.close();
	 		} catch (IOException e) {
	 			e.printStackTrace();
	 		}
	 	}

	 	@SuppressWarnings("deprecation")
		public static void encourageReturn(int day) {
        	Date currentDate = new Date();
        	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        	currentDate.setMonth(currentDate.getMonth() + (day - 1));

        	System.out.println("\nRemember to come back and track your progress on Day " + (day) + " (" + dateFormat.format(currentDate) + ")");
    	}
	}
