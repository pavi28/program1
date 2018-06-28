import java.io.*;
import java.util.*;
public class swapalp
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i=i+2)
        {
            char temp;
            temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        for(int i=0;i<c.length;i++)
System.out.print(c[i]);
        
    }
}

