public class Main {

    public static void main(String[] args) {
        // Задачи блока Методы
        task1();
    }

    public static void task1() {
        Author testAuthor = new Author();
        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        testAuthor.printName();
        levTolstoy.printName();
    }
}
