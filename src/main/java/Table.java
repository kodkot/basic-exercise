import java.util.Random;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        int i;
        int table [] = new int[10];
        Random generate = new Random();

        System.out.println("What would you like to do?" + '\n' + "1. Find value on basis of the index." + '\n'
                + "2. Find specific value.");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        for (i = 0; i < 10; i++) {
            int number = generate.nextInt(1000);
            table[i] = number;
        }
//        }
//        for (i = 0; i < 10; i++)
//            System.out.println("Value for cell " + i + " is: " + table[i]);


            switch (choice) {
                case 1:
                    System.out.println("Give index number");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Value for index " + index + " is " + table[index]);
                    break;

                case 2:
                    System.out.println("What is the value?");
                    int value = Integer.parseInt(scanner.nextLine());
                    value = table[i];
                    System.out.println("Value " + value + "exists in the table with index " + i);
                    break;

        }
    }
}
