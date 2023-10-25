import java.util.Objects;

public class SoccerTeam extends SportsTeam {
    private int offsidesCount;

    public SoccerTeam(String teamName, int teamSize, String coach, int count) {
        super(teamName, teamSize, coach);
        this.offsidesCount = count;
    }

    public String cheer() {
        return super.cheer() + " You have only been offsides " + offsidesCount + " times!";
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(offsidesCount,((SoccerTeam)o).offsidesCount);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = hash * 7 +offsidesCount;
        return hash;
    }
    public static void main(String[] args) {
        Team team = new SoccerTeam("a", 5, "zuko", 0);
        Team team2 = new SoccerTeam("b", 5, "zuko", 0);
        System.out.println(team);
        System.out.println(team.cheer());
    }
}
