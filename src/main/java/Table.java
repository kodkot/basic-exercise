import java.util.Random;

public class Table {
    public static void main (String[]args){

        int[] table = new int[10];
        Random generate = new Random();

        for (int i = 0; i < 10; i++) {
            int number = generate.nextInt(1000);
            table[i] = number;
        }
        for (int i = 0; i < 10; i++)
            System.out.println("Value for cell " + i + " is: " + table[i]);
    }
}
