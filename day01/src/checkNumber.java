import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
    }
}
