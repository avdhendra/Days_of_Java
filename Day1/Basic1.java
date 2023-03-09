import java.util.Scanner;

//Array
public class Basic1 {
    private static Scanner scanner=new Scanner(System.in);
    
    public static void main(String[] args){
        int[]myIntegers=getIntegers(5);
        for(int i:myIntegers){
            System.out.println(i);
        }
    }
    public static int[]getIntegers(int num){
        System.out.println("enter"+num+"integers value");
        int[]values=new int[num];
        for(int i=0;i<num;i++){
            values[i]=scanner.nextInt();
        }
        return values;

    }
    public static double getAverage(int[]arr){
        int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
      }
      return (double)sum/(double)arr.length;
    }
}
