package sn.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teamId;

    @Column
    private String name;

    @Column
    private int ranking;

    @Column
    private String city;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team(String name, String city,int ranking, ArrayList<Player> players) {
        this.name = name;
        this.city = city;
        this.ranking = ranking;
        this.players = players;
    }

    public Team() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRanking() { return ranking; }
    public void setRanking(int ranking) { this.ranking = ranking; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public long getTeamId() { return teamId; }
    public void setTeamId(long teamId) { this.teamId = teamId; }

    public List<Player> getPlayers() { return players; }

    public void addPlayer(Player player) {
        if (players == null) {
            players = new ArrayList<Player>();
        }
        players.add(player);
        player.setTeam(this);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                ", ranking=" + ranking +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}
