/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricproject;

/**
 *
 * @author User
 */
public class HouseEvent {
    private int houseeventsid;
    private String sport;
    private String house;
    private double wins,losses,draws;

    public HouseEvent() {
    }

    
    public HouseEvent(int houseeventsid, String sport, String house, double wins, double losses, double draws) {
        this.houseeventsid = houseeventsid;
        this.sport = sport;
        this.house = house;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public HouseEvent(String sport, String house, double wins, double losses, double draws) {
        this.sport = sport;
        this.house = house;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public HouseEvent(String sport, String house) {
        this.sport = sport;
        this.house = house;
    }

    
    public int getHouseeventsid() {
        return houseeventsid;
    }

    public String getSport() {
        return sport;
    }

    public String getHouse() {
        return house;
    }

    public double getWins() {
        return wins;
    }

    public double getLosses() {
        return losses;
    }

    public double getDraws() {
        return draws;
    }

    public void setHouseeventsid(int houseeventsid) {
        this.houseeventsid = houseeventsid;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setWins(double wins) {
        this.wins = wins;
    }

    public void setLosses(double losses) {
        this.losses = losses;
    }

    public void setDraws(double draws) {
        this.draws = draws;
    }

    @Override
    public String toString() {
        return "houseEvent{" + "houseeventsid=" + houseeventsid + ", sport=" + sport + ", house=" + house + ", wins=" + wins + ", losses=" + losses + ", draws=" + draws + '}' + "\n";
    }
    
    
}
