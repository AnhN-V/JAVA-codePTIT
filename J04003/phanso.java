package J04003;

public class phanso {
    private long tuso, mauso;
public phanso(){
}
public phanso(long tuso, long mauso) {
    this.tuso = tuso;
    this.mauso = mauso;
 }
public static long GCD (long tuso, long mauso){
    if(tuso==0){
        return mauso;
    }
        return GCD(mauso % tuso, tuso);
}
 public void display(long tuso, long mauso){
    System.out.println(tuso/GCD(tuso,mauso) + "/" + mauso/GCD(tuso,mauso));
 }
}
