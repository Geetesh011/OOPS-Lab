interface A {
    void methodA();
}
interface B {
    void methodB();
}
class MultipleInheritanceExample implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}
class MultipleInheritanceDemo {
    public static void main(String args[]) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.methodA();
        obj.methodB();
    }
}