/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricproject;

/**
 *
 * @author User
 */
public class CurrentUser {
    private static CurrentUser instance;
    private User currentUser;

    public CurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private CurrentUser() {
        // Private constructor to prevent instantiation
    }

    public static synchronized CurrentUser getInstance() {
        if (instance == null) {
            instance = new CurrentUser();
        }
        return instance;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }
}


