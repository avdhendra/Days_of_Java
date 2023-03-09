package Day3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DataStuct2 {
    public static void main(String[] args) {
        LinkedList<String>placeToVisited=new LinkedList<String>();
        placeToVisited.add("Sydney");
        placeToVisited.add("Gwalior");
        placeToVisited.remove(0);
        printList(placeToVisited);
    }
    private static void printList(LinkedList<String>linkedlist){
        Iterator<String> it=linkedlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    private static boolean addInOrder(LinkedList<String> linkedlist,String newCity){
        ListIterator<String>stringListIterator=linkedlist.listIterator();
        while(stringListIterator.hasNext()){
           int comparision=stringListIterator.next().compareTo(newCity);
           if(comparision==0){
               return false;
           }else if(comparision>0){
stringListIterator.previous();
stringListIterator.add(newCity);
return true;
           }else if(comparision<0){

           }
          
        }
        stringListIterator.add(newCity);
        return true;
    }
}
//linkedList.hasPrevious()