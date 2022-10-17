//Rule 03. Numeric Types and Operations (NUM)
//NUM03-J. Use integer types that can fully represent the possible range of unsigned data
//Given the non-compliant code below:


//Noncompliant Code Example
//This noncompliant code example uses a generic method for reading integer data without considering the signedness of the source. It assumes that the data read is always signed and treats the most significant bit as the sign bit. When the data read is unsigned, the actual sign and magnitude of the values may be misinterpreted.
public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}