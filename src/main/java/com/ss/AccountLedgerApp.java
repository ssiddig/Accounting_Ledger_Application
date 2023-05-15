package com.ss;

//import methods
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;


public class AccountLedgerApp {


    private static Scanner scanner;

    public static class Entries {
        // Create static variable called Entries . It will be an ArrayList of (Dates, payments, deposits)
        static ArrayList<Entries> ledgerEntries = new ArrayList<Entries>();
        // Create static scanner instance
        static Scanner scanner = new Scanner(System.in);
        static LocalDateTime today = LocalDateTime.now();

        public void Entries(String date, String time, String description, String vendor, Float amount) {
        }


        public static void makePayments() {
            
        }

        public static void addDeposits() {
        }
    }




        //Main method (beginning)
        public static void main(String[] args) {
        entries();
        String input;


            do {
                System.out.println("\n== Main Menu");
                System.out.println("(D) Add Deposits");
                System.out.println("(P) Make Payment");
                System.out.println("(L) Ledger");
                System.out.println("(Q) Quit");
                System.out.println("Enter Option: ");

                input = scanner.nextLine();


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

    private static void entries() {
    }


    private static void addDeposits() {



            System.out.println("\t| Add Deposit |");
            System.out.println("Date of deposit is (YYYY-MM-DD): ");
            String date = scanner.nextLine();

            System.out.println("Time of deposit is (HH:MM:SS): ");
            String time = scanner.nextLine();

            System.out.println("Description of deposit: ");
            String description = scanner.nextLine();

            System.out.println("Name of Vendor: ");
            String vendor = scanner.nextLine();

            System.out.println("Deposit amount: $ ");
            Float amount = scanner.nextFloat();
            scanner.nextLine();



        }

        private static void makePayments() {
            System.out.println("\t| Add Payment |");
            System.out.println("Date of payment is (YYYY-MM-DD): ");
            String date = scanner.nextLine();

            System.out.println("Time of payment is (HH:MM:SS): ");
            String time = scanner.nextLine();

            System.out.println("Description of payment: ");
            String description = scanner.nextLine();

            System.out.println("Name of Vendor: ");
            String vendor = scanner.nextLine();

            System.out.println("Payment amount: $ ");
            Float amount = scanner.nextFloat();
            scanner.nextLine();



        }
//        }








    ////end of menu


    ///beginning of ledger menu

    //Display Ledger Submenu

    private static void showLedgerMenu() {
        Scanner scanner = new Scanner(System.in);
        String input;


        do {
            System.out.println("\n== Ledger Menu");
            System.out.println("(A) All");
            System.out.println("(D) Deposits");
            System.out.println("(P) Payments");
            System.out.println("(R) Reports");
            System.out.println("(H) Home");
            System.out.println("Enter Option: ");
            input = scanner.nextLine();


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
                        break;
            }

        } while (!input.equals("H"));


    }

    //Method to show all entries in ledger
    private static void showAllEntries() {

    }
    private static void showPaymentEntries() {
    }

    //show deposit entries
    private static void showDepositsEntries() {

    }


    /////end of ledger menu


    //////beginning of report menu

    public static void showReportsMenu() {
      Scanner scanner = new Scanner(System.in);
            String input;
        do {

            System.out.println("\t== Reports Menu");
            System.out.println("(1) displayEntriesThisMonth");
            System.out.println("(2) displayEntriesPreviousMonth");
            System.out.println("(3) Year to Date");
            System.out.println("(4) Previous Year");
            System.out.println("(5) Search by Vendor");
            System.out.println("(O) Back to Ledger Menu");
            input = scanner.nextLine();


            switch (input){
                case "1":
                    displayEntriesMonthToDate();

                    break;

                case "2":
                    displayEntriesPreviousMonth();

                    break;

                case "3":
                    displayEntriesYearToDate();

                    break;

                case "4":
                    displayEntriesPreviousYear();

                    break;

                case "5":
                    displaySearchByVendor();
                    break;

                case "0":
                    break;

                default:
                    System.out.println("Invalid entry, please try again.");
            }

        } while (!input.equals(0));
    }
            private static void displayEntriesMonthToDate(){
        }
            private static void  displayEntriesPreviousMonth(){
        }

            private static void displayEntriesYearToDate(){
        }

            private static void displayEntriesPreviousYear(){
        }

            private static void displaySearchByVendor(){
    }
}






 ///// end of report menu





//        FileWriter writer = new FileWriter("./src/main/java/com/ss/transcations.csv");
//        BufferReader bufferReader = newBufferReader(transcations.csv);






    // Define constants for file names and dates
//    private static final String Ledger_File = "transactions.txt";
//    private static final String Ledger_Header = "Date, Descriptions, Amount";
//    private static final String Date_Format = ("MM/dd/yyyy");




