package eva3_7_cubo;
public class EVA3_7_Cubo {
    public static void main(String[] args) {
        int[][][] cubo = new int[3][3][3];
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int)(Math.random() * 9);
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
