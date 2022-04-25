package main.java;

import java.sql.*;
import java.util.Scanner;


public class Methods {

    public void MainMenuSelect() {

        //Main menu options
        System.out.println("Select from the options below:");
        System.out.println("Press 1 to add a customer to the system \n Press 2 to view all customers in the system \n " +
                "Press 3 to update a customer in the system \n Press 4 to delete a customer in the system");
        Scanner menuSelect = new Scanner(System.in);
        String dataInput = menuSelect.nextLine();

    }
}








