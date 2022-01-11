public class DiagonalMatrizBidim {
  public static void main (String[] args) {
    int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
     
    int [] diagonalConcreta;
    diagonalConcreta = diagonal (matriz,1,2,"nose");
    for (int i=0; i<diagonalConcreta.length, i++) {
      System.out.print(diagonalConcreta[i]+ " ");
    }
    
  }
  
  public static int[] diagonal (int [][] m, int f, int c, String orientacion) {
    int [] resultado;
    
    
    if (orientacion.equals("nose") {
      int f1 = f;
      int c1 = c;
      while (f1>0 && c1>0) {
        f1--;
        c1--;
      }
      int contador=0;
      int c2=c1;
      int f2=f1;
      while (f2<=m.lentgh && c2<=m[0].length) {
        contador++;
        f2++;
        c2++;
      }
      resultado = new int[contador];
      contador=0;
      while (f1<=m.lentgh && c1<=m[0].length) {
        resultado[contador]=m[f1][c1];
        contador++;
        f1++;
        c1++;
      }
      
    } else {
      
    }
    
  }
}
