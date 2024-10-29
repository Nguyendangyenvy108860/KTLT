package BaiTapBuoi5;

public class Bai5_1 {
    public static int tinhgiatrilonnhat(int a, int b) {
        return a > b ? a : b;
    }
    public static int tinhgiatrinhonhat(int a, int b)
    { 
        return a < b ? a : b;
    }
    public static void main(String[] args) {
        System.out.printf("Gia tri lon nhat cua hai so %d và %d là: %d",5,7,tinhgiatrilonnhat(5, 7));
        System.out.printf("\nGia tri nho nhat cua hai so %d và %d là: %d",5,7,tinhgiatrinhonhat(5,7));
    }

    }
    

