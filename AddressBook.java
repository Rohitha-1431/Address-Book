package com.bridgelabz.addressbook;
import java.util.ArrayList;
public class AddressBook {
	static ArrayList<ContactInfo> user = new ArrayList<ContactInfo>();
    static int flag = 0;

    public static void addContact() {
        ContactInfo a1 = new ContactInfo();
        a1.getInput();
        user.add(a1);
        System.out.println(user);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Programme");
        //UC1
        AddressBook.addContact();

    }
}