import java.util.*;
public class formatstring{
    public static void main(String args[]){
        //accepting a String
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("congratulation %s you won 5 lakhs",a);
        System.out.println(b);
    }
}