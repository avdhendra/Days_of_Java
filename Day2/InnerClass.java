package Day2;

import java.util.ArrayList;

public class InnerClass {
    private ArrayList<Gear>gears;
    private int maxGears;
   
    public InnerClass(int maxGears){
        this.maxGears=maxGears;
        gears=new ArrayList<Gear>();
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);
    }
    public class Gear{
        private int gearNumber;
        private double ratio;
        public Gear(int gearNumber,double ratio){
            this.gearNumber=gearNumber;
            this.ratio=ratio;
        }
        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
