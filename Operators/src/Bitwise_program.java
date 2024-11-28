public class Bitwise_program {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("First Number: " +num1 );
        System.out.println("Second Number: " +num2 );

        int andresult = num1 & num2;
        System.out.println("Bitwise AND:- " + andresult);

        int orresult = num1 | num2;
        System.out.println("Bitwise OR:- " +orresult);

        int xorresult = num1 ^ num2;
        System.out.println("Bitwise XOR:- "+ xorresult);



    }
}
