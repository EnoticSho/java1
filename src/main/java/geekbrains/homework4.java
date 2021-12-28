package geekbrains;

import java.util.Scanner;

public class homework4 {
    public static final int SIZE = 3;
    public static final char[][] field = new char[SIZE][SIZE];
    public static final char DOTS_EMPTY = '*';
    public static final char DOTS_X = 'X';
    public static final char DOTS_O = 'O';

    public static void main(String[] args) {
        createField();
        printField();
        while (true) {
            humanInsert();
            printField();
            if (checkWin('X')) {
                System.out.println("Выиграл человек");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья");
                break;
            }
            computerInsert();
            printField();
            if (checkWin('O')) {
                System.out.println("Выиграл компьютер");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void createField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = DOTS_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("|" + field[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-------");
    }

    public static void humanInsert() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.print("Введите координату х = ");
            x = scanner.nextInt() - 1;
            System.out.print("Введите координату y = ");
            y = scanner.nextInt() - 1;
        } while (checkField(x, y));
        field[x][y] = DOTS_X;
    }

    public static void computerInsert() {
        int x;
        int y;
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (checkField(x, y));
        System.out.println("Компьютер походил в точку : " + (x + 1) + ", " + (y + 1));
        field[x][y] = DOTS_O;
    }

    public static boolean checkField(int x, int y) {
        if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
            return field[x][y] != '*';
        }
        return true;
    }

    public static boolean mapIsFull() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        int a = 0;
        int b = 0;
        int c = 0;
        int f = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == symb) {
                    a++;
                }
                if (field[j][i] == symb) {
                    b++;
                }
                if (field[j][j] == symb) {
                    c++;
                }
                if (field[j][field.length - 1 - j] == symb) {
                    f++;
                }
            }
            if (a == SIZE || b == SIZE || c == SIZE || f == SIZE) {
                return true;
            } else {
                a = 0;
                b = 0;
                c = 0;
                f = 0;
            }
        }
        return false;
    }
}
