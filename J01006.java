import java.util.Scanner;
public class J01006 {
    static Scanner sc = new Scanner(System.in);
    public static long Fibo ( long n){
        if(n == 1 || n == 2){
            return 1;
        }
        long a = 0, i=3, a1=1, a2=1;
        while(i<=n){
            a = a1 + a2;
            a1=a2;
            a2=a;
            i++;
        }
        return a;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
                System.out.println(Fibo(n)+ " ");
        }
    }
    
}
