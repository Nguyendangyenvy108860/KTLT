package BaiTapBuoi12;

public class buoi12 {
    //Bài 10. SX theo chiều giảm 
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
        if(gtln <a[i])
        gtln = a[i];
    }
    return gtln;
}
  //Bài 14. Viết ct có định nghĩa hàm giá trị gtln trong 3 số nguyên cho trước.
   public static int timGiaTriLonNhat(int num1, int num2, int num3)
{
    int tam = num1;
    if(num2 >tam)
    tam = num2;
    if(num3 > tam)
    tam = num3;
return tam;
}
//Bài 18. Phân tích 1 số nguyên thành các thừa số nguyên tố. Ví dụ: số 28 đc phân tích thành 2*7*7
  public static void phanTichThuaSoNguyenTo(int n){
    System.out.printf("%d Phan tich thua so nguyen to la: ", n);
    int i =2;
    while ( n!= 0)
    {
        if(n!=0)
        {
            n/=i;
            System.out.print("\t" + i);
        }
        else
            i++;
    }
  }
  //Bài 27. Số hoàn hảo là số bằng tổng các ước thực sự của nó. ví dụ 6= 1*2*3. Viết chương trình ktra số nguyên dương n nhập từ bàn phím là số hoàn hảo ko
  public static int nhapGiaTriTuBanPhim() {
     Scanner sc = new Scanner (System.in);
     int tam;
     while (true){
        try{
            System.out.print("Nhap gia tri: ");
            tam = Integer. páeInt(sc.nextLine ());
            sc.close();
            return tam;
        } catch (Exception e) {
            System.out.println("Du lieu ko hop le, hay nhap lai!!!");
        }
     }
  }
  public static boolean kiemTraSoHoanHao(int n) {
    int tong = 0;
    for (int i= 1; i <= n / 2; i++) {
        if (n % i ==0)
        tong += i;
    }
    return tong == n;
  }
  public static void hienThiSoHoanHao(int n) {
    int tong = 0;
    if(kiemTraSoHoanHao(n)) {
        System.out.printf("%d la so hoan hao va cac uoc so cua no la: ", n);
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print("\t" + i);
                tong += i;
                if (tong == n)
                break;
            }
        }
    }else 
    System.out.printf("%d khong phai la so hoan hao", n);
  }


public static void main (String[ ] args) {
    int num1 = 5, num2 = 7, num3 =10, a[] = {-8, 5, 7, 2, 10};
    int num0 = 6;
    System .out.println("Mang ban dau la: ");
    hienThiMangGiam(a);
    System.out.println("\nMang sau khi sx theo thu tu giam: ");
    hienThiMangGiam(sapXepMangGiam(a));   
    System.out.print("\nGia tri nho nhat trong mang ban dau la: " + timGiaTriNhoNhat(a));
    System.out.print("\nGia tri lon nhat trong mang ban dau la: " + timGiaTriLonNhat(a));
    System.out.printf("\nGia tri lon nhat cua ba so  %d, %d, va %d la %d", num1, num2, num3, timGiaTriLonNhat(num1, num2, num3));
    phanTichThuaSoNguyenTo (15);
    int tam = nhapGiaTriTuBanPhim();
    hienThiSoHoanHao(tam);
}
}

