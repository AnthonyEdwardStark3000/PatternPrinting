import java.util.*;
class product{
    int code,price;
    String name;
    product(int code,int price,String name){
        this.code = code;
        this.price = price;
        this.name = name;
    }
    public String toString(){
        return code+"\t"+price+"\t"+name;
    }
}
public class ArrayListDemo{
    public static void main(String[] args){
        System.out.println("The outputs of the Array list will be:\n");
        ArrayList<product> names = new ArrayList<product>();
        names.add(new product(1,100,"check"));
        names.add(new product(2,120,"check1"));
        names.add(new product(3,130,"check2"));
        Iterator<product>itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}