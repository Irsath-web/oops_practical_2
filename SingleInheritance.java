// Parent class
class Bank {
    void bankDetails() {
        System.out.println("This is a National Bank.");
    }
}

// Child class (inherits from Bank)
class Account extends Bank {
    void accountType() {
        System.out.println("This is a Savings Account.");
    }
}

public class SingleInheritanceBank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.bankDetails();   // inherited method
        acc.accountType();   // child method
    }
}

