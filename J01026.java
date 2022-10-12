import java.util.*;
public class J01026 {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        long n = sc.nextLong();
        if(checkPerfectSquare(n)){
            System.out.println("YES");
        }
        else
           System.out.println("NO");
        }
    }
}
