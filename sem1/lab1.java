
public class Main {
    
    public static float randomInRange(float min, float max) {
        return (float)(Math.random() * (max - min) + min);
    }
    
    public boolean contains(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
             if (a[i] == b) 
                 return true;
        }
        return false;
    }
    
    public int[] generateRange(int from, int to) {
        int[] out = new int[to - from + 1];
        int i = 0, value = from;
        do {
            out[i++] = value;
            value += (from > to ? -1 : 1);
        } while (value != to);
    }
    
    public static void main(String[] args) {
        int[] d = generateRange(17, 6);
        
        float[] x = new float[15];
        for (int i = 0; i < 15; i++) {
            x[i] = randomInRange(-6, 6);
        }
        
        int[] specialValuesOfD = { 6, 8, 10, 11, 14, 17 };
        double[][] d1 = new double[12][15];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 15; j++) {
                if (d[i] == 13) { // case 1
                    d1[i][j] = 1.0 / 3 * Math.asin(1 / (Math.pow(Math.E, Math.abs(x[j]))));
                } else {
                    if (contains(specialValuedOfD, d[i]) { // case 2
                        d1[i][j] = Math.tan(Math.asin(Math.PI * x[j] / 12 / 4));
                    } else { // case 3
                        double pow = (1 - Math.cos(1.0 / 4 * (0.25 + Math.sin(x[j])))) / 2 / 3;
                        double base = Math.asin(Math.pow(Math.E, -2 * Math.abs(x[j])));
                        d1[i][j] = Math.pow(base, pow);
                    }
                }
                System.out.format("%.5f ", d1[i][j]);
            }
            System.out.println();
        }
    }
}
