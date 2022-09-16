package J04005;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birthday = sc.nextLine();
        float score1 = sc.nextFloat();
        float score2 = sc.nextFloat();
        float score3 = sc.nextFloat();
        classStudent c = new classStudent(name, birthday, score1, score2, score3);
        System.out.print(name+ " " +birthday);
        System.out.printf(" %.1f",+ c.sumScore(score1,score2,score3));
    }
}
