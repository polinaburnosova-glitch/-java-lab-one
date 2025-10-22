import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        short[] s = new short[18];
        for (short i = 3; i <= 20; i++) {
            s[i-3] = i;
        }
//        for (short n : s) {
//            System.out.println(n);
//        }
        float[] x = new float[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) Math.random() * 13 - 3f;
        }
//        for (float n : x) {
//            System.out.println(n);
//        }

//        int a = 0;
//        while (a < 5) {
//            a++;
//            System.out.println(a);
//        }

//        int[] array = new int[10];
//        String[] strArray = new String[5];
//        for (int number: array){
//            System.out.println(number);
//        }
//        for (String str: strArray){
//            System.out.println(str);
//        }

//        boolean a = false;
//        int b = 0;
//        while (a == false) {
//            b++;
//            if (b > 5) {
//                a = true;
//            }
//            System.out.println(b);
//        }

        public static void printResult(float[][] s1) {
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s1[i].length; j++) {
                    System.out.printf("%10.4f ", s1[i][j]); // вывод с 4 знаками после запятой
                }
                System.out.println();
            }
        }
    }




    }
}