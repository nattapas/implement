abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();

  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  // must declare abstract method from superclass
  // if not it will display error: Pig is not abstract and does not override abstract method animalSound() in Animal
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

public class Main {
  public static void main(String[] args) {
    // Abstraction
    Pig pig = new Pig();
    pig.sleep();
    pig.animalSound();
  }
}