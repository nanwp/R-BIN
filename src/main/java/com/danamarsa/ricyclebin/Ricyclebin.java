/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.danamarsa.ricyclebin;

/**
 *
 * @author nanda
 */
public class Ricyclebin {
    
    public static Welcome welcome;
    public static Login login;

    public static void main(String[] args) {
        
        Welcome w1 = new Welcome();
        Login l1 = new Login();
        login = l1;
        welcome = w1;
        welcome.setVisible(true);
    }
}
