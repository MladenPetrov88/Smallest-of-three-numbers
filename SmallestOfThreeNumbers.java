import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static int smallestOfThreeNumbers(Scanner scanner) {
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestNumber = smallestOfThreeNumbers(scanner);
        System.out.println(smallestNumber);

    }
}
