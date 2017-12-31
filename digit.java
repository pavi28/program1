import java.io.*;
import java.util.*;
class digit
{
public static void main(String a1[])
{
int a,i=0;
char d;
int b[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
a=s.nextInt();
while(a>0)
{
int f=a%10;
a=a/10;
i++;
System.out.println(f);
}
System.out.println("number of digits in a number is " + " " + i);
}
}
