public public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe");
        b1.borrowBook();
        b1.returnBook();

        User u1 = new StudentUser("Alice", "S123");
        u1.displayUserInfo(); // Demonstrates Polymorphism
    }
}
 {
    
}
