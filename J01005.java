import java.util.Scanner;
public class J01005{
    static Scanner sc = new Scanner(System.in);
     static void test (){
        int n = sc.nextInt();
        double h = sc.nextDouble();
        for(int i = 1; i<n; i++)
            System.out.format("%.6f ", h*Math.sqrt((double)i/n));
            System.out.println();
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-- >0){
        test();
        }
    }
}