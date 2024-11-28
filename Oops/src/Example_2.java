class Emp{
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float f){
        Employee_name = n;
        Employee_salary = f;
    }

    static void get(){
        System.out.println("Employee Name is:- " + Employee_name);
        System.out.println("Employee Salary is:- " + Employee_salary);
    }
}

public class Example_2 {
    public static void main(String[] args) {
        //Emp em = new Emp();
        Emp.set("Sam Smith",40000);
        Emp.get();
    }
}
