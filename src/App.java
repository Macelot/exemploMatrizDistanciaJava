public class App {
    public static void main(String[] args) throws Exception {
        // vamos criar um conjunto de coordenadas
        // | #
        // |
        // | $
        // |
        // | . @
        // |_ _ _ _ _ _ _ _ _ _ _
        //
        // A = (1,1) .
        // B = (4,1) @
        // C = (4,5) #
        // D = (6,3) $
        int coordenadas[][];
        coordenadas = new int[4][2];
        coordenadas[0] = new int[] { 1, 1 }; // A
        coordenadas[1][0] = 4; // B
        coordenadas[1][1] = 1; // B
        coordenadas[2] = new int[] { 4, 5 }; // C
        coordenadas[3] = new int[] { 6, 3 }; // D

        double distancias[][] = new double[4][4];
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias[i].length; j++) {
                distancias[i][j] = dist(coordenadas[i], coordenadas[j]);
            }
        }

        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias[i].length; j++) {
                System.out.printf("%4.2f  ",distancias[i][j]);
            }
            System.out.println();
        }
        

    }

    public static double dist(int[] x_, int[] y_){
        double d = 0.0;
        double x, y;
        x = Math.pow((x_[0] - y_[0]), 2);
        y = Math.pow((x_[1] - y_[1]), 2);
        d = Math.sqrt((x + y));
        return d;
    }
}
