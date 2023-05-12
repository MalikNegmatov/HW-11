public class Main {

    public static void main(String[] args) {
        // Задачи блока Методы
        task1();
    }

    public static void printAuthor(String author) {
        System.out.println(author);
    }

    public static void printAuthor(Author author) {
        String fullName = author.getFirstName() + " " + author.getMiddleName() + " " + author.getLastName();
        System.out.println(fullName);
    }
    public static void testAuthor() {
        Author testAuthor = new Author();
        printAuthor(testAuthor);
        testAuthor.setFirstName("George");
        testAuthor.setMiddleName("Bernard");
        testAuthor.setLastName("Shaw");
        printAuthor(testAuthor.fullName());

        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author mikhailBulgakov = new Author("Михаил Афанасьевич Булгаков");
        printAuthor(levTolstoy.fullName());
        printAuthor(mikhailBulgakov);
    }

    public static void printBook(String book){
        System.out.println(book);
    }

    public static void printBook(Book book){
        String cite = "\"" + book.getTitle() + "\" // " + book.getAuthorName() + ", " + book.getYear() + " г.";
        System.out.println(cite);
    }
    public static void testBook() {
        Book testBook = new Book();
        printBook(testBook);
        testBook.setTile("Too True To Be Good");
        Author shaw = new Author("George Bernard Shaw");
        testBook.setAuthor(shaw);
        testBook.setYear(1931);
        printBook(testBook.citeBook());

        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author mikhailBulgakov = new Author("Михаил Афанасьевич Булгаков");

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        printBook(warAndPeace.citeBook());
        Author whoIs = warAndPeace.getAuthor();
        printAuthor(whoIs);

        Book theatricalNovel = new Book("Театральный роман", mikhailBulgakov, 1936);
        printBook(theatricalNovel.citeBook());
    }

    public static void task1() {
        System.out.println("Задача №1");
        testAuthor();
        System.out.println();
        testBook();
        System.out.println();
    }
}
