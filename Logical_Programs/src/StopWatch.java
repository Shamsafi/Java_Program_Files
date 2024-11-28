import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please press ENTER to start the stopwatch");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();

        System.out.println("Please press ENTER to stop the stopwatch");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time is:- " + elapsedTime/1000 + " seconds");
    }
}
