//Rule 09. Locking (LCK)
//LCK02-J. Do not synchronize on the class object returned by getClass()


//Compliant Solution (Class.forName())
//This compliant solution uses the Class.forName() method to synchronize on the Base class's Class object:

class Base {
  static DateFormat format =
      DateFormat.getDateInstance(DateFormat.MEDIUM);
 
  public Date parse(String str) throws ParseException {
    try {
      synchronized (Class.forName("Base")) {
        return format.parse(str);
      }
    } catch (ClassNotFoundException x) {
      // "Base" not found; handle error
    }
    return null;
  }
}

class Derived extends Base {
  public Date doSomethingAndParse(String str) throws ParseException {
    synchronized (Base.class) {
      // ...
      return format.parse(str);
    }
  }
}