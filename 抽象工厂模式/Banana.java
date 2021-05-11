public class Banana extends Fruit
{
    private String name;

    public Banana(String name) {
        this.name = name;
    }

    public void eat() {
        super.eat(this.name);
    }
}