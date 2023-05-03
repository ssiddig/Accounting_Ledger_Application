package com.ss;

//create scanner class
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



//create Array list


public class AccountLedgerApp {

public class Entries {
    // Create static variable called Entries . It will be an ArrayList of (Dates, payments, deposits)
    static ArrayList<Entries> ledgerEntries = new ArrayList<Entries>();
    // Create static scanner instance
    static Scanner scanner = new Scanner(System.in);

    //Main method
    public static void main(String[] args) {

        String input;
        do {


            System.out.println("\n== Main Menu");
            System.out.println("(D) Add Deposits");
            System.out.println("(P) Make Payment");
            System.out.println("(L) Ledger");
            System.out.println("(Q) Quit");
            System.out.println("Enter Option: ");
            input = scanner.nextLine().toUpperCase();


            switch (input) {

                //create switch statement that handles cases related to each menu item
                //Case 1: Add Deposits(D)
                case "D":
                    addDeposits();
                    break;

                //prompt the user for the deposit information and save it to csv file
                //Case 2: Make Payment(P)
                case "P":
                    makePayments();
                    break;

                //prompt user for debit information and save it to csv file
                //Case 3: Ledger(L)
                case "L":
                    showLedgerMenu();
                    break;

                //create a do-while loop that runs unless enters "Q"
                case "Q":
                    System.out.println("Exit application");
                    break;
                default:

                    System.out.println("Invalid input. Please try again.");
                    break;

            }
            //Handle user inputs using switch statements
        } while (!input.equals("Q"));

    }


    // Define constants for file names and dates
    private static final String Ledger_File = "transactions.txt";
    private static final String Ledger_Header = "Date, Descriptions, Amount";
    private static final String Date_Format = ("MM/dd/yyyy");


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


    ///implement methods
    private static void addDeposits() {
    }

    private static void makePayments() {
    }


    private static void showLedgerMenu() {

        String input;
        //Display Ledger Submenu
        do {
            System.out.println("\n== Ledger Menu");
            System.out.println("(A) All");
            System.out.println("(D) Deposits");
            System.out.println("(P) Payments");
            System.out.println("(R) Reports");
            System.out.println("(H) Home");
            System.out.println("Enter Option: ");
            input = scanner.nextLine().toUpperCase();

            // Handle user input using switch statement


            //create method for ledger menu
            switch (input) {


                //   Display all entries

                case "A":
                    showAllEntries();
                    break;

                //   Display only deposit entries

                case "D":
                    showDepositsEntries();
                    break;

                //   Display only negative entries
                case "P":
                    showPaymentEntries();
                    break;

                //Case 4: Reports (R)- Display reports sub menu
                case "R":
                    showReportsMenu();
                    break;


                case "H":
                    System.out.println("Returning to main menu   ");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }

        } while (!input.equals("H"));
    }

    //Method to show all entries in ledger
    private static void showAllEntries() {
    }

    private static void showReportsMenu() {
    }

    //show deposit entries
    private static void showDepositsEntries() {

    }

    //show payment entries
    private static void showPaymentEntries() {
    }

         do{

        System.out.println("\t== Reports Menu");
        System.out.println("(1) Month to Date");
        System.out.println("(2) Previous Month");
        System.out.println("(3) Year to Date");
        System.out.println("(4) Previous Year");
        System.out.println("(5) Search by Vendor");
        System.out.println("(O) Back to Ledger Menu")
        String input = scanner.nextLine();

    switch (input) {
        case "1":
            displayEntriesThisMonth(ledgerEntries);

            break;

        case "2":
            displayEntriesPreviousMonth(ledgerEntries);

            break;

        case "3":
            displayLedgerEntries(ledgerEntries);

            break;

        case "4":
            displayReportsMenu(scanner);

            break;
    }

    }while(input != 0);

         ///////

         //Converting from a string to a date
            String date1 = "2000-12-01"; // yyyy-mm-dd
            //1: Create a pattern for this date
                DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-mm-dd");

            //2: Parse/convert the date using the created pattern
                LocalDate formattedDate1 = LocalDate.parse(date1, dateTimeFormatter1);
            //Print to confirm

            System.out.println(formattedDate1.getYear());







            String date2 = "12-01-00"; // MM-dd-yy

    //1: Create a pattern for this date

    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM-dd-yy");
    //2: Parse/convert hte date using the created pattern
    LocalDate getFormattedDate2 = LocalDate.parse(date2, dateTimeFormatter2);
    //Print to confirm

    System.out.println(formattedDate2.getyear);
            String date3 = "2023-04-15"; // dd-mm-yyyy
  //1: Create a pattern for this date

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //2: Parse/convert hte date using the created pattern
        String outputDate1 = formattedDate1.format(dateTimeFormatterOutput)
    //Print to confirm
     System.out.println(formattedDate3.getyear());

        //
        //Converting from a date to a string

        // Month to Date (1)
            //Create a date LocalDate.now().getYear() + " " LocalDate.now().getMonth() + " " 00 + "
            // localDate.now().minusMonths(1);
            // "2023-01-01 00:00:00"

        //From the beginning of the year (YTD (3))
            //givenDateTime > "2023-01-01 00:00:00"

        //All transactions from last year (Previous year (4))
            //givenDateTime > "2022-01-01 00:00:00" && < "2023-01-01 00:00:00"
        //If giveDate is within date range








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
        ///// Capstone Example

            String date = "2023-04-15";
            String time = "10:13:25";
            String dateTime = date + " " + time; // "2023-04-15 10:13:25"

        //1: Create a pattern for this date
             DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //2: Parse/convert hte date using the created pattern

            LocalDateTime localDateTime = localDateTime.parse(dateTime, dateTimeFormatter);

            System.out.println(localDateTime);



    }




}

  {


        }
    }


}
}
