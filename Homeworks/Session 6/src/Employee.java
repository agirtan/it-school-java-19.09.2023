public class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor to initialize the employee
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to raise the salary by a percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increaseAmount = salary * (percent / 100.0);
            salary += increaseAmount;
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    // Getters and setters for the Employee class
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\nSalary: $" + salary;
    }
}

