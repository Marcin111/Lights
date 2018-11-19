package dashboard.warning.Lights.model;

public class Light {

    private String title;
    private String name;
    private String color;
    private String descryption;

    public Light(String title, String name, String color, String descryption) {
        this.title = title;
        this.name = name;
        this.color = color;
        this.descryption = descryption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }
}
