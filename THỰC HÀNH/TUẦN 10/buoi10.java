package BaiTapBuoi10;

public class buoi10 {
    public static boolean kiemTraNguyenTo(int n)
    {
        boolean nt= true;
        if(n==0 || n==1)
        return false;
        int i = 2;
        int tam= (int) Math.sqrt(n);
        while (i<= tam) {
            if(n%i ==0){
               nt= false;
               break;
            }
            i++;
        }
        return nt;
    }
    //bài 19. Liệt kê các số nguyên tố nhỏ hơn n
    public static void LietKeNguyenTo(int n)
    {
        System.out.printf("Cac so nguyen to nho hon %d la: ", n);
        for(int i = 1; i<n; i++)
        {
            if(kiemTraNguyenTo(i) == true)
            {
                System.out.print("\t" +i);
            }
        }
    }
    //Bài 20. Liệt kê n số nguyên tố đầu tiên 
    public static void LietKeSoNguyenTo(int n)
    {
        int dem =0;
        System.out.printf("\nDanh sach %d so nguyen to dau tien la: ", n);
        for(int i = 1; i<n ; i++)
        {
            if(kiemTraNguyenTo(i)==true)
            {
                if(dem== n)
                {
                    break;
                }
                else
                {
                    dem +=1;
                    System.out.print("\t"+i);
                }
            }
        }


    }
 public static void main(String[] args) {
    LietKeNguyenTo(11);
    LietKeSoNguyenTo(5);
       
 }
}
