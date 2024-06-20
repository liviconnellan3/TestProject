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
        Event e = new Event(1, "hockey", date1, "Wood", "Gane");
       User u = new User(1, "bob", "smith", "24bobs@kingswoodcollege.com", "bob123", 
               true, date, 9, "wood", 100, false);
       Request r = new Request(7, 100, date1);
//e.setOddsA(dh.calculatingOddsA(e));
//e.setOddsB(dh.calculatingOddsB(e));
//        System.out.println(dh.getAllEventsSportSpecified("hockey"));
//dh.placeBetFinal(u, e, 10, "Wood");
//dh.insertNewRequest(r);
System.out.println(dh.getAllPastEvents());

               
//        ArrayList<User> users = dh.getAllUsers();
//      
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }
    }
    
}
