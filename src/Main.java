import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt(); // Input number

        // Generate and print the Collatz sequence
        generateCollatzSequence(n);

        // Close the scanner
        scanner.close();
    }

    static void generateCollatzSequence(int n) {
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}
