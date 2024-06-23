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
            System.err.println(e + "getAllUsers error!!!");
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
            System.err.println(e + "getAllEvents class error!!!");
        }
        return events;
    }

    public ArrayList<Event> getAllUpcomingEvents() {
        ArrayList<Event> events = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblevents WHERE date >= CURDATE();";
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
            System.err.println(e + "getAllUpcomingEvents error!!!");
        }
        return events;
    }

    public ArrayList<Event> getAllPastEvents() {
        ArrayList<Event> events = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblevents WHERE date < CURDATE();";
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
            System.err.println(e + "getAllPastEvents error!!!");
        }
        return events;
    }

    public ArrayList<Betslip> getBetslip() {
        ArrayList<Betslip> bets = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblbets;";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int betid = Integer.parseInt(rs.getString("betid"));
                int eventid = Integer.parseInt(rs.getString("eventid"));
                int usertid = Integer.parseInt(rs.getString("userid"));
                String chosenteam = rs.getString("chosenteam");
                double amount = rs.getDouble("amount");
                double returnamount = rs.getDouble("returnamount");

                Boolean won = null;
                if (rs.getObject("won") != null) {
                    won = rs.getBoolean("won");
                }
                Betslip b = new Betslip(betid, eventid, usertid, chosenteam, amount, returnamount, won);
                bets.add(b);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "getBetslip error!!!");
        }
        return bets;
    }

    public ArrayList<Betslip> getAllBetsForEvent(Event e) {

        ArrayList<Betslip> bets = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblbets WHERE eventid = " + e.getEventid() + ";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int betid = Integer.parseInt(rs.getString("betid"));
                int eventid = Integer.parseInt(rs.getString("eventid"));
                int usertid = Integer.parseInt(rs.getString("userid"));
                String chosenteam = rs.getString("chosenteam");
                double amount = rs.getDouble("amount");
                double returnamount = rs.getDouble("returnamount");
                Boolean won = null;
                if (rs.getObject("won") != null) {
                    won = rs.getBoolean("won");
                }

                Betslip b = new Betslip(betid, eventid, usertid, chosenteam, amount, returnamount, won);
                bets.add(b);
            }
            conn.close(); //must close!!!
        } catch (Exception err) {
            System.err.println(err + "getAllBetsForEvent error!!!");
        }
        return bets;

        
        // return bets;
    }
    
     public ArrayList<Betslip> searchAllBetsForEventID(int inID) {

        ArrayList<Betslip> bets = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblbets WHERE eventid = " + inID + ";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int betid = Integer.parseInt(rs.getString("betid"));
                int eventid = Integer.parseInt(rs.getString("eventid"));
                int usertid = Integer.parseInt(rs.getString("userid"));
                String chosenteam = rs.getString("chosenteam");
                double amount = rs.getDouble("amount");
                double returnamount = rs.getDouble("returnamount");
                Boolean won = null;
                if (rs.getObject("won") != null) {
                    won = rs.getBoolean("won");
                }

                Betslip b = new Betslip(betid, eventid, usertid, chosenteam, amount, returnamount, won);
                bets.add(b);
            }
            conn.close(); //must close!!!
        } catch (Exception err) {
            System.err.println(err + "searchAllBetsForEventID  error!!!");
        }
        return bets;

        
        // return bets;
    }

    public void updateAllBalances(Event e, String winner){
         ArrayList<Betslip> bet = new ArrayList();
         bet = getAllBetsForEvent(e);
         updateWinner(e, winner);
    for (Betslip bets: getAllBetsForEvent(e)) {
            String chosenT = bets.getChosenteam();
            if (chosenT.equalsIgnoreCase(winner)) {
                

              //  double returnA = returnAmount(searchEventID(bets.getEventid()), bets.get(i));
              double returnA = bets.getReturnmount();
                
                        
                //bets.get(i).setReturnmount(returnA);
                //  bets.get(i).setWon(Boolean.TRUE);
                User u = searchUserID(bets.getUserid());
                
                  updateUserBalance(u, u.getBalance() + returnA);

            } else {
                 double returnA = bets.getReturnmount();
                //double returnA = returnAmount(searchEventID(bets.get(i).getEventid()), bets.get(i));
                 
                
                User u = searchUserID(bets.getUserid());
                updateUserBalance(u, u.getBalance() - bets.getAmount());
                
            }

        }
    }
    
    public ArrayList<Betslip> getUserBetslip(User u) {
        ArrayList<Betslip> bets = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblbets WHERE userid = " + u.getUserid() + ";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int betid = Integer.parseInt(rs.getString("betid"));
                int eventid = Integer.parseInt(rs.getString("eventid"));
                int usertid = Integer.parseInt(rs.getString("userid"));
                String chosenteam = rs.getString("chosenteam");
                double amount = rs.getDouble("amount");
                double returnamount = rs.getDouble("returnamount");
                Boolean won = null;
                if (rs.getObject("won") != null) {
                    won = rs.getBoolean("won");
                }

                Betslip b = new Betslip(betid, eventid, usertid, chosenteam, amount, returnamount, won);
                bets.add(b);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "updateAllBalanceserror!!!");
        }
        return bets;
    }

    
    public ArrayList<Event> getAllEventsSportSpecified(String inSport) {
        ArrayList<Event> events = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblevents WHERE sport = \"" + inSport + "\";"; //\" AND date = DATE(NOW())
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
            System.err.println(e + "getAllEventsSportSpecifiederror!!!");
        }
        return events;
    }

    public ArrayList<Request> getAllRequests() {
        ArrayList<Request> request = new ArrayList();
        try {
            String sql = "SELECT * FROM usersdb.tblrequests;";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql); //like scanner
            while (rs.next()) { //while scanner. has next line basically
                int requestid = Integer.parseInt(rs.getString("requestid"));
                int userid = Integer.parseInt(rs.getString("userid"));
                double amount = Double.parseDouble(rs.getString("amount"));

                LocalDate daterequested = rs.getDate("daterequested").toLocalDate();

                Request r = new Request(requestid, userid, amount, daterequested);
                request.add(r);
            }
            conn.close(); //must close!!!
        } catch (Exception e) {
            System.err.println(e + "getAllRequests error!!!");
        }
        return request;
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
            System.err.println(e + "getAllHouseEvents error!!!");
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
            System.err.println(er + "calculatingOddsA error!!!!!!!");
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
             System.err.println(er + "calculatingOddsB error!!!!!!!");
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

    public double calculatingDraw(Event inE) {

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
             System.err.println(er + "calculatingDRAW error!!!!!!!");
        }
        double a = (drawsA / (winsA + lossesA + drawsA));
        double b = (drawsB / (winsB + lossesB + drawsB));
        double total = (a + b) / 2;
        total = (total / (1 - total)) * 10;
        total = Math.round(total * 10.0) / 10.0;

        return total;
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
            System.err.println(er + "setOdds error!!!!!!!");
        }
        double a = (winsA / (winsA + lossesA + drawsA)) * 100;
        double b = (winsB / (winsB + lossesB + drawsB)) * 100;
        double total = a + b;

        double oddsA = 1 / (a / total);
        oddsA = Math.round(oddsA * 10.0) / 10.0;
        double oddsB = 1 / (b / total);
        oddsB = Math.round(oddsB * 10.0) / 10.0;

        double c = (drawsA / (winsA + lossesA + drawsA));
        double d = (drawsB / (winsB + lossesB + drawsB));
        double tt = ((c + d) / 2) * 10;
        tt = Math.round(tt * 10.0) / 10.0;

        inE.setOddsA(oddsA);
        inE.setOddsB(oddsB);
        inE.setOddsDraw(tt);
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
            System.err.println(e + "insertNewUserr errror !!!!");
        }
        return numRows;
    }

    public int insertNewRequest(Request r) {
        int numRows = 0;
        try {
            String sql = "INSERT INTO usersdb.tblrequests( userid, amount, daterequested) VALUES("
                    + r.getUserid() + ","
                    + r.getAmount() + ",\""
                    + r.getDaterequested() + "\");";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "insertNewRequest errrrror!!!!");
        }
        return numRows;
    }

    public int deleteRequest(Request r) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "DELETE  FROM usersdb.tblrequests WHERE requestid = " + r.getRequestid() + ";";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "delete request errorrrrrrr !!!!");
        }
        return numRows;
    }

    public Request searchRequest(int inID) {
        Request e = null;
        try {
            String sql = "SELECT * FROM usersdb.tblrequests WHERE requestid = " + inID + ";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            while (rs.next()) { //while scanner. has next line basically
                int requestid = Integer.parseInt(rs.getString("requestid"));
                int userid = Integer.parseInt(rs.getString("userid"));
                double amount = Double.parseDouble(rs.getString("amount"));

                LocalDate daterequested = rs.getDate("daterequested").toLocalDate();

                e = new Request(requestid, userid, amount, daterequested);

            }
            conn.equals(rs);

        } catch (SQLException er) {
            System.err.println(er + "searchRequest errorrrrr !!!!");
        }
        return e;
    }

    public int deleteUser(User u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "DELETE FROM usersdb.tblusers WHERE userid = " + u.getUserid() + ";";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "deleteUser errorrrrrr!!!!");
        }
        return numRows;
    }

    public void deleteEvent(Event u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "DELETE FROM usersdb.tblevents WHERE eventid = " + u.getEventid() + ";";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "delete event errrorrrrrrr !!!!");
        }

    }

    //fix code video 2 20:00
    public int updateUser(User u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE userdbs.tblusers SET username = \""
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
            System.err.println(e + "update user errorrrrrrrrrr !!!!");
        }
        return numRows;
    }
