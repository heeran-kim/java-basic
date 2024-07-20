package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book(); // If there is no constructor, then Java provides a default constructor.
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA Programming", "Kim", 700);
        book3.displayInfo();
    }
}
