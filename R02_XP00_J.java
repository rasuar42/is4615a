//Rule 02. Expressions (EXP)
//XP00-J. Do not ignore values returned by methods Given the non-compliant code below:



//Noncompliant Code Example (File Deletion)
//This noncompliant code example attempts to delete a file but fails to check whether the operation //has succeeded:
public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}

//Noncompliant Code Example (String Replacement)
//This noncompliant code example ignores the return value of the String.replace() method, failing to update the original string. The String.replace() method cannot modify the state of the String (because String objects are immutable); rather, it returns a reference to a new String object containing the modified string.
public class Replace {
  public static void main(String[] args) {
    String original = "insecure";
    original.replace('i', '9');
    System.out.println(original);
  }
}