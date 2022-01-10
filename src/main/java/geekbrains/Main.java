package geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Вискас");
        Cat cat2 = new Cat("Соня");
        Cat cat3 = new Cat("Вася");
        Dog dog1 = new Dog("Барбос");
        Dog dog2 = new Dog("Бобик");
        cat1.swimming(12);
        cat1.running(201);
        cat2.swimming(132);
        cat2.running(150);
        dog1.running(200);
        dog1.swimming(10);
        System.out.println("Было создано " + Animal.count + " животных."
                + " Из них котиков " + Cat.count + " и собак " + Dog.count + ".");
    }
}
