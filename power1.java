import java.io.*;
import java.util.*;
import java.math.*;
class power1
{
public static void main(String a1[])
{
int h=1,a,b1=0,i=0,f=0,m=0,l;

int d1[]=new int[30];
Scanner c=new Scanner(System.in);
System.out.print("enter the number");
a=c.nextInt();
l=a;
while(a>0)
{

 f=a%10;
a=a/10;

System.out.println(f);
i++;
d1[i]=f;

}
for(int j=1;j<=i;j++)
{
for(int k=1;k<=i;k++)
{
h=h*d1[j];
}
m+=h;
h=1;
}
System.out.println(m);
if(m==l)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
