import java.util.*;
public class ExpandAlphabets{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        char[] ch = input.toCharArray();
        int n=ch.length,num,l;
        String st ="";
        for(int i=0;i<n;i++)
        {
           if(ch[i]>='a' && ch[i]<'z'){
            st+=ch[i];
           }
           else{
            num=Character.getNumericValue(ch[i]);
            l=st.length();
            char[] c = st.toCharArray();
            st="";
            for(int k=0;k<l;k++)
            {
                for(int j=0;j<num;j++)
                {
                    st+=c[k];
                }
            }
            System.out.print(st);
            st="";
        }

        }
    }
}