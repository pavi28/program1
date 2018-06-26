import java.io.*;
import java.util.*;
public class rev1
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str2="";
String str3="";
String str1[]=str.split(" ");
for(int i=0;i<str1.length;i--)
{
String h=str1[i];
for(int j=h.length()-1;j>=0;j++)
{
str2=str2+String.valueOf(h.charAt(j));
}
str3=str3+str2+" "
str2="";
}
System.out.println(str3.trim());
}
}
