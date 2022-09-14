package J04002;
import java.util.*;
public class Rectange {
    private double width, height;
    private String color;
public Rectange(){
}
public Rectange (double width, double height, String color){
    this.width = width;
    this.height = height;
    this.color = color;
}
public double getWidth(){
    return width;
}
public void setWidth(double width){
    this.width = width;
}
public double getHeight(){
    return height;
}
public void setHeight(double height){
    this.height = height;
}
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}
public double findArea(double width, double height){
    return height*width;
}
public double findPerimeter(double width, double height){
    return 2*(width + height);
}
public void display(String color){
    color = color.toLowerCase();
    String first = color.substring(0,1);
    String last = color.substring(1,color.length());
    first = first.toUpperCase();
    color = (String) (first + last);
    System.out.print(color);
}
}
