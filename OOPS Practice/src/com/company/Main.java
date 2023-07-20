package com.company;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class shoppingCart{
    private int a[];
    public ArrayList<String> shoppingCart1=new ArrayList<>();
    shoppingCart(int size){
        a=new int[size];
    }
    public int getSize(){
        return shoppingCart1.size();
    }
    public void addItem(String item){
        shoppingCart1.add(item);
    }
    public void printList(){
        for(int i=0;i<shoppingCart1.size();i++)
        {
            System.out.println(shoppingCart1.get(i));
        }
    }
    public void modifyItem(int position,String name){
        shoppingCart1.set(position,name);
    }
    public void deleteItem(int position){
        shoppingCart1.remove(position);
    }
    public String searchItem(String SearchItem){
        int position=shoppingCart1.indexOf(SearchItem);
        if(position>=0)
        {
            return shoppingCart1.get(position);
        }
        else {
            return null;
        }
    }
}

class Dateitem{
    String date;
    Dateitem(String Date){
        this.date=Date;
    }
}
class sortItems implements Comparator<Dateitem>{
    public int compare(Dateitem a,Dateitem b){
        return a.date.compareTo(b.date);
    }
}



public class Main {
    public static void main(String[] arg) {

     printMenu();

        boolean quit = false;
        while(!quit) {
            System.out.println("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    printListOfContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    quit();
                    break;
                default:
                    System.out.println("Invalid option");
                    printMenu();
            }
        }


    }
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    private static void quit(){
        System.out.println("/*******QUIT**************");
    }
    private static void printMenu(){
        System.out.println("Print:");
        System.out.println("\t 1- Print list of contacts");
        System.out.println("\t 2- Add new contact");
        System.out.println("\t 3- Update existing contact");
        System.out.println("\t 4- Remove contact");
        System.out.println("\t 5- Search / find contact");
        System.out.println("\t 6- Quit");
    }
    private static void printListOfContacts(){
        mobilePhone.printListofContacts();

    }
    private static void addContact(){
        System.out.println("Enter your name");
        String s1= scanner.nextLine();
        System.out.println("Enter your phone number");
        int n1=scanner.nextInt();

        scanner.nextLine();

        mobilePhone.addContacts(new Contact(s1,n1));

    }
    private static void updateContact(){

        System.out.println("Enter contact you want to update");
        String name=scanner.nextLine();

        System.out.println("Enter contact new name");
        String newName=scanner.nextLine();
        System.out.println("Enter contact new number");
        int newPhoneNumber=scanner.nextInt();
        scanner.nextLine();

        Contact newContact=new Contact(newName,newPhoneNumber);
        mobilePhone.updateContact(name,newContact);


    }
    private static void removeContact(){

        System.out.println("Enter contact you want to remove: ");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);

    }
    private static void searchContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        int contactPosition = mobilePhone.findContact(name);
        if(contactPosition < 0) {
            System.out.println("Contact not found");
        }
        System.out.println(name + ": " + mobilePhone.getContacts().get(contactPosition).getNumber());


    }

}