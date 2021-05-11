import AConF;
import BConF;
import Fruit;
import Vegetables;

public class main {
    public static void main(String[] args) {
        AConFV aConFV = new AConFV();
        Fruit aFruit = aConFV.CreateF();
        Vegetables aVegetables = aConFV.CreateV();
        
        BConFV bConFV = new BConFV();
        Fruit bFruit = bConFV.CreateF();
        Vegetables bVegetables = bConFV.CreateV();
        aFruit.eat();
        aVegetables.eat();
        bFruit.eat();
        bVegetables.eat();
    }

}