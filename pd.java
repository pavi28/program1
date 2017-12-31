import java.io.*;
import java.util.*;
class pd
{
public static void main(String a1[])
{
int a,d=0,j=0,e;
int i;
char b[]=new char[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
a=s.nextInt();
e=a;
while(a>0)
{
d=a%10;
j=(j*10)+d;
a=a/10;
}
if(e==j)
System.out.println("YES");
else
System.out.println("NO");
}
}
