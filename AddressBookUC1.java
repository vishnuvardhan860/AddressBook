package com.addressbook;

public class AddressBookUC1 {
    public static void main(String[] args) {
        AddinBook b = new AddinBook();
        //Creating welcome AddressBook
        System.out.println("Welcome to Address Book Program");
        
        //Adding Data like name, city, zipcode, and state. 

        b.setFirstName("Kammari");
        b.setLastName("Vishnu");
        b.setCellNum("90144XXX14");
        b.setEmail("vishnu786@gmail.com");
        b.setCity("Alur");
        b.setZip("701485");
        b.setState("Ratanala Seema");

        System.out.println(" First Name: " + b.getFirstName()                 +
                                    "\n Last Name: " + b.getLastName()        +
                                        "\n Cell Num: " + b.getCellNum()      +
                                           "\n Email-id: " + b.getEmail()     +
                                              "\n City: " + b.getCity()       +
                                                  " \n Pin: " + b.getZip()    +
                                                      "\n State: " + b.getState());

    }
}