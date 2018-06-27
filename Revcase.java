import java.io.*;
import java.util.*;
public class Revcase
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++)
{
if(Character.isUpperCase(s.charAt(i)))
{
System.out.print(String.valueOf(s.charAt(i)).toLowerCase());
}
else if(Character.isLowerCase(s.charAt(i)))
{
System.out.print(String.valueOf(s.charAt(i)).toUpperCase());
}
}
}
}
