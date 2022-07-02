import java.util.*;
public class CommonCharacters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter string 1:");
        String s1 = sc.nextLine();
        System.out.println("\nEnter string 2:");
        String s2 = sc.nextLine();
        Set<Character> resultSet = new HashSet<Character>();
        Set<Character> resultSet2 = new HashSet<Character>();
        String final1="";
        String final2="";
        String temp;
        int count=0;

        for(int i=0;i<s1.length();i++)
        {
            resultSet.add(new Character(s1.charAt(i)));
        }
        for(int i=0;i<s2.length();i++)
        {
            resultSet2.add(new Character(s2.charAt(i)));
        }
        for(Character c: resultSet){
            final1+=c;
        }
        for(Character c: resultSet2){
            final2+=c;
        }
        if(final2.length() > final1.length()){
            temp = final2;
            final2 = final1;
            final1 = temp;
        }
        for(int i=0;i<final1.length();i++){
            for(int j=0;j<final2.length();j++){
                if(final1.charAt(i)==final2.charAt(j)){
                    // System.out.print(final1.charAt(i));
                    ++count;
                }
            }
        }
        System.out.println(count);
        // System.out.println(final2);
    }
}