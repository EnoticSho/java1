package geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Вискас");
        Cat cat2 = new Cat("Соня");
        Cat cat3 = new Cat("Вася");
        Dog dog1 = new Dog("Барбос");
        Dog dog2 = new Dog("Бобик");
        dog1.running(100);
        dog1.swimming(12);
        dog2.swimming(10);
        dog2.running(501);
        cat1.running(1111);
        cat1.swimming(10);
        System.out.println("Было создано " + Animal.count + " животных."
                + " Из них котиков " + Cat.count + " и собак " + Dog.count + ".");
    }
}
