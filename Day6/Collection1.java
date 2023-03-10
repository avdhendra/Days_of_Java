package Day6;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    private final String theatreName;
    private List<Seat>seats=new ArrayList<Seat>();
    public Collection1(String theatreName,int numRows,int seatPerRow){
        this.theatreName=theatreName;
        int lastRow='A'+(numRows-1);
        for(char row='A'; row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatPerRow;seatNum++){
                Seat seat= new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }
    public boolean reserveSeat(String seatNumber){
        Seat requestSeat=null;
        for(Seat seat:seats){
             if(seat.getSeatNumber().equals(seatNumber)){
            requestSeat=seat;
            break; 
            }

        }
        if(requestSeat==null){
            System.out.println("There is no Seat"+seatNumber);
            return false;
        }
        return requestSeat.reserve();
    }
    public void getSeats(){
        for(Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
    }

private class Seat{
    private final String seatNumber;
    private  boolean reserved=false;
    public Seat(String seatNUmber){
        this.seatNumber=seatNUmber;
    }
    public boolean reserve(){
        if(!this.reserved){
            this.reserved=true;
            System.out.println("Seat"+seatNumber+"reserved");
            return true;
        }else{
            return false;
        }
    }
    public boolean Cancel(){
        if(this.reserved){
            this.reserved=false;
            System.out.println("Reservation of seat"+seatNumber+"cancelled");
            return true;
        }else{
            return false;
        }
    }
    public String getSeatNumber(){
        return seatNumber;
    }
}


}
