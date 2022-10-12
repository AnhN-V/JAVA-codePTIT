import java.util.*;
public  class J01016 {
public static long dem7(long n){
    long count7 = 0;
    while(n>0){
        if(n % 10 == 7){
            count7 ++;
        }
        n = n/10;
    }
    return count7;
}
public static long dem4(long n){
    long count4 = 0;
    while(n>0){
        if(n %10 == 4){
            count4 ++;
        }
        n = n/10;
    }
    return count4;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    if(dem4(n) + dem7(n) == 4 || dem4(n) + dem7(n) == 7){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
}
}