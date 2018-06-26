import java.io.*;
import java.util.*;
public class fact1
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int h=sc.nextInt();
int fact=1;
for(int i=1;i<=h;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
