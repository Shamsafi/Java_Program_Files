import java.util.Scanner;

public class Average_calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st integer:- ");
        int int1 = scanner.nextInt();

        System.out.println("Enter 2st integer:- ");
        int int2 = scanner.nextInt();

        System.out.println("Enter 3rd integer:- ");
        int int3 = scanner.nextInt();

        System.out.println("Enter 4th integer:- ");
        int int4 = scanner.nextInt();

        System.out.println("Enter 5th integer:- ");
        int int5 = scanner.nextInt();

        int avg = (int1 + int2 + int3 + int4 + int5)/5;

        System.out.println("Average of the given five numbers is:- " +avg);
    }
}
