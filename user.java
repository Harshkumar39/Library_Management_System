public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
    }
}
