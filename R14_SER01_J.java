//Rule 14. Serialization (SER)
//SER01-J. Do not deviate from the proper signatures of serialization methods

//Noncompliant Code Example (readObject(), writeObject())
//This noncompliant code example shows a class Ser with a private constructor, indicating that code external to the class should be unable to create instances of it. The class implements java.io.Serializable and defines public readObject() and writeObject() methods. Consequently, untrusted code can obtain the reconstituted objects by using readObject() and can write to the stream by using writeObject().

public class Ser implements Serializable {
    private final long serialVersionUID = 123456789;
    private Ser() {
		// Initialize
	}
  
	private void writeObject(final ObjectOutputStream stream)
		throws IOException {
		stream.defaultWriteObject();
	}
 
	private void readObject(final ObjectInputStream stream)
		throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
	}
}