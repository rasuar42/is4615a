//Rule 03. Numeric Types and Operations (NUM)
//NUM03-J. Use integer types that can fully represent the possible range of unsigned data
//Given the non-compliant code below:


//Compliant Solution
//This compliant solution requires that the values read are 32-bit unsigned integers. It reads an unsigned integer value using the readInt() method. The readInt() method assumes signed values and returns a signed int; the return value is converted to a long with sign extension. The code uses an & operation to mask off the upper 32 bits of the long, producing a value in the range of a 32-bit unsigned integer, as intended. The mask size should be chosen to match the size of the unsigned integer values being read.

public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}