import java.util.Scanner;
public class J01002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t<=10){
        while(t-- >0){
            long n = sc.nextInt();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
        }
    }
}