//   
public void updateUserBalance(User u, Double x){
 int numRows = 0;
 
  try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE usersdb.tblusers SET balance = " + x + " WHERE userid = " + u.getUserid() + ";"; 
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "updateUserBalance errorrrrrrrr !!!!");
        }
 
}

    public void updateEvent(Event u, int id) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE usersdb.tblevents SET eventid = "
                    + u.getEventid() + " , sport = \""
                    + u.getSport() + "\", date = \""
                    + u.getDate() + "\",teamA = \""
                    + u.getTeamA() + "\" ,teamB =\""
                    + u.getTeamB() + "\" WHERE eventid = " + id + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "update event errorrrrr!!!!");
        }

    }
      public void updateEventOdds(Event u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE usersdb.tblevents SET eventid = "
                    + u.getEventid() + " , sport = \""
                    + u.getSport() + "\", date = \""
                    + u.getDate() + "\",teamA = \""
                    + u.getTeamA() + "\" ,teamB =\""
                    + u.getTeamB() + "\",oddsA = "
                    + u.getOddsA()+ ", oddsB = "
                    + u.getOddsB()+ ", oddsDraw ="
                    +u.getOddsDraw() 
                    +" WHERE eventid = " + u.getEventid() + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "update event errorrrrr!!!!");
        }

    }
      
      public void updateBetslipppp(Betslip u) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE usersdb.tblbets SET betid = "
                    + u.getBetid() + " , eventid = "
                    + u.getEventid() + ", userid = "
                    + u.getUserid() + ",chosenteam = \""
                    + u.getChosenteam() + "\" ,amount ="
                    + u.getAmount() + ",returnamount = "
                    + u.getReturnmount()
                    +" WHERE betid = " + u.getBetid() + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException e) {
            System.err.println(e + "update betslippppp errorrrrr!!!!");
        }

    }
