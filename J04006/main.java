package J04006;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String code = "B20DCCN001";
        String name = sc.nextLine();
        String grade = sc.nextLine();
        String date = sc.nextLine();
        float GPA = sc.nextFloat();
        classStudent c = new classStudent(code, name,grade,date,GPA);
        System.out.print(code);
        c.prinName(name);
        c.prinGrade(grade);
        c.prinDate(date);
        c.prinGPA(GPA);
    }

}
