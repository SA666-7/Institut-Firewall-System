public class LoginManager {

    public boolean login(User user, String username, String password) {

        if (user.getUsername().equals(username)
                && user.getPassword().equals(password)) {

            System.out.println("Login Successful");
            return true;

        } else {

            System.out.println("Invalid Username or Password");
            return false;

        }
    }
}
