import java.io.*;
import java.util.*;
class maxa
{
public static void main(String a1[])
{
int a,i,d=0;

int d1[]=new int[30];
Scanner c=new Scanner(System.in);
System.out.print("enter the number of elements ");
a=c.nextInt();
System.out.println("enter the numbers");
for(i=0;i<a;i++)
d1[i]=c.nextInt();
for(int j=0;j<a;j++)
{
if(d1[j]>d1[j+1])
{
d1[j+1]=d1[j];
d=d1[j];
}
}
System.out.println(d +" is the maximum element");
}
}
