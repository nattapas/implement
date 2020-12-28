class Encapsulation {
  private String invisible = "You can't see me.";
  public String visible = "";

  public Encapsulation(String foo) {
      this.visible = foo;
  }

  public String getInvisible() {
      return this.invisible;
  }

  public void setInvisible(String foo) {
      this.invisible = foo;
  }
}

public class Main {
  public static void main(String[] args) {
    // Encapsulation
    Encapsulation encapsulation = new Encapsulation("You can see me.");
    System.out.println(encapsulation.visible);    // can access because 'visible' is public
    System.out.println(encapsulation.invisible);  // can't access because 'invisible' is private
    System.out.println(encapsulation.getInvisible());
    encapsulation.setInvisible("You can set me now.");
    System.out.println(encapsulation.getInvisible());
  }
}