package geekbrains;

public class Dog extends Animal {
    private String name;
    public static int count = 0;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void running(int length) {
        if (length > 0 && length <= 500) {
            System.out.println(name + " пробежал " + length + " метров.");
        } else {
            System.out.println("Собакен не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swimming(int length) {
        if (length > 0 && length <= 10) {
            System.out.println(name + " проплыл " + length + " метров.");
        } else {
            System.out.println("Собакен не может проплыть больше 10 метров");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
