public class Main {

    public static void main(String[] args) {
        // Задачи блока Методы
        task1();
    }

    public static void task1() {
        Author testAuthor = new Author();
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println("testAuthor = " + testAuthor.printName());
        System.out.println("levTolstoy = " + levTolstoy.printName());
    }
}
