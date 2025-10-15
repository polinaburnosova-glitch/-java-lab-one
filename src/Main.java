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
//        System.out.println(example);

//        int example = 15;
//        if (example < 5) {
//            example +=10;
//        } else {
//            example -= 10;
//        }
//        System.out.println(example);

//        int example = 15;
//        if (example < 5) {
//            System.out.println("Теперь мы в блоке if");
//            example+=10;
//        } else if (example == 15) {
//            System.out.println("Теперь мы в блоке else if");
//            example-=10;
//        } else {
//            System.out.println("Теперь мы в блоке else");
//        }
//        int a = 2;
//        switch (a) {
//            case 1 -> System.out.println("1");
//            default -> System.out.println("100");
//        }
//        int a = 2;
//        String s = switch (a) {
//            case 1 -> "One";
//            default -> "Default";
//        };
//        System.out.println(s);

//        тернарный оператор
//        int age = 20;
//        String info = age >= 18 ? "adult" : "teen";
//        System.out.println(info);

//        int a = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(a);
//            a++;
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