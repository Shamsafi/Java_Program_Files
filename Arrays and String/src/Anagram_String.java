import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String:- ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second String");
        String str2 = scanner.nextLine();

        boolean result = areanagrams(str1,str2);

        if(result){
            System.out.println("Given String are Anagrams.");
        }else{
            System.out.println("Given String are not Anagrams");
        }

    }
    public static boolean areanagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}

