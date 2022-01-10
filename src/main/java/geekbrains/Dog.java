package geekbrains;

public class Dog extends Animal {
    public static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }


    @Override
    public void running(int length) {
        if (length > 0 && length <= 500) {
            super.running(length);
        } else {
            System.out.println("Собакен не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swimming(int length) {
        if (length > 0 && length <= 10) {
            super.swimming(length);
        } else {
            System.out.println("Собакен не может проплыть больше 10 метров");
        }
    }
}
