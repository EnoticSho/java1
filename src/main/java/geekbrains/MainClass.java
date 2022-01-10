package geekbrains;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Sanya", 25);
        cats[1] = new Cat("Karlik", 30);
        cats[2] = new Cat("Zmih", 40);
        cats[3] = new Cat("Vasiliu", 9);
        cats[4] = new Cat("Barsik", 6);
        plate.info();
        for (Cat a : cats){
            a.eat(plate);
            a.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();
        for (Cat a : cats){
            a.eat(plate);
            a.info();
        }
        plate.info();
    }
}
