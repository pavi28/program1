import java.io.*;
import java.util.*;
public class numrev
{
public static void mian(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a1=0;
while(n>0)
{
a1=n%10;
System.out.print(a1);
n=n/10;
}
}
}
