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
        firstName = "Иван"; // Имя
        middleName = "Николаевич"; // Отчество
        lastName = "Бездомный"; // Фамилия
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

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }

    public String setMiddleName(String middleName){
        return this.middleName = middleName;
    }

    public String setLastName (String lastName){
        return this.lastName = lastName;
    }

    /**
     * Метод склеивания в строку полного имени Автора
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
