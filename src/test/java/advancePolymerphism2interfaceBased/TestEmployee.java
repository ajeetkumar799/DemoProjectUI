package advancePolymerphism2interfaceBased;
interface Employee {
    double calculateSalary();  // abstract method
}

class FullTimeEmployee implements Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;  // fixed salary
    }
}

class PartTimeEmployee implements Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;  // hourly-based salary
    }
}

public class TestEmployee {
    public static void main(String[] args) {

        // Interface reference (polymorphism)
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(80, 500);

        System.out.println("Full-Time Salary: " + e1.calculateSalary());
        System.out.println("Part-Time Salary: " + e2.calculateSalary());
    }
}