package BaiTapBuoi5;

public class Bai5_2 {
    public static void main(String[] args) {vidu1(); vidu2(); vidu3(); vidu4(); vidu5(); vidu6();}
    // Ham cho vi du 1
        public static void vidu1() {
    int a = 3;
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(a+++1);
    System.out.println(++a+1);
    }
    // Ham cho vi du 2
    public static void vidu2() {
    int d = 0 , b, c;
    d++;
    b = d;
    c = d++;
    System.out.println(d);
    System.out.println(b);
    System.out.println(c);
    }
    // Ham cho vi du 3
    public static void vidu3() {
    int y = 0, m, n;
    ++y;
    m = y;
    n = ++y;
    System.out.println(y);
    System.out.println(m);
    System.out.println(n);
    }
    // Ham cho vi du 4
    public static void vidu4() {
    int j = 0, p, g;
    ++j;
    p = ++j;
    g = j++;
    System.out.println(j);
    System.out.println(p);
    System.out.println(g);
    }
    // Ham cho vi du 5
    public static void vidu5() {
    int k = 0, l, u;
    ++k;
    l = ++k;
    u = l++;
    System.out.println(k);
    System.out.println(l);
    System.out.println(u);
    }
    // Ham cho vi du 6
    public static void vidu6() {
    int t = 0, s, v;
    ++t;
    s = t++;
    v = s++;
    v += v;
    System.out.println(t);
    System.out.println(s);
    System.out.println(v);
    }
}




