public class Basic5 {
    public static void main(String[] args) {
        //type interference with var keyword
        //Automatic detect the data type
        //var is used in local variable declaration
       final var name="Jamila";
        var names=new String[]{"Jamila","Alex"};
        for(String k:names){
            if(k.startsWith("A")){
                continue;
            }
            System.out.println(k);
        }
        System.out.println("end of main method");

    }
}
