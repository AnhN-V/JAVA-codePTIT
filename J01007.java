import java.util.Scanner;
public class J01007 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if(fibo(n)==1) System.out.println("YES"); 
            if(fibo(n) == 0) System.out.println("NO");
        }
}
 public static long fibo (long n){
    long a[] = new long[100];
    a[0] = 0;
    a[1] = 1;
    for(int i = 2; i< 100; i++){
        a[i] = a[i-1] + a[i-2];
    }
    for(int i=0; i < 100; i++)
        if(a[i] == n) return 1;
    return 0;
 }
}