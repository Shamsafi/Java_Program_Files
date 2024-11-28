import java.util.Scanner;

public class Even_Odd_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size on an array:- ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " +size + " numbers");
        for(int i=0;i<size;i++){
            System.out.println("Element " + (i+1) +": ");
            array[i] = scanner.nextInt();
        }

        int eventcount = 0, oddcount = 0;

        for(int i =0; i<size;i++){
            eventcount += (array[i] % 2 == 0) ? 1 : 0;
            oddcount += (array[i] % 2 != 0) ? 1 : 0;
        }

        System.out.println("Even numbers are:- " +eventcount);
        System.out.println("Odd numbers are:- " +oddcount);

    }
}
