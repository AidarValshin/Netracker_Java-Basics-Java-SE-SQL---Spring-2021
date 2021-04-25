package week_3.task005;

public class PhoneNumber {
    private final String phoneNumber;

    /**
     * класс, который получает строковое представление
     * телефонного номера в одном из двух возможных строковых форматов:
     * +<Код страны><Номер 10 цифр>, например “+79175655655” или
     * “+104289652211”
     * или
     * 8<Номер 10 цифр> для России, например “89175655655”
     * и преобразует полученную строку в формат:
     * +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
     * @param phoneNumber
     */
    public PhoneNumber(String phoneNumber) {

        if (phoneNumber.startsWith("+") && phoneNumber.substring(1).matches("7[0-9]{10}")) {
            this.phoneNumber = phoneNumber.substring(0, 5) + "-" + phoneNumber.substring(5, 8) +
                    "-" + phoneNumber.substring(8);
        } else if (phoneNumber.startsWith("8") && phoneNumber.matches("8[0-9]{10}")) {
            this.phoneNumber = "+7" + phoneNumber.substring(1, 4) + "-" + phoneNumber.substring(4, 7) +
                    "-" + phoneNumber.substring(7);
        } else {
            throw new IllegalArgumentException("Неверный формат");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}