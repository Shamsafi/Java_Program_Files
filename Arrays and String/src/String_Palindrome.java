import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:- ");
        String str = scanner.nextLine();

        boolean isPalindrome = true;
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i) != str.charAt(length - i- 1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Given String is Palindrome.");
        }else{
            System.out.println("Given String is not Palindrome");
        }
    }
}
