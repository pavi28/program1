import java.io.*;
import java.util.*;
public class re
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="";
int count=0;
for(int i=0;i<s.length();i++)
{
String v=String.valueOf(s.charAt(i));
if(!s1.contains(v))
{
s1=s1+v;
}
}
int n=s.length()-s1.length();
int s3=s.length()-n-n;
if(s3==1)
{
   System.out.println("YES"); 
}
else
{
    System.out.println("NO");
}
}
}
