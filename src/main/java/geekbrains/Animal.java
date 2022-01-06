package geekbrains;

public abstract class Animal {
    public static int count = 0;

    public Animal() {
        count++;
    }

    public abstract void running(int length);

    public abstract void swimming(int length);
}


