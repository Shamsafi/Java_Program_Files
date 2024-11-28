import java.util.Scanner;

public class Perfect_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else{
            System.out.println(number + " is not a Prime Number");
        }

    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        if(number == 2){
            return false;
        }
        if(number % 2 == 0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(number);i+=2){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
