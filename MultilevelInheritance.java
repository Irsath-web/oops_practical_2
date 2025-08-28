// Base class
class Employee {
    void empInfo() {
        System.out.println("I am an Employee.");
    }
}

// Intermediate class
class Manager extends Employee {
    void managerInfo() {
        System.out.println("I manage the employees.");
    }
}

// Derived class
class Director extends Manager {
    void directorInfo() {
        System.out.println("I make company decisions.");
    }
}

public class MultilevelInheritanceEmployee {
    public static void main(String[] args) {
        Director d = new Director();
        d.empInfo();       // from Employee
        d.managerInfo();   // from Manager
        d.directorInfo();  // from Director
    }
}

