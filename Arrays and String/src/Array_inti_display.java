import java.util.Scanner;

public class Array_inti_display {
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

        System.out.println("Array elements are:- ");
        for(int i=0;i<size;i++){
            System.out.println("Elements " + (i+1) + ": " +array[i]);
        }

    }
}
