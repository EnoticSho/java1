package geekbrains;

public class Homework {
    public static void main(String[] args) {
        System.out.println(sumCheck(10,2));
        positiveCheck(2);
        System.out.println(positiveCheck1(-1));
        printString("asdasdadsgafv",2);
        System.out.println(leapYear(1600));
    }

    public static boolean sumCheck(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void positiveCheck(int a){
        if ( a >= 0 ) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean positiveCheck1(int a){
        return a < 0;
    }

    public static void printString(String str, int a){
        for (int i = 1; i <= a; i++){
            System.out.println(str);
        }
    }

    public static boolean leapYear(int a){
        boolean bol = false;
        if ( a % 4 == 0){
            bol = true;
            if ( a % 100 == 0){
                bol = a % 400 == 0;
            }
        }
        return bol;
    }
}
