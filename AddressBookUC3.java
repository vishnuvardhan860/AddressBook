package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC3 {
    static Scanner sc = new Scanner(System.in);
    static AddinBook book1 = new AddinBook();
    static ArrayList<AddinBook> man1 = new ArrayList<AddinBook>();

    /*
            here we are creation a method  for add contactmethod
    */
    public static void addContact() {
        System.out.println("Enter first name");
        String FN = book1.sc.nextLine();
        book1.setFirstName(FN);

        System.out.println("Enter last Name:");
        String LS = book1.sc.nextLine();
        book1.setLastName(LS);

        System.out.println("Enter Mail ID:-");
        String MI =book1.sc.nextLine();
        book1.setEmail(MI);
        System.out.print("Enter Cell Num : ");
        String cell = book1.sc.nextLine();
        book1.setCellNum(cell);

        System.out.print("Enter City : ");
        String city = book1.sc.nextLine();
        book1.setCity(city);

        System.out.print("Enter Zip : ");
        String zIp = book1.sc.nextLine();
        book1.setZip(zIp);

        System.out.print("Enter Sate : ");
        String state = book1.sc.nextLine();
        book1.setState(state);

        man1.add(book1);
    }
    //now we are Editing the Contact
    public static void editContact(){
        System.out.println("WELCOME TO EDIT ADDRESS BOOK PROGRAM");
        System.out.println("ENTER NAME FOR CONFIRMATION:");
        String name =sc.nextLine();
        for(int i=0;i<man1.size();i++){
            if(man1.get(i).getFirstName().equalsIgnoreCase(name)){
                man1.remove(i);
                addContact();
                System.out.println("successfully Edit Data");
            }else {
                System.out.println("no data found in A-book");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("***** WELCOME TO ADDRSEES BOOK ***");
        System.out.println("1. Added a new contact");
        addContact();
        editContact();
        // now  we are printing method call from addin book
        System.out.println(book1.printString());

    }

}