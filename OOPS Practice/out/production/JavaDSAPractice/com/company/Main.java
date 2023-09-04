package com.company;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.lang.*;
import java.util.*;


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
    public static void main(String[] args)

    {
        ArrayList<PhoneDirectory> pd=new ArrayList<>();
        pd.add(new PhoneDirectory("Apple","123456789"));
        pd.add(new PhoneDirectory("MikeHussey","6383111441"));
        pd.add(new PhoneDirectory("Xamina","4502821023"));
        pd.add(new PhoneDirectory("Farhan","123456789"));
        pd.add(new PhoneDirectory("Binod","1298647300"));
        pd.add(new PhoneDirectory("Rocky","0031649745"));
        pd.add(new PhoneDirectory("Varman","7960214655"));

        Collections.sort(pd);


        for(PhoneDirectory a1:pd){
            System.out.println("The contact names are "+a1.getContactName()+" and contact number is "+ a1.getContactNumber());
        }


    }
}

