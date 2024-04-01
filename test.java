package ejercicios.aaa.prog2.bandera;
import java.awt.Color;

public class test {
    public static final int YELLOW = new Color (250,201,20).getRGB();
    public static final int BLUE = new Color (17, 13,99).getRGB();
    public static final int RED = new Color (255,0,0).getRGB();
    public static final int BLACK = new Color (5,5,5).getRGB();
    public static final int WHITE = new Color (255,255,255).getRGB();
    public static final int GREEN = new Color (35,138,51).getRGB();
    public static void main(String[] args) {
     int[][] flagMatrix= {};
     for (int i = 1; i<=2 ; i++)
        for (int j = 1; j <= 2; j++) {
            flagMatrix = createZAFflag(i*12,j*24);
        
        JOptionPaneArrays.showColorArray2D(null,flagMatrix);

        }

     }
    public static int[][]createCOLFlag(int height, int width){
        int [][] COL = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        filInicio = (height*0)/4;
        filFinal = (height*2)/4;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                COL[i][j]= YELLOW;
                
            }
        }
        filInicio = (height*2)/4;
        filFinal = (height*3)/4;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                COL[i][j]= BLUE;
                
            }
        }
        filInicio = (height*3)/4;
        filFinal = (height*4)/4;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                COL[i][j]= RED;
                
            }
        
        
        return COL;
        

     }
    public static int[][]createVENFlag(int height, int width){
        int [][] VEN = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        filInicio = (height*0)/3;
        filFinal = (height*1)/3;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                VEN[i][j]= YELLOW;
                
            }
        
        
        filInicio = (height*1)/3;
        filFinal = (height*2)/3;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                VEN[i][j]= BLUE;
                
            }
        
     
        filInicio = (height*2)/3;
        filFinal = (height*3)/3;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                VEN[i][j]= RED;
                
            }
        
        return VEN;
    }
    public static int[][]createPOLflag(int height, int width){
        int [][] POL = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                POL[i][j]= WHITE;
                
            }
        
        
        
     
        filInicio = (height*1)/2;
        filFinal = (height*2)/2;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                POL[i][j]= RED;
                
            }
        
        return POL;
}
    public static int[][]createPANFlag(int height, int width){
    int [][] PAN = new int[height][width];
    int filInicio = 0, filFinal = 0;
    int colInicio = 0, colFinal = 0;
    filInicio = (height*0)/2;
    filFinal = (height*1)/2;
    colInicio=(width*0)/2;
    colFinal=(width*1)/2;
    for (int i = filInicio; i < filFinal ; i++) 
        for (int j = colInicio; j < colFinal; j++) {
            PAN[i][j]= WHITE;
            
        }
    
    
    filInicio = (height*0)/2;
    filFinal = (height*1)/2;
    colInicio=(width*1)/2;
    colFinal=(width*2)/2;
    for (int i = filInicio; i < filFinal ; i++) 
        for (int j = colInicio; j < colFinal; j++) {
            PAN[i][j]= RED;
            
        }
    
 
    filInicio = (height*1)/2;
    filFinal = (height*2)/2;
    colInicio=(width*0)/2;
    colFinal=(width*1)/2;
    for (int i = filInicio; i < filFinal ; i++) 
        for (int j = colInicio; j < colFinal; j++) {
            PAN[i][j]= BLUE;
            
        }
    
    filInicio = (height*1)/2;
    filFinal = (height*2)/2;
    colInicio=(width*1)/2;
    colFinal=(width*2)/2;
    for (int i = filInicio; i < filFinal ; i++) 
        for (int j = colInicio; j < colFinal; j++) {
            PAN[i][j]= WHITE;
            
        }
    
    return PAN;
    }
    public static int[][]createCHLFlag(int height, int width){
        int [][] CHL = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*0)/3;
        colFinal=(width*1)/3;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                CHL[i][j]= BLUE;
                
            }
        
        
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*1)/3;
        colFinal=(width*3)/3;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                CHL[i][j]= WHITE;
                
            }
        
     
        filInicio = (height*1)/2;
        filFinal = (height*2)/2;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                CHL[i][j]= RED;
                
            }
        
        return CHL;
    }
    public static int[][]createUSAFlag(int height, int width){
        int [][] USA = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*0)/3;
        colFinal=(width*1)/3;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                USA[i][j]= BLUE;
                
            }
        
        
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*1)/3;
        colFinal=(width*3)/3;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                if(i%2==0){               
                    USA[i][j]= RED;
                }else if (i%2!=0) {
                    USA[i][j] = WHITE;

                    
                }
                
            }
        
     
        filInicio = (height*1)/2;
        filFinal = (height*2)/2;
        colInicio=(width*0)/1;
        colFinal=(width*1)/1;
        for (int i = filInicio; i < filFinal ; i++) 
            for (int j = colInicio; j < colFinal; j++) {
                if(i%2==0){               
                    USA[i][j]= RED;
                }else if (i%2!=0) {
                    USA[i][j] = WHITE;

                    
                }
                
            }
        
        return USA;
    }
    public static int[][]createCZEFlag(int height, int width){
        int [][] CZE = new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        colInicio = (width*0)/5;
        colFinal = (width*3)/5;
        filInicio=(height*0)/1;
        filFinal=(height*1)/1;     
        for (int f = colInicio; f < colFinal ; f++) {
            for (int c = filInicio; c < filFinal; c++) {
                CZE[c][f]= BLUE;
                
                
            }
        filInicio++;
        filFinal--;
    }
    
    
        filInicio = (height*0)/2;
        filFinal = (height*1)/2;
        colInicio=(width*0)/3;
        colFinal=(width*3)/3;
        for (int i = filInicio; i < filFinal ; i++){ 
            for (int j = colInicio+1; j < colFinal; j++) {
                CZE[i][j]= WHITE;
                
            }
        colInicio++;
        }

        filInicio = (height*1)/2;
        filFinal = (height*2)/2;
        colInicio=(width*0)/3;
        colFinal=(width*3)/3;
        for (int i = filFinal-1; i >= filInicio; i--){
            for (int j = colFinal-1; j > colInicio; j--) {
                CZE[i][j]=RED;
                
            }
        colInicio++;
        }
        
        return CZE;
    }
    public static int[][]createDNKFlag(int height, int width){
        int DNK[][]= new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;
        colInicio = (width*0)/4;
        colFinal = (width*1)/4;
        filInicio=(height*0)/2;
        filFinal=(height*1)/2;
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=RED;
            }
        }

        colInicio = (width*2)/8;
        colFinal = (width*3)/8;
        filInicio=(height*0)/2;
        filFinal=(height*2)/2;
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=WHITE;
            }
        }

        colInicio = (width*0)/1;
        colFinal = (width*1)/1;
        filInicio=((height*2)/5);
        filFinal=((height*3)/5);
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=WHITE;
            }
        }

        colInicio = (width*0)/4;
        colFinal = (width*1)/4;
        filInicio=(height*4)/8;
        filFinal=(height*8)/8;
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=RED;
            }
        }


        colInicio = ((width*3)/8);
        colFinal = (width*8)/8;
        filInicio=(height*0)/8;
        filFinal=(height*3)/8;
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=RED;
            }
        }

        colInicio = (width*3)/8;
        colFinal = (width*8)/8;
        filInicio=(height*1)/2;
        filFinal=(height*2)/2;
        for (int i = filInicio; i < filFinal; i++) {
            for (int j = colInicio; j < colFinal; j++) {
                DNK[i][j]=RED;
            }
        }
        return DNK;
   }
    public static int[][]createFINflag(int height, int width){
    int FIN[][]= new int[height][width];
    int filInicio = 0, filFinal = 0;
    int colInicio = 0, colFinal = 0;
    colInicio = (width*0)/5;
    colFinal = (width*1)/5;
    filInicio=(height*0)/3;
    filFinal=(height*1)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=WHITE;
        }
    }

    colInicio = (width*1)/5;
    colFinal = (width*2)/5;
    filInicio=(height*0)/3;
    filFinal=(height*3)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=BLUE;
        }
    }

    colInicio = (width*2)/5;
    colFinal = (width*5)/5;
    filInicio=(height*0)/3;
    filFinal=(height*1)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=WHITE;
        }
    }

    colInicio = (width*0)/5;
    colFinal = (width*5)/5;
    filInicio=(height*1)/3;
    filFinal=(height*2)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=BLUE;
            

            }
        }      
        
        colInicio = (width*2)/5;
    colFinal = (width*5)/5;
    filInicio=(height*2)/3;
    filFinal=(height*3)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=WHITE;
        }
    }
    colInicio = (width*0)/5;
    colFinal = (width*1)/5;
    filInicio=(height*2)/3;
    filFinal=(height*3)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            FIN[i][j]=WHITE;
        }
    }
        return FIN;
   }
    public static int[][]createKWTflag(int height, int width){
    int KWT[][]= new int[height][width];
    int filInicio = 0, filFinal = 0;
    int colInicio = 0, colFinal = 0;
    colInicio = (width*0)/5;
    colFinal = (width*5)/5;
    filInicio=(height*0)/3;
    filFinal=(height*1)/3;
    for (int i = filInicio; i < filFinal; i++) {
        for (int j = colInicio; j < colFinal; j++) {
            KWT[i][j]=BLACK;
        }
        filInicio++;
    filFinal--;
    }
        filInicio = (height*0)/3;
        filFinal = (height*1)/3;
        colInicio=(width*0)/4;
        colFinal=(width*4)/4;
        for (int i = filInicio; i < filFinal ; i++){ 
            for (int j = colInicio+1; j < colFinal; j++) {
                KWT[i][j]= GREEN;
                
            }
        colInicio++;
        }
        filInicio = (height*1)/3;
        filFinal = (height*2)/3;
        colInicio=(width*1)/4;
        colFinal=(width*4)/4;
        for (int i = filInicio; i < filFinal ; i++){ 
            for (int j = colInicio-3; j < colFinal; j++) {
                KWT[i][j]= WHITE;
            }
        }
        filInicio = (height*2)/3;
        filFinal = (height*3)/3;
        colInicio=(width*0)/4;
        colFinal=(width*4)/4;
        for (int i = filFinal-1; i >= filInicio; i--){
            for (int j = colFinal-1; j > colInicio; j--) {
                KWT[i][j]=RED;
                
            }
        colInicio++;
        }
    return KWT;
    }
    public static int[][]createZAFflag(int height, int width){
        int ZAF[][]= new int[height][width];
        int filInicio = 0, filFinal = 0;
        int colInicio = 0, colFinal = 0;


        colInicio = (width*0)/5;
        colFinal = (width*1)/5;
        filInicio=(height*1)/4;
        filFinal=(height*3)/4;
        for (int f = colInicio; f < colFinal ; f++) {
            for (int c = filInicio; c < filFinal; c++) {
                ZAF[c][f]= BLUE;
                
                
            }
        filInicio++;
        filFinal--;
    }
return ZAF;
}
}