// Base class: Person
class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Single Inheritance: Employee inherits from Person
class Employee extends Person {
    String employeeId;

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
    }
}

// Multilevel Inheritance: Manager inherits from Employee
class Manager extends Employee {
    String department;

    void displayManagerInfo() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance demonstration
        System.out.println("---- Single Inheritance (Person → Employee) ----");
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 30;
        emp.employeeId = "EMP1001";

        emp.displayPersonInfo();      // From Person
        emp.displayEmployeeInfo();    // From Employee

        // Multilevel Inheritance demonstration
        System.out.println("\n---- Multilevel Inheritance (Person → Employee → Manager) ----");
        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 40;
        mgr.employeeId = "EMP2002";
        mgr.department = "IT";

        mgr.displayPersonInfo();      // From Person
        mgr.displayEmployeeInfo();    // From Employee
        mgr.displayManagerInfo();     // From Manager
    }
}

