public class Tomato extends Vegetables
{
    private String name;

    public Tomato(String name) {
        this.name = name;
    }

    public void eat() {
        super.eat(this.name);
    }
}