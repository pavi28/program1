import java.io.*;
import java.util.*;
public class pg3
{
public static void main(String a[])
{
char c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
c=sc.next().charAt(0);;
if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U')
{
System.out.println("The letter entered is an vowel");
}
else
{
System.out.println("The letter entered is an consonant");
}
}
}
