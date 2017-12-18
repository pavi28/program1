import java.io.*;
import java.util.*;
class large
{
public static void main(String a[])
{
int a1,b1,c1;
Scanner b=new Scanner(System.in);
System.out.println("Enter the numbers");
a1=b.nextInt();
b1=b.nextInt();
c1=b.nextInt();
if((a1>b1)&&(a1>c1))
{
System.out.println("Largest number is" +" "+a1);
}
else if((b1>a1)&&(b1>c1))
{
System.out.println("Largest number is" +" "+b1);
}
else
{
System.out.println("Largest number is" +" "+c1);
}
}
}

