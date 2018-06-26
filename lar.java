import java.io.*;
import java.util.*;
public class lar
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a1[]=new int[n];
for(int i=0;i<n;i++)
{
a1[i]=sc.nextInt();
}
Arrays.sort(a1);
System.out.println(a1[n-k]);
}
}
