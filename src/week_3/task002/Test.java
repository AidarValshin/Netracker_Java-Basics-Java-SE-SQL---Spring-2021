package week_3.task002;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Aidar", "VAl", "Ra");
        System.out.println(person.get());
        Person person1 = new Person("Aidar", null, "Ra");
        System.out.println(person1.get());
    }

}
