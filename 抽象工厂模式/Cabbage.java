public class Cabbage extends Vegetables
{
    private String name;

    public Cabbage(String name) {
        this.name = name;
    }

    public void eat() {
        super.eat(this.name);
    }
    
}