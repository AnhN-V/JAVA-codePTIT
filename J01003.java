import java.util.Scanner;
public class J01003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==0 && b!=0){
            System.out.println("VN");
        }else if(b==0 && a==0){
            System.out.println("VSN");
        }else {
        float n =(float)-b/a;
        System.out.printf("%.2f\n", n);
    }
}
}
