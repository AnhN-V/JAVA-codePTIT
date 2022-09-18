package J04006;
import java.util.*;
public class classStudent {
    private String code, name, grade , date;
    private float GPA;
public classStudent(){
}
public classStudent(String code,String name, String grade, String date, float GPA){
    this.code = "B20DCCN001";
    this.name = name;
    this.grade = grade;
    this.date= date;
    this.GPA = GPA;
}
public void prinName(String name){
    if(date.length()<=30){
    System.out.print(" " +name+" ");
}  
}
public void prinGrade(String grade){
    System.out.print(grade+" ");
}
public void prinDate(String date){
   String b[] = date.split("/");
   b[0] = (b[0].length()>1)?b[0]:"0"+b[0];
   b[1]=(b[1].length()>1)?b[1]:"0"+b[1];
   date = String.join("/",b);
  System.out.print(date+" ");
}
public void prinGPA(float GPA){
    if(GPA<=4){
    System.out.printf("%.2f",GPA);
}
}

}
