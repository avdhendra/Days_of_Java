package Day3;

import java.util.ArrayList;

public class DataStruct1 {
    public static void main(String[] args){
       //ArrayList
    ArrayList<String> groceryList=new ArrayList<String>();
    groceryList.add("apple");
       printList(groceryList);
    }
    public static void printList(ArrayList<String>GRC){
       
        for(int i=0;i<GRC.size();i++){
System.out.println((i+1)+". "+GRC.get(i));
        }
    }
    public void modifyGRC(int position,String newItem,ArrayList<String>GRC){
        GRC.set(position,newItem);
        System.out.println("GRocerry item"+(position+1)+"has been modified");


    }
    public void removeGroceryItem(int position,ArrayList<String>GRC){
        String theItem=GRC.get(position);
GRC.remove(position);
    }
    public String findItem(String search,ArrayList<String>GRC){
        boolean exists=GRC.contains(search);
        int position=GRC.indexOf(search);
        if(position>=0){
            return GRC.get(position);
        }
        return null;
    }
}
