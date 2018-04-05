import java.io.*;
import java.util.*;
class pg48
{
public static void main(String a1[])
{
int a,i,d=0,c=0;
int b[]=new int[30];
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
a=sc.nextInt();
for(i=1;i<=a;i++)
b[i]=sc.nextInt();
for(i=1;i<=a;i++)
{
c+=b[i];
}
d=c/a;

System.out.println("output");
System.out.println(d);
}
}
