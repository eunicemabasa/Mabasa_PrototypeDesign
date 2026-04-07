public class Cow extends Animal {
    private String sound;
    private String food;
    private String color;

    public Cow() {
        this.type = "Cow";
        this.sound = "Moo";
        this.food = "Grass";
        this.color = "Brown";
    }

    // Copy constructor
    public Cow(Cow target) {
        this.type = target.type;
        this.sound = target.sound;
        this.food = target.food;
        this.color = target.color;
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }
} 