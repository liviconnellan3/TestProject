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
public class User {
    private int userid;
     private String username;
     private String surname;
     private String kcemail;
     private String password;
     private boolean isfemale;
     private LocalDate dob;
     private int grade;
     private String house;
     private double balance;
     private boolean isadmin;

    public User(int userid, String username, String surname, String kcemail, String password, boolean isfemale, LocalDate dob, int grade, String house, double balance, boolean isadmin) {
        this.userid = userid;
        this.username = username;
        this.surname = surname;
        this.kcemail = kcemail;
        this.password = password;
        this.isfemale = isfemale;
        this.dob = dob;
        this.grade = grade;
        this.house = house;
        this.balance = balance;
        this.isadmin = isadmin;
    }

  
  
//constructor without userID - only for inserting new users

    public User(String username, String surname, String kcemail, String password, boolean isfemale, LocalDate dob, int grade, String house, double balance, boolean isadmin) {
        this.username = username;
        this.surname = surname;
        this.kcemail = kcemail;
        this.password = password;
        this.isfemale = isfemale;
        this.dob = dob;
        this.grade = grade;
        this.house = house;
        this.balance = balance;
        this.isadmin = isadmin;
    }
    

   

    public int getUserid() {
        return userid;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }

    public String getKcemail() {
        return kcemail;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIsfemale() {
        return isfemale;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getGrade() {
        return grade;
    }

    public String getHouse() {
        return house;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    @Override
    public String toString() {
        return "User{" + "userid=" + userid + ", username=" + username + ", surname=" + surname + ", kcemail=" + kcemail + ", password=" + password + ", isfemale=" + isfemale + ", dob=" + dob + ", grade=" + grade + ", house=" + house + ", balance=" + balance + ", isadmin=" + isadmin + '}';
    }

   
   
    
}
