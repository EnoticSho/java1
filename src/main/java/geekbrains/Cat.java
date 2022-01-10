package geekbrains;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void running(int length) {
        if (length > 0 && length <= 200) {
            super.running(length);
        } else {
            System.out.println("Котик не может пробежать больше 200 метров");
        }
    }

    @Override
    public void swimming(int length) {
        System.out.println("Котик " + name + " не умеет плавать");
    }
}
