package week_3.task003;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String corpus;
    private String flat;


    public Address() {
    }

    public Address(String country, String region, String city, String street,
                   String building, String corpus, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.building = building;
        this.corpus = corpus;
        this.flat = flat;
    }

    /**
     * из полученной строки  формата
     * "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d]
     * Квартира" ([d] – разделитель, например, «запятая») выбирает
     * соответствующие части и записывает их в соответствующие поля класса
     * Address
     * Разделитель только запятая
     * @param string
     * @return Address
     */
    public static Address adsressFactoryComma (String string){
        String[] split = string.split(",");
        return new Address(split[0].trim(),split[1].trim(),split[2].trim(),
                split[3].trim(),split[4].trim(),split[5].trim(),split[6].trim());
    }
    /**
     * из полученной строки  формата
     * "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d]
     * Квартира" ([d] – разделитель, например, «запятая») выбирает
     * соответствующие части и записывает их в соответствующие поля класса
     * Address
     * Hазделитель – любой из символов ,.;-
     * @param string
     * @return Address
     */
    public static Address adsressFactory (String string){

        StringTokenizer st = new StringTokenizer(string, ",.;-");
        return new Address(st.nextToken().trim(),st.nextToken().trim(),st.nextToken().trim()
                ,st.nextToken().trim(),st.nextToken().trim(),st.nextToken().trim(),st.nextToken().trim());
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }




    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}