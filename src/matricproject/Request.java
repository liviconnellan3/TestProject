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
public class Request {
    private int requestid;
    private int userid;
    private double amount;
    private LocalDate daterequested;

    public Request(int requestid, int userid, double amount, LocalDate daterequested) {
        this.requestid = requestid;
        this.userid = userid;
        this.amount = amount;
        this.daterequested = daterequested;
    }

    public Request(int userid, double amount, LocalDate daterequested) {
        this.userid = userid;
        this.amount = amount;
        this.daterequested = daterequested;
    }

    public int getRequestid() {
        return requestid;
    }

    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDaterequested() {
        return daterequested;
    }

    public void setDaterequested(LocalDate daterequested) {
        this.daterequested = daterequested;
    }

    @Override
    public String toString() {
        return "Request{" + "requestid=" + requestid + ", userid=" + userid + ", amount=" + amount + ", daterequested=" + daterequested + '}' + "\n";
    }
    
    
}
