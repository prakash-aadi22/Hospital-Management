import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class hospital {
    Scanner sc = new Scanner(System.in);
    FileWriter fw;

    {
        try {
            fw = new FileWriter("hospital.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void ambulance() {
        try {
            System.out.println("Press Allow to access your current location to get the address.");
            System.out.print("Enter \"A\" for allowing or enter \"M\" for manually uploading the address: ");
            String press = sc.next();
            sc.nextLine();
            int max = 20;
            int min = 1;
            int time = min + (int) (Math.random() * ((max - min) + 1));
            if (press.equalsIgnoreCase("A")) {
                System.out.print("Do you want to change your address (Yes/No): ");
                String ans = sc.next();
                sc.nextLine();
                if (ans.equalsIgnoreCase("Yes")) {
                    System.out.print("Enter your address here: ");
                    String address = sc.nextLine();
                    System.out.println("Ambulance Number: " + (time + 1));
                    System.out.println("Ambulance will arrive " + address + " in " + time + " minutes.");
                    fw.write("Ambulance Number: " + (time + 1) + "\n");
                    fw.write("Ambulance will arrive " + address + " in " + time + " minutes.");
                } else if (ans.equalsIgnoreCase("No")) {
                    System.out.println("Ambulance Number: " + (time + 1));
                    System.out.println("Ambulance will arrive there in " + time + " minutes.");
                    fw.write("Ambulance Number: " + (time + 1) + "\n");
                    fw.write("Ambulance will arrive there in " + time + " minutes.");
                } else {
                    System.out.println("You  have given a wrong input.");
                }
            } else if (press.equalsIgnoreCase("M")) {
                System.out.print("Enter your address here: ");
                String address = sc.nextLine();
                System.out.println("Ambulance Number: " + (time + 1));
                System.out.println("Ambulance will arrive " + address + " in " + time + " minutes.");
                fw.write("Ambulance Number: " + (time + 1) + "\n");
                fw.write("Ambulance will arrive " + address + " in " + time + " minutes.");
            } else {
                System.out.println("You  have given a wrong input.");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void bed() {
        try {
            int max = 50;
            int min = 0;
            int bed = min + (int) (Math.random() * ((max - min) + 1));
            System.out.println("Available bed/s are: " + bed);
            System.out.print("Do you want to book bed/s(Yes/No): ");
            String bs = sc.next();
            if (bs.equalsIgnoreCase("Yes")) {
                System.out.print("How many bed/s you want to book(1 or 2): ");
                int ns = sc.nextInt();
                sc.nextLine();
                if (ns == 1) {
                    System.out.print("Enter the name of the patient: ");
                    String pName = sc.nextLine();
                    String[] words = pName.split("\\s");
                    StringBuilder capitalizeStr = new StringBuilder();
                    for (String word : words) {
                        String firstLetter = word.substring(0, 1);
                        String remainingLetters = word.substring(1);
                        capitalizeStr.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
                    }
                    String pNewName = capitalizeStr.toString();
                    int bed1 = min + (int) (Math.random() * ((max - min) + 1));
                    System.out.println("Bed Number: " + bed1 + " has been booked for Mr/s. " + pNewName);
                    fw.write("Bed Number: " + bed1 + " has been booked for Mr/s. " + pNewName);
                } else if (ns == 2) {
                    System.out.print("Enter the name of the first patient: ");
                    String pName1 = sc.nextLine();
                    String[] words1 = pName1.split("\\s");
                    StringBuilder capitalizeStr1 = new StringBuilder();
                    for (String word : words1) {
                        String firstLetter = word.substring(0, 1);
                        String remainingLetters = word.substring(1);
                        capitalizeStr1.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
                    }
                    String pNewName1 = capitalizeStr1.toString();
                    int bed1 = min + (int) (Math.random() * ((max - min) + 1));
                    System.out.println("Bed Number: " + bed1 + " has been booked for Mr/s. " + pNewName1);
                    fw.write("Bed Number: " + bed1 + " has been booked for Mr/s. " + pNewName1);
                    System.out.print("Enter the name of the second patient: ");
                    String pName2 = sc.nextLine();
                    String[] words2 = pName2.split("\\s");
                    StringBuilder capitalizeStr2 = new StringBuilder();
                    for (String word : words2) {
                        String firstLetter = word.substring(0, 1);
                        String remainingLetters = word.substring(1);
                        capitalizeStr2.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
                    }
                    String pNewName2 = capitalizeStr2.toString();
                    int bed2 = min + (int) (Math.random() * ((max - min) + 1));
                    System.out.println("Bed Number: " + bed2 + " has been booked for Mr/s. " + pNewName2);
                    fw.write("\nBed Number: " + bed2 + " has been booked for Mr/s. " + pNewName2);
                } else {
                    System.out.println("You have given a wrong input.");
                }
            } else if (bs.equalsIgnoreCase("No")) {
                System.out.println();
            } else {
                System.out.println("You have given a wrong input.");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void medicine() {
        try {
            System.out.print("Enter the code of the prescription form (Example: #AB1234...) : ");
            String mName = sc.nextLine();
            int max = 10000;
            int min = 500;
            int bill = min + (int) (Math.random() * ((max - min) + 1));
            System.out.println("Prescription code: " + mName);
            System.out.println("Searching.....");
            TimeUnit.SECONDS.sleep(1);
            System.out.printf("Bill: ₹%d\n", bill);
            System.out.println("Press Allow to access your current location to get the address.");
            System.out.print("Enter \"A\" for allowing or enter \"M\" for manually uploading the address: ");
            String press = sc.next();
            sc.nextLine();
            if (press.equalsIgnoreCase("A")) {
                System.out.print("Do you want to change your address (Yes/No): ");
                String ans = sc.next();
                sc.nextLine();
                if (ans.equalsIgnoreCase("Yes")) {
                    System.out.print("Enter your address here: ");
                    String address = sc.nextLine();
                    System.out.println("Medicine will be delivered on " + address + " in within a week");
                    fw.write("Bill: ₹" + bill);
                    fw.write("Medicine will be delivered on " + address + " in within a week");
                } else if (ans.equalsIgnoreCase("No")) {
                    System.out.println("Medicine will be delivered on your address within a week");
                    fw.write("Bill: ₹" + bill);
                    fw.write("Medicine will be delivered on your address within a week");
                } else {
                    System.out.println("You  have given a wrong input.");
                }
            } else if (press.equalsIgnoreCase("M")) {
                System.out.print("Enter your address here: ");
                String address = sc.nextLine();
                System.out.println("Medicine will be delivered on " + address + " in within a week");
                fw.write("Bill: ₹" + bill);
                fw.write("Medicine will be delivered on " + address + " in within a week");
            } else {
                System.out.println("You  have given a wrong input.");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void doctorList() {
        try {
            System.out.println("Doctor are available 24*7");
            System.out.println("List of the Doctors available are --> ");
            System.out.println("--------------------------------------------------");
            System.out.println("|  DOCTOR'S NAME        SPECIALIST IN            |");
            System.out.println("| * DOCTOR 1       -->     SKIN                  |");
            System.out.println("| * DOCTOR 2       -->     EYE                   |");
            System.out.println("| * DOCTOR 3       -->     BONE                  |");
            System.out.println("| * DOCTOR 4       -->     EAR                   |");
            System.out.println("| * DOCTOR 5       -->     TEETH                 |");
            System.out.println("| * DOCTOR 6       -->     HEART                 |");
            System.out.println("| * DOCTOR 7       -->     BRAIN                 |");
            System.out.println("| * DOCTOR 8       -->     LUNGS                 |");
            System.out.println("| * DOCTOR 9       -->     GENERAL PHYSICIAN     |");
            System.out.println("--------------------------------------------------");
            System.out.print("Do you want to book a slot(Y/N): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("Y")) {
                bookSlot();
            } else if (op.equalsIgnoreCase("N")) {
                System.out.println("Doctor are available 24*7");
            } else {
                System.out.println("You have given wrong input.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void bookSlot() {
        try {
            System.out.print("How slot you want to book(max -> 4): ");
            int slot = sc.nextInt();
            if (slot <= 4) {
                for (int i = 0; i < slot; i++) {
                    sc.nextLine();
                    System.out.print("Enter the doctor's name to book the slot: ");
                    String docName = sc.nextLine();
                    System.out.print("Enter the patient's name: ");
                    String patName = sc.nextLine();
                    System.out.print("Enter the patient's age: ");
                    int patAge = sc.nextInt();
                    System.out.println("A slot has been booked for Mr/s., " + patName + ", of age " + patAge + ", of doctor: " + docName);
                    fw.write("A slot has been booked for Mr/s., " + patName + ", of age " + patAge + ", of doctor: " + docName + "\n");
                }
                fw.close();
            } else {
                System.out.println("You can't book more than 4 slot.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }
}

public class Hospital_Management {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            hospital h = new hospital();
            System.out.println("********** Online Hospital **********");
            long max1 = 999;
            long min1 = 100;
            long num1 = min1 + (long) (Math.random() * ((max1 - min1) + 1));
            System.out.println("For Emergency call --> 9" + num1);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            String[] words = name.split("\\s");
            StringBuilder capitalizeStr = new StringBuilder();
            for (String word : words) {
                String firstLetter = word.substring(0, 1);
                String remainingLetters = word.substring(1);
                capitalizeStr.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
            }
            String newName = capitalizeStr.toString();
            System.out.print("Enter your mobile number: ");
            long number = sc.nextLong();
            int max = 99;
            int min = 10;
            int otp1 = min + (int) (Math.random() * ((max - min) + 1));
            int otp2 = min + (int) (Math.random() * ((max - min) + 1));
            int otp3 = min + (int) (Math.random() * ((max - min) + 1));
            String otp = String.valueOf(otp1) + otp2 + otp3;
            System.out.println("OTP has been sent on the mobile number: " + number);
            System.out.println("OTP generated: " + otp);
            System.out.print("Enter the OTP: ");
            String OTP = sc.next();
            System.out.println("Verifying the OTP: " + OTP + " ...................");
            Calendar c = Calendar.getInstance();
            TimeUnit.SECONDS.sleep(1);
            if (OTP.equals(otp)) {
                System.out.println("Logged in --> " + c.getTime() + " as " + newName);
                System.out.println("Enter: 1, for calling an ambulance.");
                System.out.println("Enter: 2, for seeing/booking the available bed/s.");
                System.out.println("Enter: 3, for ordering medicine.");
                System.out.println("Enter: 4, for booking slot of doctor.");
                System.out.print("Enter your option: ");
                int option = sc.nextInt();
                if (option == 1) {
                    h.ambulance();
                } else if (option == 2) {
                    h.bed();
                } else if (option == 3) {
                    h.medicine();
                } else if (option == 4) {
                    h.doctorList();
                } else {
                    System.out.println("You have given a wrong input.");
                }
                System.out.println("Details has been sent on your mobile number: " + number);
                System.out.println("Details has been saved in hospital.txt");
            } else {
                System.out.println("Incorrect OTP");
            }
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        } finally {
            System.out.println("Take care and be safe.");
            System.out.println("\n********** Thank You **********");
        }
    }
}
