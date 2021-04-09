package week_1.task03;

import java.time.LocalDate;
import java.util.Arrays;

import static week_1.task03.PersonMethods.*;

public class AppTest {
    public static void main(String[] args) {
        Address address0 = new Address("МО", "Королев", "Москворечье", "2", "30а");
        Address address1 = new Address("УО", "Химки", "Советская", "3", "31а");
        Address address2 = new Address("ВО", "Хамовники", "Москворечье", "4", "32а");
        Address address3 = new Address("БО", "Мытищи", "Каширская", "5", "33а");
        Person[] persons = new Person[4];
        persons[0] = new Person("AAAA", address0, LocalDate.of(2000, 2, 1));
        persons[1] = new Person("BBBB", address1, LocalDate.of(2000, 3, 2));
        persons[2] = new Person("CCCC", address2, LocalDate.of(2000, 4, 3));
        persons[3] = new Person("BBBB", address3, LocalDate.of(2000, 5, 4));
        System.out.println("findByFirstName(BBBB)-> " + findByFirstName("BBBB", persons));
        System.out.println("findByRegion(МО)-> " + findByRegion("МО", persons));
        System.out.println("findByCity(Хамовники)-> " + findByCity("Хамовники", persons));
        System.out.println("findByFlat(3)-> " + findByFlat("3", persons));
        System.out.println("findByBuilding(33а)-> " + findByBuilding("33а", persons));
        System.out.println("findByDates(02.03.2000 -04.04.2000  )-> " + Arrays.toString(findByDates(LocalDate.of(2000, 3, 2)
                , LocalDate.of(2000, 4, 4), persons)));

        System.out.println("findOldestPerson-> " + findOldestPerson(persons));
        System.out.println("findYoungestPerson-> " + findYoungestPerson(persons));

        System.out.println("findPeopleByStreet(Москворечье)-> " + Arrays.toString(findPeopleByStreet("Москворечье", persons)));
    }

}
