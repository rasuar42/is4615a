//Noncompliant Code Example (Public Primitive Field)
//In this noncompliant code example, the total field tracks the total number of elements as they are added to and removed from a container using the methods add() and remove() respectively.

public class Widget {
  public int total; // Number of elements
 
  void add() {
    if (total < Integer.MAX_VALUE) {     
      total++;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
 
  void remove() { 
    if (total > 0) {     
      total--;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
}