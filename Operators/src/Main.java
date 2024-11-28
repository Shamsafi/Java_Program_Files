import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first  number");
        int num1 = scn.nextInt();

        System.out.println("Enter the second number");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;

        System.out.println("Sum of both number is: " +sum);
        System.out.println("Difference of both the number is: " + diff);

    }
}