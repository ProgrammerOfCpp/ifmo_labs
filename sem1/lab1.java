public class Main {

    public static float randomInRange(float min, float max) {
        return (float)(Math.random() * (max - min) + min);
    }

    public static boolean contains(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b)
                return true;
        }
        return false;
    }

    public static int[] generateRange(int from, int to) {
        int[] out = new int[Math.abs(to - from) + 1];
        int i = 0, value = from;
        do {
            out[i++] = value;
            value += (from > to ? -1 : 1);
        } while (value != to);
        return out;
    }

    public static double firstCase(float x) {
        return 1.0 / 3 * Math.asin(1 / (Math.pow(Math.E, Math.abs(x))));
    }

    public static double secondCase(float x) {
        return Math.tan(Math.asin(Math.PI * x / 12 / 4));
    }

    public static double thirdCase(float x) {
        double pow = (1 - Math.cos(1.0 / 4 * (0.25 + Math.sin(x)))) / 2 / 3;
        double base = Math.asin(Math.pow(Math.E, -2 * Math.abs(x)));
        return Math.pow(base, pow);
    }

    public static double[][] generateMatrix(int[] d, float[] x) {
        int[] specialValuesOfD = { 6, 8, 10, 11, 14, 17 };
        double[][] mat = new double[12][15];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 15; j++) {
                if (d[i] == 13) {
                    mat[i][j] = firstCase(x[j]);
                } else if (contains(specialValuesOfD, d[i])) {
                    mat[i][j] = secondCase(x[j]);
                } else {
                    mat[i][j] = thirdCase(x[j]);
                }
            }
        }
        return mat;
    }

    public static void printMatrix(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%.5f ", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] d = generateRange(17, 6);

        float[] x = new float[15];
        for (int i = 0; i < 15; i++) {
            x[i] = randomInRange(-6, 6);
        }

        double[][] d1 = generateMatrix(d, x);
        printMatrix(d1);
    }
}
