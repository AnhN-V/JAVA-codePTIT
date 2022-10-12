import java.util.*;
public class J01024 {
    public static int check(String n){
        for(int i = 0; i< n.length();i++){
            if(((n.charAt(i))-48) > 2)
                return 0;
        }
            return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();
                if(check(n) == 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
            }
        }
    }
}