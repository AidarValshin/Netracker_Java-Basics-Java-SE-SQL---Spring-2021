package week_3.task004;

public class Shirt {
    private final String id;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Shirt[] createShirtsArray(String[] strings) {
        Shirt[] shirts = new Shirt[strings.length];
        String s;
        String id;
        String description;
        String color;
        String size;
        for (int i = 0; i < strings.length; i++) {
            s = strings[i];
            id = s.substring(0, s.indexOf(","));
            s = s.replaceFirst(id + ",", "");
            description = s.substring(0, s.indexOf(","));
            s = s.replaceFirst(description + ",", "");
            color = s.substring(0, s.indexOf(","));
            size = s.replaceFirst(color + ",", "");
            shirts[i] = new Shirt(id, description, color, size);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt{" + "\n" +
                "id: " + id + "\n" +
                "description: " + description + "\n" +
                "color: " + color + "\n" +
                "size: " + size + "\n" +
                '}';
    }
}
