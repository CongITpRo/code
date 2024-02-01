/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.Contact;
import valli.validation;

public class danhba {

    validation v = new validation();

    public void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter id contact: ");
        int contactId = v.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = v.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = v.checkInputString();
        System.out.print("Enter group: ");
        String group = v.checkInputString();
        System.out.print("Enter address: ");
        String address = v.checkInputString();
        System.out.print("Enter phone: ");
        String phone = v.checkInputPhone();
        lc.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    public void printAllContact(ArrayList<Contact> lc) {
        if (lc.isEmpty() == false) {
            System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                    "First name", "Last name", "Group", "Address", "Phone");
            //print infomation of contact from first to last list contact
            for (Contact contact : lc) {
                System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                        contact.getContactId(), contact.getFullName(),
                        contact.getFirstName(), contact.getLastName(),
                        contact.getGroup(), contact.getAddress(), contact.getPhone());
            }
        } else {
            System.out.println("empty");
        }
    }

    public void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = v.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
