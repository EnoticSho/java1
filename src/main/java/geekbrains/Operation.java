package geekbrains;

public class Operation {

    public static int arifmetic(char symb, int a, int b) {
        int result = switch (symb) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
        return result;
    }
}
