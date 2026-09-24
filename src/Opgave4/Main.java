package Opgave4;

public class Main {

    public static void main() {
        Team teamOne = new Team("Liverpool");
        Team teamTwo = new Team("Brøndby");

        teamOne.addPlayer(new Player("Wirz", 90));
        teamOne.addPlayer(new Player("Van Dijk", 98));

        teamTwo.addPlayer(new Player("Ejdum", 50));
        teamTwo.addPlayer(new Player("Frøkjær", 40));

        teamOne.printTeam();
        teamTwo.printTeam();

        teamOne.compete(teamTwo);


    }

}
