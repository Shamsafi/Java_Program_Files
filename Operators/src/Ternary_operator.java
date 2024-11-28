import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:- ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:- ");
        int num2 = scanner.nextInt();

        int min = (num1 > num2) ? num2 : num1;
        System.out.println("The minimum  of " +num1 +" and " +num2 +" is " +min);

    }
}
