package BaiTapBuoi9;

public class buoi9 {
    public static void tamGiacVuongSaoNguoc(int n)
    {
        System.out.println("Tam giac vuong sao nguoc: ");
       for(int i = n; i>=1 ; i--)
       {
        for(int j=1; j<=i; j++)
        {
            System.out.print("* ");

        }
        System.out.println();
    }
    }
    public static void tamGiacVuongSao(int n)
    {
        System.out.println("Tam giac vuong sao: ");
        for(int i = 1; i<=n; i++)
        {
         for(int j=1; j<=i; j++)
         {
             System.out.print("* ");
 
         }
         System.out.println();
     }
    }
    public static void tamGiacCanSao(int n)
    {
        System.out.println("Tam giac can sao: ");
        for(int i = 1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
                for( int k=1; k<=2*i-1; k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
        public static void tamGiacCanSo(int n) {
            System.out.println("Tam giac can so: ");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k =1; k <=i ; k++) {
                    System.out.print(k +" ");
                }
                for (int l = i-1; l >= 0; l--) {
                    System.out.print(l+" ");
                }
                System.out.println();
            }
        }
        
    
    public static void tamGiacVuongSo(int n)
    {
         System.out.println("Tam giac vuong so: ");
         for(int i = 1; i<=n; i++)
        {
           for(int j=1; j<=i; j++)
         {
             System.out.print(j + " ");
         }
         System.out.println();
     }
    }
    public static void tamGiacVuongSoNguoc(int n)
    {
         System.out.println("Tam giac vuong so nguoc: ");
         for(int i = n; i>=1; i--)
        {
           for(int j=1; j<=i; j++)
         {
             System.out.print(j + " ");
         }
         System.out.println();
        }
    }

    public static void main(String[] args) {
   
  tamGiacCanSo(5);
  tamGiacCanSao(5);
  tamGiacVuongSao(5);
  tamGiacVuongSaoNguoc(5);
  tamGiacVuongSo(5);
  tamGiacVuongSoNguoc(5);
} 
}
     
     
