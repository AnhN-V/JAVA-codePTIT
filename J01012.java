import java.util.*;
public class J01012 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- >0){
        long n = sc.nextLong();
        int count = 0;
        for(int i =2; i<=Math.sqrt((double)n);i++){
            if(n%i == 0){
                if(i%2==0){
                count+=1;
                }
                if((n/i)%2==0 && i*i != n){
                    count++;
                }
            }
        }
        if(n%2==0) count++;
        System.out.println(count);


    }
}
}
