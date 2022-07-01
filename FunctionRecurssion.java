import java.util.*;
import java.io.*;
public class FunctionRecurssion {
  static int first_upper(String s,int first){
  if(first >= s.length())          //base condition
    return -1;
  if (Character.isUpperCase(s.charAt(first)))  
      return first;
  else
    return first_upper(s,first+1);
  }
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n!=0){
      String s = sc.next();
      int first = 0;
      System.out.println(first_upper(s,first));
      n--;
    }
  }
}