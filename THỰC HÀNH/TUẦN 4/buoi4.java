public class buoi4 {
    public static void main(String[]args) {baikiemtra();}
    public static void baikiemtra() {
    int c[][][] = { { { 5, 2, 3 }, { 4, 5, 6, 8 }, { 7, 7 } }, { { 5, 6, 7, 3 } , { 8, 9 } } } ;
    int i =0, j=0, k=0;
    System.out.printf("\nPhan tu thu nhat c[%d][%d][%d] =%d", i, j, k, c[i][j][k]);
    System.out.printf("\nPhan tu thu hai c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu ba c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu tu c[%d][%d][%d] =%d", i = 0, j = j + 1, k = 0, c[i][j][k]);
    System.out.printf("\nPhan tu thu nam c[%d][%d][%d] =%d", i, j , k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu sau c[%d][%d][%d] =%d", i, j , k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu bay c[%d][%d][%d] =%d", i, j , k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu tam c[%d][%d][%d] =%d", i, j = j + 1, k = 0, c[i][j][k]);
    System.out.printf("\nPhan tu thu chin c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi c[%d][%d][%d] =%d", i = i + 1, j = 0, k = 0, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi mot c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi hai c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi ba c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi bon c[%d][%d][%d] =%d", i, j = j + 1, k, c[i][j][k]);
    System.out.printf("\nPhan tu thu muoi lam c[%d][%d][%d] =%d", i, j, k = k + 1, c[i][j][k]);
}

}
