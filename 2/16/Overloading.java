//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
import static net.mindview.util.Print.*;
/**
 * Demonstration of both constructor and ordinary method overloading.
 * Class for tree.
 *
 * @author Akmaiev Sharabaddin
 */
class Tree {
  int height;
  
  /**
   * Its default constuctor.
   */
  Tree() {
    print("Planting a seedling");
    height = 0;
  }
  
  /**
   * Its  initial tree with height.
   * @param initialHeight Height by tree.
   */  
  Tree(int initialHeight) {
    height = initialHeight;
    print("Creating new Tree that is " +
      height + " feet tall");
  }
  
  /**
   * Information about height tree.
   */ 	
  void info() {
    print("Tree is " + height + " feet tall");
  }
  
  /**
   * Information about height tree and caption text.
   * @param s          Caption text.
   */
  void info(String s) {
    print(s + ": Tree is " + height + " feet tall");
  }
}

/**
 * Main class
 */
public class Overloading {

 /** 
   * Point entry
   * @param args        Arguments in comand line.
   */
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Overloaded constructor:
    new Tree();
  }	
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
