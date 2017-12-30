import java.io.*;
import java.util.*;
class pow
{
public static void main(String c[])
{
int d,e,f=1;
Scanner b=new Scanner(System.in);
System.out.println("Enter the base number");
d=b.nextInt();
System.out.println("Enter the Power value");
e=b.nextInt();
if(d>=0&&e==0)
{
f=1;
}
else if(d==0&&e==0)
{
f=0;
}
else
{
for(int i=0;i<e;i++)
{
f=f*d;
}
}
System.out.println("The result value is" +" "+ f);
}
}
