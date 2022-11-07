package J05033;
import java.util.Collections;
import java.util.*;
class time {
    int h, m, s;
    void input(Scanner sc){
        this.h = sc.nextInt();
        this.m = sc.nextInt();
        this.s = sc.nextInt();
    }
    void output(){
        System.out.printf("%d %d %d\n", h, m, s);
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<time> v = new Vector<time>();
        for(int i =0; i < n; i++){
            time x = new time();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<time>() {
            @Override
            public int compare(time a, time b){
                if(a.h == b.h){
                    if(a.m == b.m){
                        if(a.s > b.s)
                            return 1;
                        else
                            return -1;
                    } else if (a.m > b.m)
                            return 1;
                        else
                            return -1;
                } else if( a.h > b.h)
                    return 1;
                else    
                    return -1;
            }
            
        });
            for (int i = 0; i<n; i++)
            v.get(i).output();
    }
}
