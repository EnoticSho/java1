package geekbrains;

public abstract class Animal {
    protected String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void running(int length){
        System.out.println(name + " пробежал " + length + " метров.");
    }

    public void swimming(int length){
        System.out.println(name + " проплыл " + length + " метров.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


