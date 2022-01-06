package geekbrains;

public abstract class Animal {
    protected String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void running(int length);

    public abstract void swimming(int length);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


