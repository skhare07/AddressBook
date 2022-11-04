package com.bridgelabz.addressbookprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC2 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> person = new ArrayList<>();

    public void AddPerson() {
        System.out.println("Enter the First Name");
        String fName = scanner.next();
        System.out.println("Enter the Last Name");
        String lName = scanner.next();
        System.out.println("Enter the Address");
        String address = scanner.next();
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("Enter the State");
        String state = scanner.next();
        System.out.println("Enter the Zip");
        String zip = scanner.next();
        System.out.println("Enter the PhoneNumber");
        String phoneNumber = scanner.next();
        System.out.println("Enter the Email");
        String email = scanner.next();
//creating contacts object and passing arguments inside constructor
        Contacts p = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);
//adding p object into the linked list with Contact class data type
        person.add(p);


//printing person array list
        System.out.println("Person Added");
        System.out.println(person);


    }// end of add person method

public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookUC2 obj = new AddressBookUC2();
        obj.AddPerson();

    }// end of main
}



