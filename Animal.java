public abstract class Animal implements Cloneable {
    protected String type;

    public String getType() {
        return type;
    }

    public abstract Animal clone();
} 