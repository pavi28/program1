import java.io.*;
import java.util.*;
public class index
{
public static void main(String a[])
{
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a1[]=new int[n];
String s="";
int flag=0;
for(int i=0;i<n;i++)
{
a1[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(i==a1[i])
{
s=s+String.valueOf(a1[i])+" ";
flag++;
}
}
if(flag>0)
System.out.println(s);
else
System.out.println("-1");
}
}
