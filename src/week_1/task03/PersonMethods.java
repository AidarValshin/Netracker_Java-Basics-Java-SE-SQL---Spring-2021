package week_1.task03;

import java.time.LocalDate;


public class PersonMethods {
    //Поиск первого попавшегося человека по фамилии
    public static Person findByFirstName(String firstName, Person[] arr) {
        for (Person p : arr) {
            if (p.getFirstName().equals(firstName)) {
                return p;
            }
        }
        return null;
    }
    //Поиск первого попавшегося человека по региону
    public static Person findByRegion(String region, Person[] arr) {
        for (Person p : arr) {
            if (p.getAddress().getRegion().equals(region)) {
                return p;
            }
        }
        return null;
    }
    //Поиск первого попавшегося человека по городу
    public static Person findByCity(String city, Person[] arr) {
        for (Person p : arr) {
            if (p.getAddress().getCity().equals(city)) {
                return p;
            }
        }
        return null;
    }

    //Поиск первого попавшегося квартире
    public static Person findByFlat(String flat, Person[] arr) {
        for (Person p : arr) {
            if (p.getAddress().getFlat().equals(flat)) {
                return p;
            }
        }
        return null;
    }
    //Поиск первого попавшегося человека по зданию
    public static Person findByBuilding(String building, Person[] arr) {
        for (Person p : arr) {
            if (p.getAddress().getBuilding().equals(building)) {
                return p;
            }
        }
        return null;
    }
    //Поиск людей, родившихся между указанными датами
    public static Person[] findByDates(LocalDate firstDate, LocalDate secondDate, Person[] arr) {
        Person[] persons = new Person[arr.length];
        int count = 0;
        for (Person p : arr) {
            if (p.getBirthDate().isAfter(firstDate) && p.getBirthDate().isBefore(secondDate)
                    || p.getBirthDate().isEqual(firstDate) || p.getBirthDate().isEqual(secondDate)) {
                persons[count++] = p;
            }
        }
        Person[] result = new Person[count];
        for (int i = 0; i < count; i++) {
            result[i] = persons[i];
        }
        return result;
    }

    //Поиск самого молодого
    public static Person findYoungestPerson(Person[] arr) {
        Person oldest = arr[0];
        for (Person person : arr) {
            if (person.getBirthDate().compareTo(oldest.getBirthDate()) > 0) {
                oldest = person;
            }
        }
        return oldest;
    }
    //Поиск самого старого
    public static Person findOldestPerson(Person[] arr) {
        Person earliest = arr[0];
        for (Person person : arr) {
            if (person.getBirthDate().compareTo(earliest.getBirthDate()) < 0) {
                earliest = person;
            }
        }
        return earliest;
    }

    //Поиск людей,проживающих на указанной улице
    public static Person[] findPeopleByStreet(String street, Person[] arr) {
        Person[] peopleTmp = new Person[arr.length];
        int i = 0;
        for (Person person : arr) {
            if (person.getAddress().getStreet().equals(street)) {
                peopleTmp[i++] = person;
            }
        }
        Person[] result = new Person[i];
        for (int j = 0; j < i; j++) {
            result[j] = peopleTmp[j];
        }
        return result;
    }
}
