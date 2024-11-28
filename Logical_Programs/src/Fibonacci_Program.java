import java.util.Scanner;

public class Fibonacci_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for Fibonacci Series:- ");
        int n = scanner.nextInt();

        if(n<=0){
            System.out.println("Enter a positive integer");
        }else{
            System.out.println("Fibonacci Series:- ");
            int first =0 , second =1;
            for(int i =1 ;i<=n;i++){
                System.out.println(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
