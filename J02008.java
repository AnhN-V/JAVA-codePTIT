import java.util.*;
public class J02008 {
    public static long GCD(long a, long b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    public static long LCM(long a, long b){
        return a * b / GCD(a,b) ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long n = sc.nextLong();
            long tmp = 1;
            for(int i = 1; i<= n; i++){
                tmp = LCM(tmp,i);
            }
            System.out.println(tmp);
        }
    }
}
