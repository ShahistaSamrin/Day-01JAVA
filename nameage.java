import java.util.*;
public class nameage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b;
        b=sc.nextInt();
        String c=String.format("The name of the person is %s and age is %d",a,b);
        System.out.println(c);
    }
}