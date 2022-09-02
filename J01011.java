import java.util.*;
public class J01011 {
    
public static long GCD (long a, long b){
    if(a==0){
        return b;
    }
        return GCD(b%a, a);
}
public static long LCM (long a, long b){
    return (a / GCD(a,b) ) * b;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0){
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(LCM(a,b)+" "+GCD(a,b));

    }
}
}
