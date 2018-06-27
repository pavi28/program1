import java.io.*;
import java.util.*;
public class duplicate
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String b=sc.next();
        String s1="";
            for(int i=0;i<b.length();i++)
        {
             String d=String.valueOf(b.charAt(i));
            if(!s1.contains(d))
            {
            s1=s1+d;
            }
        }
        System.out.println(s1);
    }
}
