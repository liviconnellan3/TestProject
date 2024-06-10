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
        LocalDate date = LocalDate.of(2024, 11, 20);
        Event e = new Event(4, "hockey", date, "wood", "jagger");
       
e.setOddsA(dh.calculatingOddsA(e));
e.setOddsB(dh.calculatingOddsB(e));
        System.out.println(e);

               
//        ArrayList<User> users = dh.getAllUsers();
//      
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }
    }
    
}
