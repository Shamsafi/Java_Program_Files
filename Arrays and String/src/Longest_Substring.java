import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scanner.nextLine();

        int result = longestSubstring(str);

        System.out.println("Longest Substring without repeating characters is:- " +result);
    }

    public static int longestSubstring(String str){
        Set<Character> charSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0;right < str.length();right++){
            while(charSet.contains((str.charAt(right)))){
                charSet.remove(str.charAt(left));
                left++;
            }

            charSet.add(str.charAt(right));

            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
    }
}
