package J07001;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class docFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }

    }
}
