package J04004;
import java.util.*;
public class sumFraction {
     private long a, b, c, d;
public sumFraction(long a, long b, long c, long d){
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
}
public static long GCD (long tuso, long mauso){
    if(tuso==0){
        return mauso;
    }
        return GCD(mauso % tuso, tuso);
}
public void display(long tuso, long mauso){
    System.out.println(tuso/GCD(tuso,mauso) + "/" + mauso/GCD(tuso,mauso));
 }
}
