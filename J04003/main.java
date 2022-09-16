package J04003;
import java.util.*;
public class main {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    long tuso = sc.nextLong();
    long mauso = sc.nextLong(); 
    phanso p = new phanso();
    p.GCD(tuso, mauso);
    p.display(tuso, mauso);
    }
}
