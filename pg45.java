import java.io.*;
import java.util.*;
class pg45
{
public static void main(String a1[])
{
int a,b,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
a=sc.nextInt();
while(a>0)
{
b=a%10;
c++;
a=a/10;
}
System.out.println(c);
}
}
