import java.util.*;
public class CommonPartInString {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=sc.next();
String s2="";
for(int i=0;i<s.length();i++)
{
s2=s.substring(i,s.length());
if(s1.startsWith(s2))
System.out.print(s2);
}
}

}