import java.util.*;
class Products{
    int code,price;
    String name;
    Products(int code, int price, String name){
        this.code = code;
        this.price = price;
        this.name = name;
    }
    public String toString(){
        return code+'\t'+price+'\t'+name;
    }
}
public class HashTableExample {
    public static void main(String[] args){
        Hashtable<Integer,product> students= new Hashtable <Integer,product>();
        students.put(1, new product(1, 200, "nut"));
        students.put(2, new product(1, 200, "nutz"));
        students.put(1, new product(2, 200, "nuts"));
        for(int x:students.keySet()){
            System.out.println(students.get(x));
        }
    }
}
