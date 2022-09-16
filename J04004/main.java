package J04004;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sumFraction s = new sumFraction(a, b, c, d);
        long tuso = a*d + b*c;
        long mauso = b*d;
        s.display(tuso,mauso);
    }
    
}
