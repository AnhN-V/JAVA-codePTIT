import java.util.*;
public class J01014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long c = 0;
            while(n%2 ==0){
                n/=2;
                c=2;
            }
            while(n%3==0){
                c=3;
                n/=3;
            }
            for(long i=5;i<=Math.sqrt(n);i+=6){
                while(n%i ==0){
                    n/=i;
                    c=i;
                }
                while(n%(i+2)==0){
                    n/=(i+2);
                    c = i+2;
                }
            }
            if(n>4) c=n;
            System.out.println(c);    
        }
    }
}
