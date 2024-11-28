public class Encapsulation {
    // Private fields (data hiding)
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Encapsulation(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

        public static void main(String[] args) {
            Encapsulation emp = new Encapsulation("Sam Smith", 24, 41000);

            // Access and modify private fields using getters and setters
            System.out.println("Initial Name: " + emp.getName());
            emp.setName("Jane Doe");

            // Display updated details
            emp.displayInfo();

            // Trying invalid data
            emp.setAge(-5); // Will print an error message
        }
    }