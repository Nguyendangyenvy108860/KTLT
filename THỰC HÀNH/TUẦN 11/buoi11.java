package BaiTapBuoi11;

public class buoi11 {
    public static void xacDinhTamGiac(double a, double b, double c) {
        System.out.println("Bai 2: ");

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("\tDay la 3 canh cua mot tam giac.");
            if (a == b && b == c) {
                System.out.println("\tLoai tam giac: Tam giac deu.");
            } else if (a == b || b == c || a == c) {
                if (Math.sqrt(a * a + b * b) == c || Math.sqrt(a * a + c * c) == b || Math.sqrt(b * b + c * c) == a) {
                    System.out.println("\tLoai tam giac: Tam giac vuong can.");
                } else {
                    System.out.println("\tLoai tam giac: Tam giac can.");
                }
            } else if (Math.sqrt(a * a + b * b) == c || Math.sqrt(a * a + c * c) == b || Math.sqrt(b * b + c * c) == a) {
                System.out.println("\tLoai tam giac: Tam giac vuong.");
            } else {
                System.out.println("\tLoai tam giac: Tam giac thuong.");
            }
        } else {
            System.out.println("\tBa so khong phai la 3 canh cua tam giac.");
        }
        System.out.println("\n");
    }
    public static void xacDinhLaTamGiac(double a, double b, double c) {
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.printf("Ba gia tri %.1f, %.1f, %.1f tao thanh tam giac deu!", a, b, c);
            }else{
                if ( a==b || b==c || a==c){
                    if(a*a == b*b + c*c || c*c == a*a + b*b){
                        System.out.printf("Ba gia tri %.1f, %.1f, %.1f tao thanh tam giac vuong can!" , a, b, c);
                    }else{
                        System.out.printf( "Ba gia tri %.1f, %.1f, %.1f tao thanh tam giac can!" , a, b, c);
                    }
                }else{
                    if(a*a ==b*b +c*c || b*b == a*a +c *c || c*c == a*a +b*b ){
                        System.out.printf("Ba gia tri %.1f, %.1f, %.1f tao thanh tam giac vuong!" , a, b, c);
                    }else{
                        System.out.printf( "Ba gia tri %.1f, %.1f, %.1f tao thanh tam giac thuong!" , a, b, c);
                    }
                }
            }
        }else
            System.out.printf("Ba gia tri %.1f, %.1f, %.1f khong phai la ba canh tam giac!" , a, b, c);
        }
    public static long tinhGiaiThua(int n)
           {
            long tong = 1;
            for(int i=1; i<=n; i++)
            {
                tong *=i;
            }
            return tong;
           }
        public static void tinhTongGiaiThua()
        {
            long S = tinhGiaiThua(4) + tinhGiaiThua(5) + tinhGiaiThua(7) + tinhGiaiThua(9);
            System.out.println("\nTong giai thua cua 4, 5, 7 va 9 la: " + S);

        }
        //Bài 7.Viết ct tìm ước số chung lớn nhất của 2 số nguyên nhập vào từ bàn phím.
     public static int timUCLN(int num1, int num2)  
     {
        int ucln;
        while(num2 !=0)
        {
            ucln = num1%num2;
            num1 = num2;
            num2 = ucln;
        }
        return num1;
     }  
        //Bài 8. Viết ct tìm bội số chung nhỏ nhất của 2 số nguyên nhập vào từ bàn phím.   
         public static int timBCNN(int num1, int num2)  
         {
            int tam = (num1*num2)/timBCNN(num1, num2);
            return tam;
         }
         //Bài 9. Viết ct tính tổng các số lẻ từ 1 đến n.
         public static int tinhTongSoLe(int n)
         {
            int tong = 0;
            for(int i=1; i<=n; i++)
            {
                if(i%2 !=0)
                {
                    tong +=i;
                }
            }
            return tong;
         }
         //Bài 5. Viết ct sx mảng các số nguyên theo chiều tăng dần giá trị các phần tử.
         public static int  [] sapXepMangTang(int a[])
         {
            for(int i=0; i<a.length-1; i++)
            {
                for(int j = 0; j<a.length-1-i; j++)
                {
                    if(a[j]> a[j+1])
                    {
                        int tam = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tam;
                    }
                }
            }
            return a;
         }
         public static void hienThiMangTang(int a[])
         {
            for(int i= 0; i<a.length; i++)
            {
                System.out.print("\t" + a[i]);
            }
         }
         //sx theo chiều giảm (bài 10)BTVN
         public static int [] sapXepMangGiam(int a[])
         {
            for(int i=0; i<a.length-1; i++)
            {
                for(int j = 0; j<a.length-1-i; j++)
                {
                    if(a[j]< a[j+1])
                    {
                        int tam = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tam;
                    }
                }
            }
            return a;
         }
         public static void hienThiMangGiam(int a[])
         {
            for(int i= 0; i>a.length; i++)
            {
                System.out.print("\t" + a[i]);
            }
         }
          //Bài 11. Viết chương trình tìm giá trị nhỏ nhất của các số nguyên
    public static int timGiaTriNhoNhat (int a[])
    {
        int gtnn = a[0];
        for(int i = 1; i<a.length; i++)
        {
            if(gtnn>a[i])
            gtnn = a[i];
        }
        return gtnn;
    }
    //Bài 12. Viết chương trình tìm gtln của mảng các số nguyên
    public static int timGiaTriLonNhat (int a[])
    {
        int gtln = a[0];
        for(int i = 1; i<a.length; i++)
        {
            if(gtln < a[i])
            gtln = a[i];
        }
        return gtln;
    }
    public static void main(String[] args) {
       int a[] = {-8, 5, 7, 2, 10};
       System .out.println("Mang ban dau la: ");
       hienThiMangGiam(a);
       System.out.println("\nMang sau khi sx theo thu tu giam: ");
       hienThiMangGiam(sapXepMangGiam(a));   
       System.out.print("\nGia tri nho nhat trong mang ban dau la: " + timGiaTriNhoNhat(a));
       System.out.print("\nGia tri lon nhat trong mang ban dau la: " + timGiaTriLonNhat(a));

}     
}