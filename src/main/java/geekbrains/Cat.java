package geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite && !isSatiety()) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void info() {
        if (isSatiety()) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голоден");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
