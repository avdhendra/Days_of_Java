package Day2;

import java.util.ArrayList;

//extend when you have strict T type like player or something other
//other wise Team<T>
public class Team <T extends Player> {
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;
    private ArrayList<T>member=new ArrayList<>();
    public Team(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public boolean addPlayer(T player){
if(member.contains(player)){
    System.out.println(((Player)player).getName()+"is already on the team");
    return false;
}else{
    member.add(player);
    System.out.println(((Player)(player)).getName()+ "picked for team"+this.name);
    return true;
}
    }


    public int numPlayers(){
        return this.member.size();
    }
    public void matchResult(Team opponent,int ourScore,int theirScore){
        if(ourScore>theirScore){
            won++;
        }else if(ourScore==theirScore){
    tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent!=null){
            opponent.matchResult(null, theirScore, ourScore);
        }
}
public int ranking(){
    return (won*2)+tied;
}
}