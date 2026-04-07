public class Horse extends Animal {
    private String color;
    private String name;
    private String sound;

    public Horse() {
        this.type = "Horse";
        this.sound = "Neigh";
    }

    // Copy constructor
    public Horse(Horse target) {
        this.type = target.type;
        this.color = target.color;
        this.name = target.name;
        this.sound = target.sound;
    }

    @Override
    public Animal clone() {
        return new Horse(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }
} 
