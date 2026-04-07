public class Sheep extends Animal {
    private String name;
    private String sound;

    public Sheep() {
        this.type = "Sheep";
        this.sound = "Baa";
    }

    // Copy constructor
    public Sheep(Sheep target) {
        this.type = target.type;
        this.name = target.name;
        this.sound = target.sound;
    }

    @Override
    public Animal clone() {
        return new Sheep(this);
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