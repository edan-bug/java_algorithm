/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs;

/**
 *
 * @author ed
 */

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class cat extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The cat says: wee wee");
  }
}

public class abs_1 {
  public static void main(String[] args) {
    cat myCat = new cat(); // Create a Pig object
    myCat.animalSound();
    myCat.sleep();
  }
}

