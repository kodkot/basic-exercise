import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        System.out.println("What size do you want to have your star triangle?");

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

