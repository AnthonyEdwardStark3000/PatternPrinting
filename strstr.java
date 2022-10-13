import java.util.*;
public class strstr{
    public static void main(String[] args){
        String str1 = "GeeksForGeeks";
        String str2 = "For";
        int res = check(str1, str2);
        if(res==-1){
        System.out.println("String"+str2+" is not found in the string"+str1);
        }
        else{
        System.out.println("String "+str2+" is found in the string"+str1+" from index :"+res);
        }
    }
    static int check(String s1, String s2){
        int index = -1;
        int l;
        int flag =0;
        for(int i=0;i<s1.length();i++){
            l=i;
            if(s1.charAt(i)==(s2.charAt(0))){
                for(int j=0;j<s2.length();j++){
                    if(s2.charAt(j)==s1.charAt(l)){
                        l++;
                        flag = 1;
                    }
                    else{
                        flag =0;
                        break;
                    }
                }
                if(flag==1){
                    index = i;
                    return index;
                }
            }
        }
        return index;
    }
}