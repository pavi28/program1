import java.io.*;
import java.util.*;
public class Pangram
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
for(int i=0;i<s1.length();i++)
{
if(((s1.charAt(i)>='A')&&(s1.charAt(i)<='Z'))||((s1.charAt(i)>='a')&&(s1.charAt(i)<='z')))
{
count++;
}
}
if(count==26)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
