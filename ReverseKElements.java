import java.util.*;
public class ReverseKElements{
    public static void main(String[] args){
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        queue1.add(50);
        queue1.add(60);
        queue1.add(70);
        Queue<Integer> finalOutput = new LinkedList<>();
        Stack<Integer> temp = new Stack<>();
        int k=3;
        System.out.println("Original Queue :"+queue1);
        for(int i=0;i<k;i++){
\            temp.push(queue1.peek());
            queue1.remove();
        }
        while(!temp.empty()){
             finalOutput.add(temp.peek());
            temp.pop();
        }
        while(!queue1.isEmpty()){
            finalOutput.add(queue1.peek());
            queue1.remove();
        }
        System.out.println("Answer is :"+finalOutput);
    }
}