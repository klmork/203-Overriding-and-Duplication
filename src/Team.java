import java.util.Objects;

public abstract class Team {
    private String name;
    private int teamSize;

    public Team(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }

    public String cheer() {
        return "Go " + name + "!";
    }
    public String toString() {
        return "Team " + name;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return teamSize == team.teamSize && Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 7 + name.hashCode();
        hash = hash * 7 + teamSize;
        return hash;
    }
}