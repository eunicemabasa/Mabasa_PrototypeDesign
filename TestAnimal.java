public class TestAnimal {
    public static void main(String[] args) {

        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep();
        ((Sheep) sheep).setName("Dolly");

        System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName());
        System.out.println(sheep.getType() + " named " + ((Sheep) sheep).getName()
                + " says " + ((Sheep) sheep).getSound());

        Animal horse = registry.createHorse();
        ((Horse) horse).setColor("Black");
        ((Horse) horse).setName("Molly");

        System.out.println(horse.getType() + " color is " + ((Horse) horse).getColor());
        System.out.println(horse.getType() + " named " + ((Horse) horse).getName());
        System.out.println(horse.getType() + " says " + ((Horse) horse).getSound());

        Animal cow = registry.createCow();

        System.out.println(cow.getType() + " eats " + ((Cow) cow).getFood());
        System.out.println(cow.getType() + " is " + ((Cow) cow).getColor());
    }
}   