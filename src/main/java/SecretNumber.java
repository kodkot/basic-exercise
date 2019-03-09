import java.util.Scanner;

public class SecretNumber {
    public static void main (String[]args) {

        System.out.println("Guess the number!");

        Scanner scanner = new Scanner(System.in);
        int guess = Integer.parseInt(scanner.nextLine());

        int number = 58;
        int count = 1;

        do {
            if (guess > number) {
                System.out.println("That's too much, " + "keep trying");
                guess = Integer.parseInt(scanner.nextLine());
                count++;
            }
            if (guess < number) {
                System.out.println("Not enough, " + "Keep trying");
                guess = Integer.parseInt(scanner.nextLine());
                count++;
            }
            if (guess == number) {
                System.out.println("You got it! " + "After trying " + count + " times.");
                return;
            }
        } while (count<100);
    }
}
