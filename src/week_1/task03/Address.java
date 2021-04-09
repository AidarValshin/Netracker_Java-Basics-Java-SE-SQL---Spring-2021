package week_1.task03;

public class Address {
    private String region;
    private String city;
    private String street;
    private String flat;
    private String building;

    public Address(String region, String city, String street, String flat, String building) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.flat = flat;
        this.building = building;
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

    @Override
    public String toString() {
        return "Address{" +
                "region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flat='" + flat + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
