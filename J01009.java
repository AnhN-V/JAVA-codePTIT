import java.util.Scanner;
public class J01009 {
    public static long gt (int n){
        long gt = 1;
        for(int i=1;i<=n;i++){
            gt*=i;
        }
        return gt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;
        for(int i=1; i<=n;i++){
            sum+=gt(i);
        }
        System.out.println(sum);
    }
}
