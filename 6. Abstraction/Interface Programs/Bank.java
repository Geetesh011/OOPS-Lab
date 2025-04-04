interface Bank {
    float getRateOfInterest();
}

class SBI implements Bank {
    public float getRateOfInterest() {
        return 5.5f;
    }
}

public class BankDemo {
    public static void main(String args[]) {
        Bank obj = new SBI(); // Polymorphism: Interface reference holding SBI object
        System.out.println("Rate of Interest: " + obj.getRateOfInterest() + "%");
    }
}

