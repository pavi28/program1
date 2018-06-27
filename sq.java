import java.io.*;
import java.util.*;
public class sq
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int h=0;
int cal=0;
while(n>0)
{
h=n%10;
cal=cal+(h*h);
n=n/10;
}
System.out.println(cal);
}
}
