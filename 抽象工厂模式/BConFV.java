import Fruit;
import Vegetables;
import BFruitAndVegetables;
import Banana;
import Cabbage;

public class BConFV implements BFruitAandVegetables
{
    public Fruit CreateF() {
        Banana banana = new Banana("香蕉");
        return banana;
    }

    public Vegetables CreateV() {
        Cabbage cabbage = new Cabbage("包菜");
        return cabbage;
    }
    
}