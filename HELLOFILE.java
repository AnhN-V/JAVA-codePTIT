import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException{
        File file=new File("Hello.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNext()){
            String line=sc.nextLine();
            System.out.println(line);
        }
    }

    
}
