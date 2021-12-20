package geekbrains;

public class Homework {
    public static void main(String[] args) {
        // first task
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++){
            if ( array1[i] == 1){
                array1[i] = 0;
            }else array1[i] = 1;
        }

        System.out.println("first task");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // second task
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++){
            array2[i] = i + 1;
        }

        System.out.println("second task");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // third task
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++){
            if ( array3[i] < 6){
                array3[i] *= 2;
            }
        }

        System.out.println("third task");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // fourth task
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++){
            array4[i][i] = 1;
            array4[i][array4.length - 1 - i] = 1;
        }

        System.out.println("fourth task");
        for (int[] ints : array4) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }

        //Fifth task
        System.out.println("Fifth task");
        int[] array5 = arrayInitializing(10, 1);
        for (int i : array5) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //The sixth task
        System.out.println("The sixth task");
        int max = array3[0];
        int min = array3[0];
        for (int i = 1; i < array3.length; i++){
            max = Math.max(array3[i], max);
            min = Math.min(array3[i], min);
        }
        System.out.println("Максимальный элемент = " + max + " Минимальный элемент = " + min);

        //The seventh task
        System.out.println("The seventh task");
        int[] array7 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array7));

        //The eighth task
        System.out.println("The eighth task");
        int [] array8 = {2,4,6,1,6,7} ;
        array8 = arrayShift(array8, 3);
        for (int i : array8){
            System.out.print(i + " ");
        }

    }

    //The fifth task
    public static int[] arrayInitializing(int len, int initialValue){
        int[] array = new int[len];
        for ( int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

    //The seventh task
    public static boolean checkBalance(int[] array){
        int sumStart = 0;
        int sumEnd = 0;
        boolean a = false;
        for ( int i = 0; i < array.length; i++){
            sumStart += array[i];
            for ( int j = array.length - 1; j > i; j--){
                sumEnd += array[j];
            }
            if ( sumStart == sumEnd){
                a = true;
                break;
            }
            sumEnd = 0;
        }
        return a;
    }

    //The eighth task
    public static int[] arrayShift(int[] array, int n){
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = array[0];
                for (int j = 0; j < array.length; j++) {
                    if (j == array.length - 1) {
                        array[j] = a;
                        break;
                    }
                    array[j] = array[j + 1];
                }
            }
        }else {
            for (int i = 0; i < Math.abs(n); i++) {
                int a = array[array.length-1];
                for (int j = array.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        array[j] = a;
                        break;
                    }
                    array[j] = array[j - 1];
                }
            }
        }
        return array;
    }
}
