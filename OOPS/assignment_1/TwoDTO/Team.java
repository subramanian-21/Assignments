package OOPS.assignment_1.TwoDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
    private String name;
    private String city;
    private String division;
    private List<Player> players;
    Team(String name,String city, String division, Player... players){
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
        this.players.addAll(Arrays.asList(players));
    }
    Team(String name,String city, String division){
        this.name = name;
        this.city = city;
        this.division = division;
    }

    public void addPlayer(Player... player){
        if(players == null){
            players = new ArrayList<>();
        }
        players.addAll(Arrays.asList(player));
    }
    public void playGame(Team a){
        if(a == this){
            System.out.println("Invalid game");
            return;
        }
        System.out.println(name +" is playing with "+ a.name);
    }
    public void hireCoach(Player player){
        System.out.println(player+" is "+ name +" team's coach now");
    }
}
