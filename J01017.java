import java.util.*;
public class J01017 {
    static int test(String n){
        for(int i=1;i<n.length();i++){
            if(Math.abs((n.charAt(i)) -(n.charAt(i-1))) != 1)
                return 0;
        }
            return 1;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            if(test(a) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
         }
    }
}
