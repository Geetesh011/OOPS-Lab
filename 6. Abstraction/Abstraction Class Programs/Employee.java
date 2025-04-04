abstract class Employee {
    abstract void showDetails();
}

class Manager extends Employee {
    void showDetails() {
        System.out.println("Manager Details");
    }
}

public class EmployeeDemo {
    public static void main(String args[]) {
        Employee obj = new Manager();
        obj.showDetails();
    }
}
