/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricproject;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MatricProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataHandler dh = new DataHandler();
        LocalDate date = LocalDate.of(2002, 01, 01);
        LocalDate date1 = LocalDate.of(2021, 01, 01);
        Event e = new Event(1, "hockey", date1, "Chubb", "Gane");
        Event ee = new Event(2, "hockey", date1, "Chubb", "Gane");
        Event ew = new Event(1, "hockey", date1, "Chubb", "Gane", 0, 0, 0, "Chubb");
        User u = new User(1, "bob", "smith", "24bobs@kingswoodcollege.com", "bob123",
                true, date, 9, "wood", 100.98776, false);
        Betslip b = new Betslip(1, 1, 1, "Gane", 20, 0.0, null);

//dh.updateEventOdds(dh.searchEventID(1));
double total = 198.75392297;
        System.out.println(dh.searchEventID(1).getOddsA());
//        dh.setOddsOfEvent(dh.searchEventID(49));
//        dh.updateEventOdds(dh.searchEventID(49));
//
//        System.out.println(dh.searchEventID(49));
//System.out.println(dh.searchEventID(1).getOddsA());
//dh.updateEventOdd(dh.searchEventID(54));
//System.out.println(dh.searchEventID(54));

//for (Event eee : dh.getAllEvents()) {
//           dh.updateEventOdd(e);
//        }
//
//
//Login l = new Login();
//l.setVisible(true);
        //dh.updateBetWon(b, true); 
        //    dh.updateWinner(e, "Chubb");
        //    dh.updateAllBalances(e, "Chubb");
        //dh.updateUserBalance(u, 11.0);
        // dh.placeBetFinal(u, e, 33, "Gane");
        //  dh.addOddsMethod();
        //    dh.updateBetslipRA();
        //  dh.updateDrawsHouseEvent(dh.searchHouseEvent("hockey", "wood"));
        //System.out.println(dh.oddsHaveBeenSet(28));
//        ArrayList<User> users = dh.getAllUsers();
//      
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }
    }

}
