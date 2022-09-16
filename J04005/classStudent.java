package J04005;
import java.util.*;
public class classStudent {
    private String name, birthday;
    private float score1, score2, score3;
public classStudent(String name, String birthday, float score1, float score2, float score3){
    this.name = name;
    this.birthday = birthday;
    this.score1 = score1;
    this.score2 = score2;
    this.score3 = score3;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getBirthday(){
    return birthday;
}
public void setBirthday(String birthday){
    this.birthday = birthday;
}
public float getscore1(){
    return score1;
}
public float getscore2(){
    return score2;
}
public float getscore3(){
    return score3;
}
public void setScore1(float score1){
    this.score1 = score1;
}
public void setScore2(float score2){
    this.score2 = score2;
}
public void setScore3(float score3){
    this.score3 = score3;
}
public static float sumScore(float score1, float score2, float score3){
    return score1 + score2 + score3;
}
}
