public class Person {
    // Instance variables
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // doSomething()
    public void doSomething() {
        System.out.println("I'm watching Netflix");
    }

    // toString()
    public String toString() {
        String str = firstName + " " + lastName;
        return str;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // setters
    public void setFirstName(String firstName) {
        if (firstName.trim().length() != 0) {
            this.firstName = firstName;
        }
    }
}













