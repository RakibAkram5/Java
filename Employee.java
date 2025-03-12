public public class employee {
    private String name;
    private int id;
    private double salary;

    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        employee emp = new employee("Alice", 101, 5000);
        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
        emp.setSalary(5500);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}