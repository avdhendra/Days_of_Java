package Day2;

public class Car {
    // private int doors;
    // private int wheels;
    // private String model;
    // private String engine;
    // private String color;
    // public void setModel(String model) {
    //     this.model=model;
    // }

public static void main(String[] args) {
    InnerClass mcLaren=new InnerClass(6);
    InnerClass.Gear first=mcLaren.new Gear(1,12.3);
    System.out.println(first.driveSpeed(100));

}

    
}
