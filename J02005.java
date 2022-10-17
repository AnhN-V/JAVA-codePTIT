import java.util.*;
public class J02005 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n+1];
        int []b = new int[m+1];
        for(int i = 0; i< n;i ++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        Arrays.sort(a);
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if( a[i] != a[i-1] && b[j] != b[j-1] && b[j] == a[i] ){
                        System.out.print(b[j] + " ");
                    }
        
    }
        }
    }
}