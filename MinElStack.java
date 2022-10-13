import java.util.*;
public class MinElStack{
    public static Stack<Integer> mainStack = new Stack<>();
    public static Stack<Integer> minStack = new Stack<>();

    public static void push(int num){
        if(mainStack.size()==0){
            mainStack.push(num);
            minStack.push(num);
        }
        else{
            if(num <= minStack.peek()){
                minStack.push(num);
            }
            mainStack.push(num);
        }
        System.out.println("Pushed element :"+num);
    }
    public static int pop(){
        int l;
        if(mainStack.size()==0){
            l=-1;
        }
        else{
            if(minStack.peek()==mainStack.peek()){
                minStack.pop();
            }
            l = mainStack.peek();
            mainStack.pop();
        }
        System.out.println("Popped element"+l);
        return l;
    }
    public static int minEl(){
        int l;
       if(mainStack.size()==0){
        l=-1;
       }
       else{
        l=minStack.peek(); 
       }
       return l;
    }
    public static void main(String[] args){
        push(2);
        push(3);
        pop();
        System.out.println( "Minimum Element is:"+minEl());
        push(1);
        System.out.println( "Minimum Element is:"+minEl());
    }
}