import java.io.*;
import java.util.*;
public class Prefix
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)==s1.charAt(i))
        {
        count++;
        }
        else
        {
        break;
        }
        }
        System.out.println(count);
    }
}
