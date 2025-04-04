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

public class MultipleInheritanceDemo {
    public static void main(String args[]) {
        A objA = new MultipleInheritanceExample();
        objA.methodA();
        
        B objB = new MultipleInheritanceExample();
        objB.methodB();
    }
}

