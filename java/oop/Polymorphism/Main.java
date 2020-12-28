class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  // method overriding
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  // method overriding
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

public class Main {
  public static void main(String[] args) {
    // Polymorphism
    Animal animal = new Animal();
    animal.animalSound();

    Pig pig = new Pig();
    pig.animalSound();

    Dog dog = new Dog();
    dog.animalSound();
  }
}