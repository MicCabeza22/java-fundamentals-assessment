public class User extends Person {
    protected static boolean admin;

    public static void main(String[] args) {
        System.out.println(isAdmin());
    }

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        User.admin = admin;
    }

    public static boolean isAdmin() {
        return admin;
    }
}
