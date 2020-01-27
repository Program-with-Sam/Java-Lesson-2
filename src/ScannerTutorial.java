import java.util.Scanner;

public class ScannerTutorial {

    public static void main(String args[]) {
        // Declare the Scanner object
        Scanner scanner = new Scanner(System.in);

        // Output the prompt
        System.out.print("Enter your name: ");
        // Wait for input
        String name = scanner.nextLine();

        // Output a response
        System.out.println("Hello " + name + ", pleased to meet you!");
    }
}
