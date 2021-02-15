public class DesignDemo {

    public static void main(String[] args) {
        Edible stuff = new Chicken();
        eat(stuff);

        stuff = new Duck();
        eat(stuff);

        stuff = new Broccoli();
        eat(stuff);

    }

    public static void eat(Edible stuff) {
        System.out.println(stuff.howToEat());
    }

}

class Duck implements Edible {
    @Override
    public String howToEat() {
        return "Duck: Roast it";
    }
}

class Broccoli implements Edible {
    @Override
    public String howToEat() {
        return "Broccoli: Stir-fry it";
    }
}