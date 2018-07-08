import java.util.*;
public class Repeat123
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int h[]=new int[num];
String s="";
for(int i=0;i<num;i++)
{
int h[i]=sc.nextInt();
}
for(int i=0;i<h.length;i++)
{
for(int j=i+1;j<h.length;j++)
{
if(h[i]==h[i+1]
{
String str=String.valueOf(h[i]);
if(!s.contains(str))
{
s=s+str;
}
}
}
}
String n[]=s.split("(?!^)");
Arrays.sort(n);
for(int j=0;j<n.length;j++)
{
System.out.print(n[j]);
}
}
}
