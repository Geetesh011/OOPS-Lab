class ThrowThrowsExample {
    static void validate(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String args[]) {
        try {
            validate(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}