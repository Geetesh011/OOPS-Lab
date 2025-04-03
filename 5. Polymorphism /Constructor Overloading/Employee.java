
// Constructor Overloading - Example 1
class Employee {
    String name;
    int age;

    Employee(String name) {
        this.name = name;
        System.out.println("Employee Name: " + name);
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob", 30);
    }
}
