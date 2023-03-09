import java.util.Arrays;

public class Basic4 {
    //what string args mean
    public static void main(String[] args) {
        System.out.println("Program was given");
        if(args.length>0){
            System.out.println(Arrays.toString(args));
            System.out.println(Arrays.toString(args));

        }
        else{
            System.out.println("O args");
        }
    }
}
//pass the arguments to the program