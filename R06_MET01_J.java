//Rule 06. Methods (MET)
//MET01-J. Never use assertions to validate method arguments Given the non-compliant code below:


//Compliant Solution
//This compliant solution validates the method arguments by ensuring that values passed to Math.abs() exclude Integer.MIN_VALUE and also by checking for integer overflow:

public static int getAbsAdd(int x, int y) {
  if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
    throw new IllegalArgumentException();
  }
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  if (absX > Integer.MAX_VALUE - absY) {
    throw new IllegalArgumentException();
  }
  return absX + absY;
}