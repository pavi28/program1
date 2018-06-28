import java.io.*;
import java.util.*;
public class Isomorphic
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1[]=str.split(" ");
        int count=0;
        String str2=""; 
        for(int i=0;i<str1.length;i++)
        {
            count=0;
            String v=str1[i];
            for(int j=0;j<v.length()-1;j++)
            {
            if(v.charAt(j)==v.charAt(j+1))
            {
                count++;
            }
            }
            str2=str2+count;
        }
        String str4="";
        for(int i=0;i<str2.length();i++)
        {
            String h=String.valueOf(str2.charAt(i));
        if(!str4.contains(h))
        {
            str4=str4+h;
        }
        }
        if(str4.length()==1)
        {
        System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
