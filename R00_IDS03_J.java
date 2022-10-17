//This noncompliant code example logs untrusted data from an unauthenticated user without data sanitization.

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}