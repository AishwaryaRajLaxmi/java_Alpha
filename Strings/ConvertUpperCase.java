// package Strings;
import java.util.*;;

public class ConvertUpperCase {
    public static void main(String args[]){
        String str="hi, i am tanu";
        System.out.print(toUpperCase(str));
    }

    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(str.charAt(0));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase((str.charAt(i))));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
return sb.toString();

    }
}
