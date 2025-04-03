interface AnimalInterface {
    void sound();
}
class Cat implements AnimalInterface {
    public void sound() {
        System.out.println("Meowing");
    }
}
class AnimalInterfaceDemo {
    public static void main(String args[]) {
        AnimalInterface obj = new Cat();
        obj.sound();
    }
}