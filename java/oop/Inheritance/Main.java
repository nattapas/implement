class ParentA {
  int parentAAttr = 100;

  public ParentA() {
      System.out.println("Calling parent A constructor");
  }

  public void parentAMethod() {
      System.out.println("Calling parent A method");
  }

  public void setAttrA(int attr) {
      this.parentAAttr = attr;
  }

  public int getAttrA() {
      return this.parentAAttr;
  }
}

// extends ได้ class เดียว
class Child extends ParentA {
  public Child() {
      System.out.println("Calling child constructor");
  }

  public void childMethod() {
      System.out.println("Calling child method");
  }
}

public class Main {
  public static void main(String[] args) {
    // Inheritance
    Child child = new Child();
    child.childMethod();

    child.parentAMethod();  // can call method from Parent class because inheritance
    child.setAttrA(200);
    System.out.println(child.getAttrA());
  }
}