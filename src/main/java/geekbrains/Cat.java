package geekbrains;

public class Cat extends Animal {
    private String name;
    public static int count = 0;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void running(int length) {
        if (length > 0 && length <= 200) {
            System.out.println(name + " пробежал " + length + " метров.");
        } else {
            System.out.println("Котик не может пробежать больше 200 метров");
        }
    }

    @Override
    public void swimming(int length) {
        System.out.println("Котик " + name + " не умеет плавать");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
