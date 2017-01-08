package de.kyzrfranz.opentime.be.models;

/**
 * Created by kaiserfranz on 07/01/2017.
 */
public class OTUser {

    private static long id;
    private static String userName;
    private static String firstName;
    private static String lastName;
    private static String email;

    public OTUser(String username){
        this.userName = username;
    }



    public static long getId() {
        return id;
    }

    public static String getUsername() {
        return userName;
    }

    public static void setUsername(String username) {
        OTUser.userName = username;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        OTUser.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        OTUser.lastName = lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        OTUser.email = email;
    }





}
