package J04001;
import java.util.*;
public class Main {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            while(t-- >0){
                Point d = new Point(in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextFloat());
                System.out.println(d);
            }
        }
    }
}
