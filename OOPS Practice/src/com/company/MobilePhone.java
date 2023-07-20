package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts=new ArrayList<>();

    public ArrayList<Contact> getContacts(){
        return contacts;
    }
    public void setContacts(ArrayList<Contact> contact1){
        this.contacts=contact1;
    }
    public void printListofContacts(){
        if(contacts.size()==0){
            System.out.println("List of contacts is empty");
        }
        else{
            System.out.println("/*-----List of Contacts-----*/");
            for(int i=0;i<contacts.size();i++){
                System.out.println(contacts.get(i).getName()+": "+contacts.get(i).getNumber());
            }

        }
    }
    public void addContacts(Contact contactsInd){
        contacts.add(contactsInd);
        System.out.println("Contact added");
    }
    public void removeContact(String name){
        int position=findContact(name);
        if(position<0){
            System.out.println("Contact not found");
        }
        contacts.remove(position);
        System.out.println("Contact has been removed");
    }
    public int findContact(String name){
        for(int i=0;i<contacts.size();i++){
            Contact contact=contacts.get(i);
            if(contact.getName().toLowerCase().equals(name.toLowerCase())){
                return  i;
            }
        }
        return -1;
    }
    public void updateContact(String name,Contact newContact){
        int position=findContact(name);
        if(position<0){
            System.out.print("Contact cannot be updated");
        }
        contacts.set(position,newContact);
        System.out.println("Contact has been updated");
    }

}
