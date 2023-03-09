package Day2;

import java.util.ArrayList;

public class Generics {
    public static void main(String[]args){
        ArrayList <Integer>items=new ArrayList<Integer>();
        items.add(1);
        items.add(2);

    }
    private static void printDoubled(ArrayList<Integer>n){
        for(Object i:n){
            System.out.print((Integer)i*2);
        }
    }
}
