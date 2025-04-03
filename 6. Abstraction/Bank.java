interface Bank {
    float getRateOfInterest();
}
class SBI implements Bank {
    public float getRateOfInterest() {
        return 5.5f;
    }
}
class BankDemo {
    public static void main(String args[]) {
        Bank obj = new SBI();
        System.out.println("Rate of Interest: " + obj.getRateOfInterest());
    }
}