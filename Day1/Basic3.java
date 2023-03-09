import java.util.Arrays;

public class Basic3 {
    
    public static void main(String[] args){
        //Value type
        int myIntValue=10;
        int anotherIntValue=myIntValue;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("AnotherIntValue: " + anotherIntValue);
        anotherIntValue++;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);
        
        //reference type
        int [] myIntArray=new int[5];
        int [] anotherIntArray=myIntArray;
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));
        anotherIntArray[0]=100;
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
System.out.println("AnotherIntArray: " + Arrays.toString(anotherIntArray));        

    }
}
