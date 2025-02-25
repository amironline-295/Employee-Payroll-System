import com.project.employeepayrollsystem.FullTimeEmployee;
import com.project.employeepayrollsystem.PartTimeEmployee;
import com.project.employeepayrollsystem.PayrollSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Salman Khan", 1, 50000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Amir Khan", 2, 150, 500);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employees: ");
        payrollSystem.displayEmployees();
        System.out.println();
        System.out.println("***Remove Employee***");
        payrollSystem.removeEmployee(2);
        System.out.println("After Removing Employee");
        payrollSystem.displayEmployees();

    }
}