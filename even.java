import java.io.*;
import java.util.*;
class even
{
public static void main(String a1[])
{
int a,c;
Scanner b=new Scanner(System.in);
System.out.println("Enter the first number");
a=b.nextInt();
System.out.println("Enter the second number");
c=b.nextInt();
System.out.println("THE EVEN NUMBERS BETWEEN THE INTERVALS ARE :");
for(int i=a+1;i<c;i++)
{
if((i%2)==0)
{
System.out.println(i);
}
}
}
}
