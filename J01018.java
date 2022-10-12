import java.util.*;
public class J01018 {
    public static long totaldigit(String n){
        long total = 0;
        for(int i=0;i<n.length();i++){
            total = (long) (total + (n.charAt(i)-48));
        }
        return total;
    }
    static int test(String n){
        for(int i=1;i<n.length();i++){
            if(Math.abs((n.charAt(i)) -(n.charAt(i-1))) != 2)
                return 0;
        }
            return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();
            if(totaldigit(n) % 10 == 0 && test(n) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
