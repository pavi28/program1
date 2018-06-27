import java.io.*;
import java.util.*;
public class Letter
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String h[]=s.split(" ");
String str="";
for(int i=0;i<h.length;i++)
{
 String v=h[i];
 str=str+((String.valueOf(v.charAt(0)).toUpperCase())+v.substring(1,v.length()))+" ";
}
System.out.println(str);
}
}
