public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: clut clut";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