//
    public void updateWinner(Event e, String inW) {
        int numRows = 0;
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql = "UPDATE usersdb.tblevents SET winner = \"" + inW + "\" WHERE eventid = " + e.getEventid() + ";";
            
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException ee) {
            System.err.println(ee + "updateWinner errorrrrrrrrr !!!!");
        }

    }

     public void updateBetslips(Event e, String winner){
      int numRows = 0;
         updateWinner(e, winner);
        try {
            //  surname, kcemail, password, isfemale, dob, grade, house) VALUES("livi","connellan","24oliviac@kingswoodcollege.com","livi123", 1, "2006-02-03",12,"wood")
            String sql1 = "UPDATE usersdb.tblbets SET won = true WHERE chosenteam = \"" +winner+"\" AND eventid = "+ e.getEventid() +";" ; 
                String sql2 =      "UPDATE usersdb.tblbets SET won = false WHERE chosenteam != \"" +winner+"\" AND eventid = "+ e.getEventid() +";";
                    
            Connect conn = new Connect();
            numRows = conn.makeChange(sql1);
            numRows = conn.makeChange(sql2);
        } catch (SQLException er) {
            System.err.println(er + "updateBetslips errorrrrrr !!!!");
        }
     
     }
    public void updateBetWon(Betslip b, Boolean tt) {
        int numRows = 0;
        try {
            String sql = "UPDATE usersdb.tblbets SET won = " + tt + " WHERE eventid = " + b.getEventid() + ";";
            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (SQLException ee) {
            System.err.println(ee + "updateBetWon errorr !!!!");
        }
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
            System.err.println(e + "user  present  error!!!!");
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
            System.err.println(e + "emailPresent errrr !!!!");
        }
        return present;
    }

    public User searchUser(String inEmail, String inPass) {
        User u = null;
        try {
            String sql = "SELECT * FROM usersdb.tblusers WHERE kcemail = \""
                    + inEmail + "\" AND  password = \"" + inPass + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            if (rs.next()) {
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

                u = new User(userid, username, surname, kcemail, password, isfemale, dob, grade, house, balance, isadmin);

            }
            conn.equals(rs);

        } catch (SQLException e) {
            System.err.println(e + "searchUser errrrr !!!!");
        }
        return u;
    }

    public String getWinnerEvent(int inID) {
        String win = "";
        try {
            String sql = "SELECT winner FROM usersdb.tblevents WHERE eventid = " + inID + ";";
            ;
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            if (rs.next()) {
                String winner = rs.getString("winner");

                win = winner;

            }
            conn.equals(rs);

        } catch (SQLException e) {
            System.err.println(e + "getWinnerEvent errrrrrr!!!!");
        }
        return win;
    }

    public User searchUserID(int inID) {
        User u = null;
        try {
            String sql = "SELECT * FROM usersdb.tblusers WHERE userid = " + inID + ";";
            ;
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            if (rs.next()) {
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

                u = new User(userid, username, surname, kcemail, password, isfemale, dob, grade, house, balance, isadmin);

            }
            conn.equals(rs);

        } catch (SQLException e) {
            System.err.println(e + "searchUserID errrrr!!!!");
        }
        return u;
    }

    public Event searchEvent(String inSport, String inTeamA, String inTeamB, LocalDate dd) {
        Event e = null;
        try {
            String sql = "SELECT * FROM usersdb.tblevents WHERE sport = \""
                    + inSport + "\" AND  teamA = \"" + inTeamA + "\" AND teamB = \"" + inTeamB + "\" AND date = \"" + dd + "\";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            while (rs.next()) { //while scanner. has next line basically
                int eventid = Integer.parseInt(rs.getString("eventid"));
                String sport = rs.getString("sport");
                LocalDate date = rs.getDate("date").toLocalDate();
                String teamA = rs.getString("teamA");
                String teamB = rs.getString("teamB");

                e = new Event(eventid, sport, date, teamA, teamB);

            }
            conn.equals(rs);

        } catch (SQLException er) {
            System.err.println(er + "searchEvent errrrrr !!!!");
        }
        return e;
    }

    public Event searchEventID(int id) {
        Event e = null;
        try {
            String sql = "SELECT * FROM usersdb.tblevents WHERE eventid = " + id + ";";
            Connect conn = new Connect();

            ResultSet rs = conn.query(sql);

            while (rs.next()) { //while scanner. has next line basically
                int eventid = Integer.parseInt(rs.getString("eventid"));
                String sport = rs.getString("sport");
                LocalDate date = rs.getDate("date").toLocalDate();
                String teamA = rs.getString("teamA");
                String teamB = rs.getString("teamB");

                e = new Event(eventid, sport, date, teamA, teamB);

            }
            conn.equals(rs);

        } catch (SQLException er) {
            System.err.println(er + "searchEventID errrrrrr!!!!");
        }
        return e;
    }

    public void addBalance(User u, double x) {

        try {
            String sql = "UPDATE usersdb.tblusers SET balance = balance + " + x + " WHERE userid = " + u.getUserid() + ";";
            Connect conn = new Connect();
            conn.makeChange(sql);
        } catch (Exception e) {
            System.err.println(e + "addBalance errrrrr!!");
        }

    }

    public Double returnAmount(Event e, Betslip b) {
        e.setOddsA(calculatingOddsA(e));
        e.setOddsB(calculatingOddsB(e));
        e.setOddsDraw(calculatingDraw(e));

        if (e.getTeamA().equalsIgnoreCase(b.getChosenteam())) {
            return e.getOddsA() * b.getAmount();
        }
        if (e.getTeamB().equalsIgnoreCase(b.getChosenteam())) {
            return e.getOddsB() * b.getAmount();
        }
        if (b.getChosenteam().equalsIgnoreCase("draw")) {
            return e.getOddsDraw() * b.getAmount();
        } 
        return 0.0;

    }
    
  public void setOddsOfEvent(Event e) {
        e.setOddsA(calculatingOddsA(e));
        e.setOddsB(calculatingOddsB(e));
        e.setOddsDraw(calculatingDraw(e));

       

    }
  
  public void addOddsMethod(){
  ArrayList<Event> events = new ArrayList();
  events =getAllEvents();
      for (Event event:getAllEvents()) {
          setOddsOfEvent(event);
          updateEventOdds(event);
      }
      
  }
  
  public void setRA(Betslip bet){
      String team = bet.getChosenteam();
       Event e = searchEventID(bet.getEventid());
             
              double odds = 0.0;
        setOddsOfEvent(e);
        
        if (e.getTeamA().equalsIgnoreCase(team)) {
            odds = e.getOddsA();
        }if (e.getTeamB().equalsIgnoreCase(team)) {
            odds = e.getOddsB();
        }if (team.equalsIgnoreCase("draw")) {
            odds = e.getOddsB();
        }
        Double d = bet.getAmount()*odds;
      bet.setReturnmount(d);
  }
  
  public void updateBetslipRA() {
      ArrayList<Betslip> bets = new ArrayList();
      for (Betslip bet: getBetslip()) {
          setRA(bet);
          updateBetslipppp(bet);
      }
      //  Betslip b = new Betslip(e.getEventid(), u.getUserid(), team, amount);
        
        
    }
  
    public Double getOddsOfBet(Event e, Betslip b) {
        e.setOddsA(calculatingOddsA(e));
        e.setOddsB(calculatingOddsB(e));
        e.setOddsDraw(calculatingDraw(e));

        if (e.getTeamA().equalsIgnoreCase(b.getChosenteam())) {
            return e.getOddsA();
        }
        if (e.getTeamB().equalsIgnoreCase(b.getChosenteam())) {
            return e.getOddsB();
        }
        if (b.getChosenteam().equalsIgnoreCase("draw")) {
            return e.getOddsDraw();
        } else {
            return null;
        }

    }

    public void subtractBalance(User u, double x) {

        try {
            String sql = "UPDATE usersdb.tblusers SET balance = balance - " + x + " WHERE userid = " + u.getUserid() + ";";
            Connect conn = new Connect();
            conn.makeChange(sql);
        } catch (Exception e) {
            System.err.println(e + "subtractBalance errrrrrrr!!");
        }

    }


    public void placeBetFinal(User u, Event e, double amount, String team) {
      //  Betslip b = new Betslip(e.getEventid(), u.getUserid(), team, amount);
        subtractBalance(u, amount);
        int numRows = 0;
        double odds = 0.0;
        setOddsOfEvent(e);
        
        if (e.getTeamA().equalsIgnoreCase(team)) {
            odds = e.getOddsA();
        }if (e.getTeamB().equalsIgnoreCase(team)) {
            odds = e.getOddsB();
        }if (team.equalsIgnoreCase("draw")) {
            odds = e.getOddsB();
        }
        try {
            String sql = "INSERT INTO usersdb.tblbets (eventid, userid, chosenteam, amount, returnamount) VALUES("
                    + e.getEventid() + ","
                    + u.getUserid() + ",\""
                    + team + "\","
                    + amount + ", "+ 
                    amount*odds 
                    + ");";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);
        } catch (Exception er) {
            System.err.println(er + "placeBetFinal errrrrrr!!!!");
        }

    }

    public int insertEvent(Event e) {
        int numRows = 0;
        try {
            String sql = "INSERT INTO usersdb.tblevents (sport, date, teamA, teamB) VALUES(\""
                    + e.getSport() + "\",\""
                    + e.getDate() + "\",\""
                    + e.getTeamA() + "\",\""
                    + e.getTeamB() + "\");";

            Connect conn = new Connect();
            numRows = conn.makeChange(sql);

        } catch (Exception er) {
            System.err.println(er + "insert event errrrrrr!!!!");
        }
        return numRows;
    }

}
