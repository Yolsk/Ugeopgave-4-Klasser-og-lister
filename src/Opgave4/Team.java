package Opgave4;

import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }
    void addPlayer(Player p) {
        players.add(p);
    }
    double getAverageSkill() {
        int total = 0;
        for (Player p : players) {
            total = total + p.skillLevel;
        }
        return (double) total / players.size();
    }
    void printTeam() {
        System.out.println("Team name: " + teamName);

        for(Player p : players) {
            System.out.println(p);
        }
    }
    void compete(Team opponent) {
        System.out.println(teamName + " VS " + opponent.teamName);

        if(getAverageSkill() > opponent.getAverageSkill()) {
            System.out.println(teamName + " Wins ");
        } else if (getAverageSkill() < opponent.getAverageSkill()) {
            System.out.println(opponent.teamName + "Wins");
        } else {
            System.out.println("Draw");
        }
    }
}


