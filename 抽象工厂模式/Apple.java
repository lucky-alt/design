public class Apple extends Fruit
{
    private String name;

    public Apple(String name) {
        this.name = name;
    }
    
    public void eat() {
        super.eat(this.name);
    }
}