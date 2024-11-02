public class bai4_4 {
    public static void main(String[] args) {bai4_4();}
    public static void bai4_4() {
        int arr2[][] = {{1,2,3},{4,5,6},{7}};
        System.out.println("\nDanh sách phần tử của mảng arr2 là: ");
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr2[i].length; j++)
            {
                System.out.printf("arr2[%d][%d] = %d\t",i,j, arr2[i][j]);
            }
            System.out.println();
        }
}
}