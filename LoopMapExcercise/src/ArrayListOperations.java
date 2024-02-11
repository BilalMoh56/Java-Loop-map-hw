import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }


        int sum = 0, product = 1, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            sum += number;
            product *= number;
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
