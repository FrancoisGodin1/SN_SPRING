package sn.domain;

import javax.persistence.*;


@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long playerId;

    @Column
    private String lastName;

    @Column
    private String birthDate;

    @Column
    private int number;

    @ManyToOne()
    @JoinColumn(name = "teamId")
    private Team team;

    public Player(String lastName, String birthDate, int number) {
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.number = number;
    }

    public Player() { }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public long getPlayerId() { return playerId; }
    public void setPlayerId(long playerId) { this.playerId = playerId; }

    public Team getTeam() { return team; }
    public void setTeam(Team team) { this.team = team; }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", number=" + number +
                ", team=" + team.getTeamId() +
                '}';
    }
}
