public class Author {
    String firstName;   // имя Автора
    String middleName; // отчество Автора
    String lastName;    // фамилия Автора

    // Конструктор по умолчанию.
    Author () {
    }
    /* Безусловная инициализация полей по умолчанию. При создании объекту всегда
      присваивается имя автора "Иван" + "Николаевич" + "Бездомный". */
    {
        firstName = "Иван"; //
        middleName = "Николаевич";
        lastName = "Бездомный";
    }

    /**
     * Конструктор класса
     * @param firstName - имя Автора
     * @param lastName - фамилия Автора
     */
    Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Метод геттер полного имени Автора
     * @return строка составленная из значений полей объекта разделенных пробелом.
     */
    public String fullName() {
        String name;
        name = this.firstName + " " + this.middleName + " " + this.lastName;
        return name;
    }

    /**
     * Метод вывода в консоль полного имени автора
     */
    public void printName() {
        String toPrint = fullName();
        System.out.println(toPrint);
    }
}
