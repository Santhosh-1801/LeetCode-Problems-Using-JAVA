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
    public static void main(String[] arg) {

    }
    public static void AddElement(LinkedList<String>b,String word){
        b.add(word);
    }

    }

