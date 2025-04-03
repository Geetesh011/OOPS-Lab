
// Multiple Inheritance (via Interfaces) - Student and Employee
interface Student {
    void studentInfo();
}

interface Employee {
    void employeeInfo();
}

class StudentEmployee implements Student, Employee {
    String studentName;
    String studentId;
    String empId;
    String department;

    public StudentEmployee(String studentName, String studentId, String empId, String department) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.empId = empId;
        this.department = department;
    }

    @Override
    public void studentInfo() {
        System.out.println("Student Name: " + studentName + ", ID: " + studentId);
    }

    @Override
    public void employeeInfo() {
        System.out.println("Employee ID: " + empId + ", Department: " + department);
    }

    public void displayInfo() {
        studentInfo();
        employeeInfo();
    }
}

public class MultipleInheritance_StudentEmployee {
    public static void main(String[] args) {
        StudentEmployee studentEmployee = new StudentEmployee("Alice", "S001", "E101", "Finance");
        studentEmployee.displayInfo();
    }
}