import java.util.Scanner;

public class IT24104326Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the result  using tenary operations
        System.out.println((number > 0) ? "The number is Positive" : (number < 0) ? "The number is Negative" : "The number is Zero");

        scanner.close();
    }
}
