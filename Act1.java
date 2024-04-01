package ejercicios.aaa.prog2.bandera;
import java.awt.Color;
public class Act1 {
    public static final int YELLOW = new Color (250,201,20).getRGB();
    public static final int BLUE = new Color (17, 13,99).getRGB();
    public static final int RED = new Color (255,0,0).getRGB();
    public static final int BLACK = new Color (5,5,5).getRGB();
    public static final int WHITE = new Color (255,255,255).getRGB();
    public static final int GREEN = new Color (35,138,51).getRGB();
    

    public static void main(String[] args) {
        int [][] banderas= new int [12][20];
        

        JOptionPaneArrays.showColorArray2D(null,banderas);

    }
    

public static int[][] colResul (int height, int width){
    
    int [][]banderaCol = new int[12][20];
    for (int i = 0; i < 6; i++) {
            
        for (int j = 0; j < 20; j++) {
            banderaCol[i][j]=YELLOW;
        }
    }
    for (int i = 6; i < 9; i++) {
        
        for (int j = 0; j < 20; j++) {
            banderaCol[i][j]=BLUE;
        }
    }
    for (int i = 9; i < 12; i++) {
        
        for (int j = 0; j < 20; j++) {
            banderaCol[i][j]=RED;
        }
    }
    return banderaCol;
}

}

