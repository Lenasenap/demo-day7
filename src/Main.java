import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många studerande är här idag?");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents == 33) {
            // Kommer bara köras om det inom parentesen är true
            System.out.println("Alla verkar vara här idag");
        }

        if (numberOfStudents > 33) {
            System.out.println("Någon i klassrummet verkar ha hamnat fel");
        }

        if (numberOfStudents < 33) {
            System.out.println("Det fattas några studerande idag, nämligen: "
                    + (33 - numberOfStudents) + " stycken.");
        }

        System.out.println("---- Nu är vi utanför if-satsen");

    }
}
