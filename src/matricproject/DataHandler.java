/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricproject;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DataHandler {

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblusers;";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int userid = Integer.parseInt(rs.getString("userid"));
                String username = rs.getString("username");
                String surname = rs.getString("surname");
                String kcemail = rs.getString("kcemail");
                String password = rs.getString("password");
                boolean isfemale = rs.getBoolean("isfemale");
                LocalDate dob = rs.getDate("dob").toLocalDate();
                int grade = rs.getInt("grade");
                String house = rs.getString("house");
                double balance = rs.getDouble("balance");
                boolean isadmin = rs.getBoolean("isadmin");

                User u = new User(userid, username, surname, kcemail, password, isfemale, dob, grade, house, balance, isadmin);
                users.add(u);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "data handler class error!!!");
        }
        return users;
    }

    public ArrayList<Event> getAllEvents() {
        ArrayList<Event> events = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblevents;";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int eventid = Integer.parseInt(rs.getString("eventid"));
                String sport = rs.getString("sport");
                LocalDate date = rs.getDate("date").toLocalDate();
                String teamA = rs.getString("teamA");
                String teamB = rs.getString("teamB");

                Event e = new Event(eventid, sport, date, teamA, teamB);
                events.add(e);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "data handler class error!!!");
        }
        return events;
    }

    public ArrayList<HouseEvent> getAllHouseEvents() {
        ArrayList<HouseEvent> houseEvents = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblhouseevents;";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int houseeventsid = Integer.parseInt(rs.getString("houseeventsid"));
                String sport = rs.getString("sport");

                String house = rs.getString("house");
                int wins = rs.getInt("wins");
                int losses = rs.getInt("losses");
                int draws = rs.getInt("draws");

                HouseEvent e = new HouseEvent(houseeventsid, sport, house, wins, losses, draws);
                houseEvents.add(e);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "data handler class error!!!");
        }
        return houseEvents;
    }

    public double calculatingOddsA(Event inE) {

        double winsA = 0;
        double lossesA = 0;
        double drawsA = 0;

        double winsB = 0;
        double lossesB = 0;
        double drawsB = 0;
        try {
            String sql = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamA() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);
            while (rs.next()) {
                winsA = rs.getDouble("wins");
                lossesA = rs.getDouble("losses");
                drawsA = rs.getDouble("draws");

            }

            String sql1 = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamB() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect connn = new Connect();

            ResultSet rss = connn.query(sql1);
            while (rss.next()) {
                winsB = rss.getDouble("wins");
                lossesB = rss.getDouble("losses");
                drawsB = rss.getDouble("draws");

            }

        } catch (Exception er) {
            System.err.println(er);
        }
        double a = (winsA / (winsA + lossesA + drawsA)) * 100;
        double b = (winsB / (winsB + lossesB + drawsB)) * 100;
        double total = a + b;

        double oddsA = 1 / (a / total);
        oddsA = Math.round(oddsA * 10.0) / 10.0;
        double oddsB = 1 / (b / total);
        oddsB = Math.round(oddsB * 10.0) / 10.0;

        return oddsA;
    }

    public double calculatingOddsB(Event inE) {

        double winsA = 0;
        double lossesA = 0;
        double drawsA = 0;

        double winsB = 0;
        double lossesB = 0;
        double drawsB = 0;
        try {
            String sql = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamA() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);
            while (rs.next()) {
                winsA = rs.getDouble("wins");
                lossesA = rs.getDouble("losses");
                drawsA = rs.getDouble("draws");

            }

            String sql1 = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamB() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect connn = new Connect();

            ResultSet rss = connn.query(sql1);
            while (rss.next()) {
                winsB = rss.getDouble("wins");
                lossesB = rss.getDouble("losses");
                drawsB = rss.getDouble("draws");

            }

        } catch (Exception er) {
            System.err.println(er);
        }
        double a = (winsA / (winsA + lossesA + drawsA)) * 100;
        double b = (winsB / (winsB + lossesB + drawsB)) * 100;
        double total = a + b;

        double oddsA = 1 / (a / total);
        oddsA = Math.round(oddsA * 10.0) / 10.0;
        double oddsB = 1 / (b / total);
        oddsB = Math.round(oddsB * 10.0) / 10.0;
        return oddsB;
    }

    public void setOdds(Event inE) {

        double winsA = 0;
        double lossesA = 0;
        double drawsA = 0;

        double winsB = 0;
        double lossesB = 0;
        double drawsB = 0;
        try {
            String sql = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamA() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);
            while (rs.next()) {
                winsA = rs.getDouble("wins");
                lossesA = rs.getDouble("losses");
                drawsA = rs.getDouble("draws");

            }

            String sql1 = "SELECT wins, losses, draws FROM tblhouseevents WHERE house = \"" + inE.getTeamB() + "\" AND sport = \"" + inE.getSport() + "\";";
            Connect connn = new Connect();

            ResultSet rss = connn.query(sql1);
            while (rss.next()) {
                winsB = rss.getDouble("wins");
                lossesB = rss.getDouble("losses");
                drawsB = rss.getDouble("draws");

            }

        } catch (Exception er) {
            System.err.println(er);
        }
        double a = (winsA / (winsA + lossesA + drawsA)) * 100;
        double b = (winsB / (winsB + lossesB + drawsB)) * 100;
        double total = a + b;

        double oddsA = 1 / (a / total);
        oddsA = Math.round(oddsA * 10.0) / 10.0;
        double oddsB = 1 / (b / total);
        oddsB = Math.round(oddsB * 10.0) / 10.0;

        inE.setOddsA(oddsA);
        inE.setOddsB(oddsB);
    }


