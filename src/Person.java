public class Person {
    protected String firstName;
    protected String lastName;

    public static void main(String[] args) {
        try {
            Person person = new Person("John", "Smith");

            System.out.printf("%s %s", person.getFirstName(), person.getLastName());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public Person(String firstName, String lastName) throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName.equals("") || lastName.equals("")) {
            throw new IllegalArgumentException("ERROR: NULL value found");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
