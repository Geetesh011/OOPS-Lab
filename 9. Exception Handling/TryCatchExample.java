class TryCatchExample {
    public static void main(String args[]) {
        try {
            int data = 50 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}