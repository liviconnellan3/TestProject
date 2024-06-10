/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricproject;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Event {
    private int eventid;
    private String sport;
    private LocalDate date;
    private String teamA, teamB;
    private double oddsA,oddsB;
    private String winner;

    public Event(int eventid, String sport, LocalDate date, String teamA, String teamB, double oddsA, double oddsB, String winner) {
        this.eventid = eventid;
        this.sport = sport;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.oddsA = oddsA;
        this.oddsB = oddsB;
        this.winner = winner;
    }

   
    public Event(int eventid, String sport, LocalDate date, String teamA, String teamB) {
        this.eventid = eventid;
        this.sport = sport;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Event(String sport, LocalDate date, String teamA, String teamB) {
        this.sport = sport;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public int getEventid() {
        return eventid;
    }

    public String getSport() {
        return sport;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public String getWinner() {
        return winner;
    }

    public void setOddsA(double oddsA) {
        
        this.oddsA = oddsA;
    }

    public void setOddsB(double oddsB) {
        this.oddsB = oddsB;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Event{" + "eventid=" + eventid + ", sport=" + sport + ", date=" + date + ", teamA=" + teamA + ", teamB=" + teamB + ", oddsA=" + oddsA + ", oddsB=" + oddsB + ", winner=" + winner + '}' + "\n";
    }

    
    
    
}
