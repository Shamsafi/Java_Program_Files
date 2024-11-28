import java.util.Scanner;

public class Odd_Even_And_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int number = scanner.nextInt();

        if((number & 1) == 0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is odd");
        }


    }
}
