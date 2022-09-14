package J04002;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        String color = sc.next();
        Rectange r = new Rectange();
        if(width <= 0 || height <= 0){
            System.out.println("INVALID");
        }else{
        System.out.printf("%.0f %.0f ",r.findPerimeter( width, height),r.findArea(width, height));
        r.display(color);  
    }
        }
}
