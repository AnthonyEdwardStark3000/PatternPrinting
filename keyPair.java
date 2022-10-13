import java.util.HashMap;
public class keyPair {
	public static void main(String[] args)
	{
        int[] numbers = {1,3,4,3};
        int output = 6;
        boolean result = false;
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }
            else{
                map.put(numbers[i],1);
            }
        }
        int difference;
        for(int i=0;i<numbers.length;i++){
            difference = output - numbers[i];
            if(difference == numbers[i]){
                if(map.get(numbers[i])>1){
                    result = true;
                    break;
                }
            }
            else{
                if(map.get(numbers[i]) >0){
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
	}
}
