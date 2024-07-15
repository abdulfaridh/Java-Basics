import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Book {
private String book_name;
private int ISBN;
private String author_name;
private String publisher;

public Book(String book_name, int ISBN, String author_name, String publisher) {
this.book_name = book_name;
this.ISBN = ISBN;
this.author_name = author_name;
this.publisher = publisher;
}

public String getBookName() {
return book_name;
}

public void setBookName(String book_name) {
this.book_name = book_name;
}

public int getISBN() {
return ISBN;
}

public void setISBN(int ISBN) {
this.ISBN = ISBN;
}

public String getAuthorName() {
return author_name;
}

public void setAuthorName(String author_name) {
this.author_name = author_name;
}

public String getPublisher() {
return publisher;
}

public void setPublisher(String publisher) {
this.publisher = publisher;
}

public String getBookInfo() {
return "Book Name: " + book_name + ", ISBN: " + ISBN + ", Author Name: " + author_name + ", Publisher: " + publisher;
}

public static void main(String[] args) {
List<Book> books = new ArrayList<>();
Scanner sc = new Scanner(System.in);

System.out.println("Enter the book name, ISBN, author name, publisher or type exit to quit:");

for (int i = 0; i < 30; i++) {
System.out.print("Book Name: ");
String book_name = sc.nextLine();
if (book_name.equalsIgnoreCase("exit")) {
break;
}

System.out.print("ISBN: ");
int ISBN = Integer.parseInt(sc.nextLine());

System.out.print("Author Name: ");
String author_name = sc.nextLine();

System.out.print("Publisher: ");
String publisher = sc.nextLine();

Book book = new Book(book_name, ISBN, author_name, publisher);
books.add(book);
}

for (int i = 0; i < books.size(); i++) {
System.out.println("Book details for entry " + (i + 1) + ":");
System.out.println(books.get(i).getBookInfo());
}
}
}
