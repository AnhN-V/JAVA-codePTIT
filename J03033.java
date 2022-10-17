import java.util.*;
import java.math.*;
import java.lang.*;
public class J03033 {
    public static BigInteger lcm(String a, String b)
    {
        BigInteger s = new BigInteger(a);
        BigInteger s1 = new BigInteger(b);
 
        BigInteger mul = s.multiply(s1);  // calculate multiplication of two bigintegers
        BigInteger gcd = s.gcd(s1);  // calculate gcd of two bigintegers
        BigInteger lcm = mul.divide(gcd);  // calculate lcm using formula: lcm * gcd = x * y
        return lcm;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t--> 0){

        String a = sc.next();
        String b = sc.next();

        System.out.println(lcm(a, b));
        }
    }
}
