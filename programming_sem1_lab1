
public class Main {
    
    public static void main(String[] args) {
        int[] d = new int[12];
        for (int i = 17, j = 0; i >= 6; i--, j++) {
            d[j] = i;
        }
        float[] x = new float[15];
        for (int i = 0; i < 15; i++) {
            x[i] = (float)(Math.random() * 12 - 6);
        }
        int[] specialValuesOfD = { 6, 8, 10, 11, 14, 17 };
        double[][] d1 = new double[12][15];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 15; j++) {
                if (d[i] == 13) {
                    d1[i][j] = 1.0 / 3 * Math.asin(1 / (Math.pow(Math.E, Math.abs(x[j]))));
                } else {
                    boolean isSpecialValue = false;
                    for (int k = 0; k < specialValuesOfD.length; k++) {
                        if (specialValuesOfD[k] == d[i]) {
                            isSpecialValue = true;
                            break;
                        }
                    }
                    
                    if (isSpecialValue) {
                        d1[i][j] = Math.tan(Math.asin(Math.PI * x[j] / 12 / 4));
                    } else {
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
