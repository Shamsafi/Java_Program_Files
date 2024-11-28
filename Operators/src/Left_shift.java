import java.util.Scanner;

public class Left_shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int number = scanner.nextInt();

        int result = number << 1;

        System.out.println("Result of multiplication using left shift:- " +result);

    }
}
