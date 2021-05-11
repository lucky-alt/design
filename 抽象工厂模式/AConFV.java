import Fruit;
import Vegetables;
import AFruitAndVegetables;
import Apple;
import Tomato;

public class AConFV implements AFruitAandVegetables
{
    public Fruit CreateF() {
        Apple apple = new Apple("苹果");
        return apple;
    }

    public Vegetables CreateV() {
        Tomato tomato = new Tomato("番茄");
        return tomato;
    }
}