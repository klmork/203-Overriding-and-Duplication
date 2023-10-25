import java.util.Objects;

public abstract class SportsTeam extends Team {
    private String headCoach;
    public SportsTeam(String name, int teamSize, String headCoach) {
        super(name, teamSize);
        this.headCoach = headCoach;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(headCoach,((SportsTeam)o).headCoach);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = hash * 7 + headCoach.hashCode();
        return hash;
    }

    public String cheer() {
        return super.cheer() + " Go " + headCoach + "!";
    }
}
