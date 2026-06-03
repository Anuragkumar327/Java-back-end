import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper", "Scissors"};

        System.out.println("=== Stone Paper Scissors Game ===");
        System.out.print("Enter your choice (Stone, Paper, Scissors): ");
        String userChoice = sc.nextLine();

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Draw!");
        } else if (
                (userChoice.equalsIgnoreCase("Stone") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Stone")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You Win!");
        } else if (
                userChoice.equalsIgnoreCase("Stone") ||
                userChoice.equalsIgnoreCase("Paper") ||
                userChoice.equalsIgnoreCase("Scissors")
        ) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}