//vid 2 11:50 to get comments
    public int insertNewUser(User u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "INSERT INTO usersdb.tblusers(username, surname, kcemail, password, isfemale, dob, grade, house, balance, isadmin) VALUES(\""
                    + u.getUsername() + "\",\""
                    + u.getSurname() + "\",\""
                    + u.getKcemail() + "\",\""
                    + u.getPassword() + "\","
                    + u.isIsfemale() + ",\""
                    + u.getDob() + "\","
                    + u.getGrade() + ",\""
                    + u.getHouse() + "\",\""
                    + 100 + "\","
                    + u.isIsadmin() + ");";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "insert user !!!!");
        }
        return numRows;
    }

    public int deleteUser(User u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "DELETE FROM tblusers WHERE userid = " + u.getUserid() + ";";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "insert user !!!!");
        }
        return numRows;
    }

    //fix code video 2 20:00
    public int updateUser(User u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE tblusers SET username = \""
                    + u.getUsername() + "\",\""
                    + u.getSurname() + "\", surname = \""
                    + u.getKcemail() + "\",password = \""
                    + u.getPassword() + "\" ,isfemale ="
                    + u.isIsfemale() + ",dob = \""
                    + u.getDob() + "\",grade ="
                    + u.getGrade() + ",house =\""
                    + u.getHouse() + "\", balance ="
                    + u.getBalance() + "\", isadmin ="
                    + u.isIsadmin() + ");";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "update user !!!!");
        }
        return numRows;
    }

    public boolean userPresent(String inEmail, String inPass) {
        boolean present = false;
        try {
            String sql = "SELECT * FROM usersdb.tblusers WHERE kcemail = \""
                    + inEmail + "\"" + "AND password = \"" + inPass + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            if (rs.next()) {
                present = true;
            }
        } catch (SQLException e) {
            System.err.println(e + "present user !!!!");
        }
        return present;
    }

    public boolean emailPresent(String inEmail) {
        boolean present = false;
        try {
            String sql = "SELECT * FROM usersdb.tblusers WHERE kcemail = \""
                    + inEmail + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            if (rs.next()) {
                present = true;
            }
        } catch (SQLException e) {
            System.err.println(e + "email user !!!!");
        }
        return present;
    }

    public int addBalance(User u, double x) {
        int numRows = 0;
        try {
            String sql = "UPDATE tblusers SET balance = balance + " + x + " WHERE userid = " + u.getUserid() + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (Exception e) {
            System.err.println(e + "udate balance!!");
        }
        return numRows;
    }

    public int subtractBalance(User u, double x) {
        int numRows = 0;
        try {
            String sql = "UPDATE tblusers SET balance = balance - " + x + " WHERE userid = " + u.getUserid() + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (Exception e) {
            System.err.println(e + "udate balance!!");
        }
        return numRows;
    }

    public int insertEvent(Event e) {
        int numRows = 0;
        try {
            String sql = "INSERT INTO tblevents (sport, date, teamA, teamB) VALUES(\""
                    + e.getSport() + "\",\""
                    + e.getDate() + "\",\""
                    + e.getTeamA() + "\",\""
                    + e.getTeamB() + "\");";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);

        } catch (Exception er) {
            System.err.println(er + "insert event!!!!");
        }
        return numRows;
    }


}
