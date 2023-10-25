import java.util.Objects;

public class SoccerTeam extends SportsTeam {
    private int offsidesCount;

    public SoccerTeam(String teamName, int teamSize, String coach, int count) {


    }


    public static void main(String[] args) {
        Team team = new SoccerTeam("a", 5, "zuko", 0);
        Team team2 = new SoccerTeam("b", 5, "zuko", 0);
        System.out.println(team);
        System.out.println(team.cheer());
    }
}
