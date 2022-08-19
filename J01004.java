import java.util.Scanner; 
public class J01004 {
    static Scanner sc = new Scanner(System.in);
    public static boolean isPrime (long n){
        for(int i=2;i<Math.sqrt(n);i++)
            if(n%i == 0) return false; 
        return true;    
    }
public static void display(){
    long n = sc.nextLong();
    System.out.println(isPrime(n) ? "YES" : "NO");
}
    public static void main(String[] args)
    {
        int t = sc.nextInt();
    while(t-- >0){
        display();
    }
}
}
