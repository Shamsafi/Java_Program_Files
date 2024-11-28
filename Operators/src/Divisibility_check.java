import java.util.Scanner;

public class Divisibility_check {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a number:- ");
        int num = scanner.nextInt();

        if(num%5== 0 && num%7==0){
            System.out.println("The given number is divisible by both 5 and 7:- ");
        }
        else{
            System.out.println("The given number is not divisible by 5 and 7:- ");
        }
    }
}
