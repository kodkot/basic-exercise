public class Table {
    public static void main (String[]args){

        int[] table = new int[10];
        for (int i = 0; i < 10; i++)
            table[i] = 10 - i;
        for (int i = 0; i < 10; i++)
            System.out.println("Next cell is: " + table[i]);
    }
}
