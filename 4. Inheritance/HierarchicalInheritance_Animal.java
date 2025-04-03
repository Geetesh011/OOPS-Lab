
// Hierarchical Inheritance - Animal, Bird, and Mammal
class Animal {
    String name;
    String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void animalInfo() {
        System.out.println("Animal Name: " + name + ", Species: " + species);
    }
}

class Bird extends Animal {
    double wingSpan;

    public Bird(String name, String species, double wingSpan) {
        super(name, species);
        this.wingSpan = wingSpan;
    }

    public void birdInfo() {
        animalInfo();
        System.out.println("Wing Span: " + wingSpan + " meters");
    }
}

class Mammal extends Animal {
    String furColor;

    public Mammal(String name, String species, String furColor) {
        super(name, species);
        this.furColor = furColor;
    }

    public void mammalInfo() {
        animalInfo();
        System.out.println("Fur Color: " + furColor);
    }
}

public class HierarchicalInheritance_Animal {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Parrot", "Psittaciformes", 0.25);
        bird1.birdInfo();

        Mammal mammal1 = new Mammal("Tiger", "Panthera tigris", "Orange with black stripes");
        mammal1.mammalInfo();
    }
}