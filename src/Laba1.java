public class Laba1 {
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

        int num1 = 18;
        int num2 = 10;
        float[][] s1 = new float[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                s1[i][j] = element(s[i], x[j]);
            }
        }

        printResult(s1);
    }
        public static float element(int s1, float x1) {
            return (float) switch (s1) {
            case 20 -> Math.cbrt(Math.pow((Math.sin(x1)), ((0.25f/x1)*(Math.pow(x1, (0.5f/x1)+0.75f)))));
            case 3, 4, 6, 7, 10, 15, 17, 18, 19 -> Math.tan(Math.pow((0.25f/(0.25f-x1-2)), 3));
            default -> Math.cbrt(Math.asin(Math.exp(Math.cbrt(-Math.pow(Math.sin(x1), 2)))));
            };
        }


        public static void printResult(float[][] s1) {
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s1[i].length; j++) {
                    System.out.printf("%10.4f ", s1[i][j]); // вывод с 4 знаками после запятой
                }
                System.out.println();
            }
        }
    }



