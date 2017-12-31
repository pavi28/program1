import java.io.*;
import java.util.*;
class sum1
{
public static void main(String a1[])
{
int a,c=0;
int b[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the array value");
a=s.nextInt();
System.out.println("Enter the" +" " + a + " " + "numbers");
for(int i=0;i<a;i++)
b[i]=s.nextInt();
System.out.println("Enter the number of digits to be added");
int d=s.nextInt();
for(int j=0;j<d;j++)
c=c+b[j];
System.out.println("The sum is" + " " + c);
}
}
