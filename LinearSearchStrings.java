public class LinearSearchStrings {
    public static void main(String[] args)
    {
        String name ="Mr.Stark";
        char c = 'u';
        System.out.print("The character "+c+" in name "+name+" is "+search(name,c));
    }
    static boolean search(String str, char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    } 
}
