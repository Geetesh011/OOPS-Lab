
// Single Inheritance - Employee and Manager
class Employee {
    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class SingleInheritance_Employee {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "M123", "HR");
        manager.displayManager();
    }
}