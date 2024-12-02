import java.io.printwriter1
public static printwriter1{
    public static void main(String args[]){
        printwriter pw=new printwriter(System.out);
        pw.println("HelloWorld");
        pw.print("This is a");
        pw.print("print statement.");
        pw.close();
    }
}