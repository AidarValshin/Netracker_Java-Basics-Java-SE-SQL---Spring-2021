package week_3.task002;

import java.util.NoSuchElementException;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    /**
     *
     * @return Фамилию И.О.
     * @exception NoSuchElementException если поле пусто
     */
    public String get() {
        if (firstName == null || firstName.length() == 0) {
            throw new NoSuchElementException("no firstName");
        }

        if (lastName == null || lastName.length() == 0) {
            throw new NoSuchElementException("no lastName");
        }

        if (patronymic == null || patronymic.length() == 0) {
            throw new NoSuchElementException("no patronymic");
        }

        return new StringBuilder().append(lastName).append(" ").append(firstName.charAt(0)).append(".").append(patronymic.charAt(0)).append(".").toString();
    }
}
