package com.ss;

//create scanner class
import java.util.List;
import java.util.Scanner;



//create Array list
import java.util.ArrayList;
public class AccountLedgerApp {

    //initialize scanner
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
    }


    // Create static scanner instance
    private static final String Ledger_File = "transactions.txt";
    private static final String Ledger_Header = "Date, Descriptions, Amount";
    private static final String Date_Format = ("MM/dd/yyyy");





    // Create static variable called Entries . It will be an ArrayList of (Dates, payments, deposits)


    // Create static scanner instance



    // Pseudocode code:
    // Ledger: All entries should show the newest entries
    // (A) All- Display all entries
    // (D) Deposits-Display only the entries that are deposits into the account
    // (P) Payments-Display only the negative entries (or payments)
    // (R) Reports- A new screen that allows the user to run pre-defined reports or to run a custom  search
    // 1) Month to Date
    // 2) Previous Month
    // 3) Year To Date
    // 4) Previous Year
    // 5) Search By Vendor-prompt the user the vendor name and display all entries for that vendor
    // 0) Back-go back to the report page
    // H) Home-go back to the home page


        do{
        System.out.println("\n== Main Menu");
        System.out.println("(D) Add Deposits");
        System.out.println("(P) Make Payment");
        System.out.println("(L) Ledger");
        System.out.println("(Q) Quit");
        System.out.println("Enter Option: ");
        String input=scanner.nextLine().toUpperCase();
        switch (input){
            case"1":
                addDeposits(scanner,ledgerentries);
        }
    }while



    //create main menu:
    //initialize variable for user input
    //Show prompt for user showing the possible options and asking for an input
    //create a do-while loop that runs unless enters "Q"
    //create switch statement that handles cases related to each menu item
    //Case 1: Add Deposits(D)
    //prompt the user for the deposit information and save it to csv file
    //Case 2: Make Payment(P)
    //prompt user for debit information and save it to csv file
    //Case 3: Ledger(L)
    //Display Ledger Submenu
    //Case 4: Exit
    // the application

//        ledger menu:
//        create method for ledger menu
//        Case "1" All(A)
//        Display all entries
//        Case "2" Deposits (D)
//        Display only deposit entries
//        Case "3" Payments (P)
//        Display only negative entries
//        Case 4: Reports (R)
//        Display reports sub menu
//
//        Reports Menu
//        run custom search
//        Case "1" Month to Date
//        Show all transactions from this month to current date
//        Case "2" Previous Month
//        Show all transactions from previous month
//        Case "3" Year to Date
//        Shows all transactions from this year to current date
//        Case "4" Previous Year
//        Show all transactions from previous year
//         Case "5" Search  by Vendor
//        Prompt user for vendor  name and compare to the CSV
//
//        file
//        print the transactions associated with matching Strings
//
//


}


    }
}
