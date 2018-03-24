import java.io.*;
import java.util.*;
class pg21
{
public static void main(String a1[])
{
int a[]=new int[20];
int n,c,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
n=sc.nextInt();
System.out.println("Enter the numbers");
for(i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<=n;i++)
{
if(a[i]>a[i+1])
a[i+1]=a[i];
else
a[i]=a[i];
}
System.out.println("The largest number is");
System.out.println(a[i]);
}
}
