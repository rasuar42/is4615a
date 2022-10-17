//Rule 02. Expressions (EXP)
//XP00-J. Do not ignore values returned by methods Given the non-compliant code below:



//Compliant Solution
//This compliant solution checks the Boolean value returned by the delete() method and handles any resulting errors:

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}

//Compliant Solution
//This compliant solution correctly updates the String reference original with the return value from the String.replace() method:

public class Replace {
  public static void main(String[] args) {
    String original = "insecure";
    original = original.replace('i', '9');
    System.out.println(original);
  }
}