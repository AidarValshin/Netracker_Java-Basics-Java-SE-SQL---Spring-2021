package week_1.task03;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private Address address;
    private LocalDate birthDate;

    public Person(String firstName, Address address, LocalDate birthDate) {
        this.firstName = firstName;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", address=" + address +
                ", birthDate=" + birthDate +
                '}';
    }
}
