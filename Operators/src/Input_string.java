import java.util.Objects;
import java.util.Scanner;

public class Input_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String:- ");
        String str1 = scanner.next();

        System.out.println("Enter second string:- ");
        String str2 = scanner.next();

        if(str1.equals(str2)){
            System.out.println("Given Strings are Equal:- ");
        }
        else{
            System.out.println("Given string are not equal:- ");
        }
    }
}
