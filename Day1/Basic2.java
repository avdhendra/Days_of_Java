import java.util.Scanner;

public class Basic2 {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        /*Challenge:
         * Create a program using arrays that sorts a list of integers in descending order
         * Descending Order is highest value of lowest
         * In other word if the array had the values in it 106 26 81 5 15
         * your program should 
         * ulitmaleyhave an array with 106 81 26 15 5 in it
         * set Up the program so that the number to sort are read in form the keyboard
         * Implement the following methods getIntegers print array and sortIntegeres
         * getIntegers returns an array of entered integers from keyboard
         * print Array prints out the content of the array
         * and sortIntegers should sort the array and return a new array containing the sorted number
         * you will have to figure out how to copy the array elements from the passed array into a new array
         * array and sort them and return the new sorted array
         * 
         */
int[] myIntegers=getIntegers(5);

    }
    public static int[] getIntegers(int capacity){
        int[] array=new int[capacity];
        System.out.println("Enter "+ capacity+"integer values");
        for(int i=0;i<capacity;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
System.out.println("Element "+i+" content"+array[i]);

        }
    }

    public static int[] sortIntegers(int[] array){
        int [] sortedArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i]=array[i];
        }
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
