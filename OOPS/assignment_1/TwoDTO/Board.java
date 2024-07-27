package OOPS.assignment_1.TwoDTO;

import java.util.List;

public class Board {
    public static void main(String[] args) {
        Team chennai = new Team("CSK","Chennai","none");
        Player dhoni = new Player("dhoni","wicket keeper",7);
        Player jadeja = new Player("jadeja","batsman",20);

        Player kohli = new Player("Kohli","batsman",18);
        Player sharma = new Player("sharma","all",201);
        Team bengaluru = new Team("RCB","Bengaluru","none", kohli,sharma);

        chennai.playGame(chennai);
    }



}
