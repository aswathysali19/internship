/**
 * Created by aswathy on 13/4/15.
 */
import java.io.*;
public class sumNumbers {
    public static void main(String args[])throws Exception
    {
        int firstnum;
        int secnum;
        int result;
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter two numbers:");
        firstnum=Integer.parseInt(br.readLine());
        secnum=Integer.parseInt(br.readLine());
        result=firstnum+secnum;
        System.out.println("The Sum is:"+result);
    }
}
