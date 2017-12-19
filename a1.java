import java.io.*;
import java.util.*;
public class a1
{
public static void main(String c[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
if (a>0)
{
System.out.println("The entered number is positive");
}
else if(a==0)
{
System.out.println("The entered number is zero"); 
}
else
{
System.out.println("The entered number is negative");
}
}
}
