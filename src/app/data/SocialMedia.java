package app.data;

class SocialMedia {
  String fullname;
}

/**
 * ! final class
 * ? makes a class non-inheritable.
 * if parent class "Facebook" is made final,
 * then the class "FakeFacebook" will error
 */
final class Facebook extends SocialMedia {
  String username;
}

// ! error: cannot inherit from final class
// class FakeFacebook extends Facebook {
// void createAccount(String username) {
// this.username = username;
// }
// }

class Twitter extends SocialMedia {
  String username;
  String password;

  /**
   * ! final method
   * ? make method cannot be overridden
   * if the method in the parent is made final,
   * then the method in the child cannot be overridden
   */
  final void createAccount(String username, String password) {
    this.username = username;
    this.password = password;
  }
}

class FakeTwitter extends Twitter {
  // ! error: cannot override final method
  // void createAccount(String username, String password) {
  // this.username = username;
  // this.password = password;
  // }
}