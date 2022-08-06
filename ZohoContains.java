public class ZohoContains{
    public static void main(String[] args)
    {
        int[] starting = new int[10];
        String s1 = "testing12";
        String s2 = "1234";
        int i =0;
        if(s1.contains(s2)){
            for(int row=0;row<s1.length();row++){
                for(int col=0;col<s2.length();col++){
                if(s1.charAt(row)==s2.charAt(col)){
                    starting[i] = row;
                    i++;
                }
                }
            }
                    System.out.print(starting[0]);
        }
        else
        {
            System.out.print("-1");
        }
    }
}