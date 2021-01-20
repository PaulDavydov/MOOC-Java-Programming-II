
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int ageInput = Integer.valueOf(scanner.nextLine());
            books.add(new Book(nameInput,ageInput));
        }
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        System.out.println(books.size() + " books in total.\n");
        System.out.println("Books:");
        books.stream().forEach(i -> System.out.println(i));
    }


}
