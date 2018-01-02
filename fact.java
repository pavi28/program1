import java.io.*;
import java.util.*;
class fact
{
public static void main(String a1[])
{
int b,d=1;
Scanner c=new Scanner(System.in);
System.out.println("Enter the number");
b=c.nextInt();
for(int i=1;i<=b;i++)
{
d=d*i;
}
System.out.println(d);
}
}
