public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void displayUser() {
        System.out.println("User: " + name);
    }
}
