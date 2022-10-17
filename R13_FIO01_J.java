//Rule 13. Input Output (FIO)
//FIO01-J. Create files with appropriate access permissions

//Compliant Solution (POSIX)
//The  I/O facility java.nio provides classes for managing file access permissions. Additionally, many of the methods and constructors that create files accept an argument allowing the program to specify the initial file permissions.

//The Files.newByteChannel() method allows a file to be created with specific permissions. This method is platform-independent, but the actual permissions are platform-specific. This compliant solution defines sufficiently restrictive permissions for POSIX platforms:

Path file = new File("file").toPath();
 
// Throw exception rather than overwrite existing file
Set<OpenOption> options = new HashSet<OpenOption>();
options.add(StandardOpenOption.CREATE_NEW);
options.add(StandardOpenOption.APPEND);
 
// File permissions should be such that only user may read/write file
Set<PosixFilePermission> perms =
    PosixFilePermissions.fromString("rw-------");
FileAttribute<Set<PosixFilePermission>> attr =
    PosixFilePermissions.asFileAttribute(perms);
 
try (SeekableByteChannel sbc =
         Files.newByteChannel(file, options, attr)) {
  // Write data
};