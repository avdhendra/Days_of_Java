package Day2;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer boki=new BaseballPlayer("Pat");
    
        Team<FootballPlayer> Manchester =new Team("Messi");

   // Manchester.addPlayer(boki);
    Manchester.addPlayer(joe);
    
    }
}
