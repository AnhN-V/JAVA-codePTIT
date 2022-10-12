import java.util.*;
public class J01021 {
    static long CONST = (long) (Math.pow(10,9)+7);
    static long POW(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long result = POW(a, b/2) % CONST;
        if(b % 2 == 0) return (result * result) % CONST;
        else return ((result * result) % CONST * a) % CONST;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
        long a = sc.nextLong();
        long b = sc.nextLong();
        if( a == 0 && b == 0){
            break;
        }
        System.out.println(POW(a,b));
    }
}
}
