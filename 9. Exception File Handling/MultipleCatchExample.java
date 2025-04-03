class MultipleCatchExample {
    public static void main(String args[]) {
        try {
            int arr[] = new int[5];
            arr[10] = 30 / 0; // ArrayIndexOutOfBoundsException & ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e);
        }
    }
}