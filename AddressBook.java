package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
	static ArrayList<ContactInfo> user = new ArrayList<ContactInfo>();
    static int flag = 0;

    public static void addContact() {
        ContactInfo a1 = new ContactInfo();
        a1.getInput();
        user.add(a1);
        System.out.println(user);
    }
    public static void chooseOption() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one option from below \n 1:add contact \n 2:edit contact \n 3:delete contact");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                AddressBook.addContact();
                System.out.println("If you want to continue then press 1 or press 2 if you want to quit");
                int num = scan.nextInt();
                if (num == 1) {
                    chooseOption();
                } else {
                    break;
                }
                break;
//            case 2:
//                editContact();
//                break;
//            case 3:
//                deleteContact();
//                break;
            default:
                System.out.println("You choose Wrong Option please choose right option");
                //Main.chooseOption();
                break;
        }

    }

    public static void main(String[] args) {
        //UC1
        AddressBook.addContact();
        //UC2
        AddressBook.chooseOption();
    }
}