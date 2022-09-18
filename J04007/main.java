package J04007;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String birth = sc.nextLine();
        String address = sc.nextLine();
        String taxcode = sc.nextLine();
        String date = sc.nextLine();
        staff s = new staff(name, sex, birth, address, taxcode, date);
        System.out.print("00001");
        s.prinName(name);
        s.prinSex(sex);
        s.prinBirth(birth);
        s.prinAddress(address);
        s.prinTaxcode(taxcode);
        s.prinDate(date);
    }
    
}
