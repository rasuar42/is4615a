//Rule 04. Characters and Strings (STR)
//STR03-J. Do not encode noncharacter data as a string Given the non-compliant code below:


//Noncompliant Code Example
//Making as string out of encoded data
BigInteger x = new BigInteger(”530500452766”) ;
byte[] byteArray = x.toByteArray() ;
Strings = new String(byteArray) ;
byteArray = s.getBytes() ;
x = new BigInteger(byteArray) ;