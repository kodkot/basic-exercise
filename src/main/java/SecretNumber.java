import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main (String[]args) {

        System.out.println("Guess the number!");

        Scanner scanner = new Scanner(System.in);
        int guess = Integer.parseInt(scanner.nextLine());

        Random generator = new Random();
        int n = generator.nextInt(100);
        n += 1;
        int count = 1;

        do {
            if (guess > n) {
                System.out.println("That's too much, " + "keep trying");
                guess = Integer.parseInt(scanner.nextLine());
                count++;
            }
            if (guess < n) {
                System.out.println("Not enough, " + "keep trying");
                guess = Integer.parseInt(scanner.nextLine());
                count++;
            }
            if (guess == n) {
                System.out.println("You got it! " + "After trying " + count + " times.");
                return;
            }
        } while (count<100);
    }
}
