class EmployeeSalary {
    int employeeID;
    String name;
    double basicSalary;
    double calculateGrossSalary(){
        double hrs=0.2*basicSalary;
        double da=0.5*basicSalary;
        return basicSalary+hrs+da;

    }
    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}
public class EmployeeApp{
    public static void main(Stirng[]args){
        EmployeeSalary emp1=new EmployeeSalary();
        emp1.employeeID=192;
        emp1.name="Rakib";
        emp.basicSalary=780000;
        emp1.displayDetails();
    }
}
