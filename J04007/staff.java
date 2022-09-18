package J04007;
public class staff {
    private String name, sex, birth, address, taxcode,date;
public staff(){
} 
public staff(String name, String sex, String birth, String address, String taxcode, String date){
   
}
public void prinName(String name){
    if(name.length()<=40){
    System.out.print(" "+name);
    }
}
public void prinSex(String sex){
        System.out.print(" "+sex);
}
public void prinDate(String date){
    String b[] = date.split("/");
    b[0] = (b[0].length()>1)?b[0]:"0"+b[0];
    b[1]=(b[1].length()>1)?b[1]:"0"+b[1];
    date = String.join("/",b);
   System.out.print(" "+ date);
 }
public void prinBirth(String birth){
    prinDate(birth);
}
public void prinAddress(String address){
    if(address.length()<=100){
    System.out.print(" "+address+" ");
    }
}
public void prinTaxcode(String taxcode){
    if(taxcode.length()==10){
    System.out.print(taxcode);
    }    
}

}
