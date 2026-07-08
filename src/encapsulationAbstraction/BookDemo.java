package encapsulationAbstraction;

public class BookDemo {
	public static void main(String[] args) {

        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com", 'F');

        Book book = new Book("Harry Potter", author, 599.50, 25);

        System.out.println("Book Name      : " + book.getName());
        System.out.println("Author Name    : " + book.getAuthor().getName());
        System.out.println("Author Email   : " + book.getAuthor().getEmail());
        System.out.println("Author Gender  : " + book.getAuthor().getGender());
        System.out.println("Price          : " + book.getPrice());
        System.out.println("Quantity Stock : " + book.getQtyInStock());
    }
}
