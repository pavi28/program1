import java.io.*;

import java.util.*;

class pg22{

public static void main(String a[])

{

int b,c;

Scanner sc=new Scanner(System.in);


System.out.println("Enter the Numbers");
 b=sc.nextInt();

c=sc.nextInt();

System.out.println("Before Swapping");
System.out.println(b);

System.out.println(c);

b=b^c;

c=b^c;
b=b^c;

System.out.println("After Swapping");
System.out.println(b);
System.out.println(c);



}

}
