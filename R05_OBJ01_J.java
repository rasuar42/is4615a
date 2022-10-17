//Rule 05. Object Orientation (OBJ)
//OBJ01-J. Limit accessibility of fields


//Compliant Solution (Private Primitive Field)
//Accessor methods provide controlled access to fields outside of the package in which their class is declared. This compliant solution declares total as private and provides a public accessor. The add() and remove() methods modify its value while preserving class invariants. 
public class Widget {
  private int total; // Declared private
 
  public int getTotal() {
    return total;
  }
  
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