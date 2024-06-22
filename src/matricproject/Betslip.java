/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricproject;

/**
 *
 * @author User
 */
public class Betslip {
    private int betid;
    private int eventid;
    private int userid;
    private String chosenteam;
    private double amount, returnmount;
    private Boolean won;

    public Betslip(int betid, int eventid, int userid, String chosenteam, double amount, double returnmount, Boolean won) {
        this.betid = betid;
        this.eventid = eventid;
        this.userid = userid;
        this.chosenteam = chosenteam;
        this.amount = amount;
        this.returnmount = returnmount;
        this.won = won;
    }

    

    public Betslip(int eventid, int userid, String chosenteam, double amount) {
        this.eventid = eventid;
        this.userid = userid;
        this.chosenteam = chosenteam;
        this.amount = amount;
    }

    public int getBetid() {
        return betid;
    }

    public int getEventid() {
        return eventid;
    }

    public int getUserid() {
        return userid;
    }

    public String getChosenteam() {
        return chosenteam;
    }

    public double getAmount() {
        return amount;
    }

    public double getReturnmount() {
        return returnmount;
    }

   

    public void setBetid(int betid) {
        this.betid = betid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setChosenteam(String chosenteam) {
        this.chosenteam = chosenteam;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setReturnmount(double returnmount) {
        this.returnmount = returnmount;
    }

    public Boolean isWon() {
        return won;
    }

    public void setWon(Boolean won) {
        this.won = won;
    }

    @Override
    public String toString() {
        return "Betslip{" + "betid=" + betid + ", eventid=" + eventid + ", userid=" + userid + ", chosenteam=" + chosenteam + ", amount=" + amount + ", returnmount=" + returnmount + ", won=" + won + '}'+"\n";
    }

    

    
    
            
    
}
