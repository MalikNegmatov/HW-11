public class Library {
    private Book[] books;
    int sizeLibrary;

    Library(int sizeLibrary){
        this.sizeLibrary = sizeLibrary;
        this.books = new Book[sizeLibrary];
    }
    {
        this.sizeLibrary = 10;
        this.books = new Book[10];
    }

}
