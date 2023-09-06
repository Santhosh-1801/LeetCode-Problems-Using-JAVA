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
        ArrayList<Movie> pd=new ArrayList<>();
        pd.add(new Movie(8.8,"Godzilla",2011));
        pd.add(new Movie(8.4,"Spiderman",2002));
        pd.add(new Movie(6.0,"Inception",2001));
        pd.add(new Movie(8.1,"Da Vinci Code",2023));
        pd.add(new Movie(5.2,"Martians",2022));
        pd.add(new Movie(9.7,"Cobra",2014));
        pd.add(new Movie(2.0,"Infernus",2018));
        pd.add(new Movie(1.3,"Magnimous",1992));
        System.out.println("Sorting out based on rating");
        RatingCompare rc=new RatingCompare();
        Collections.sort(pd,rc);
        for(Movie m:pd){
            System.out.println(m.getRating()+" "+m.getYear()+" "+m.getName());
        }
        System.out.println("**************************");
        NameCompare nc=new NameCompare();
        Collections.sort(pd,nc);

        for(Movie m:pd){
            System.out.println(m.getRating()+" "+m.getYear()+" "+m.getName());
        }
        System.out.println("**************************");
        YearCompare yc=new YearCompare();
        Collections.sort(pd,yc);

        for(Movie m:pd){
            System.out.println(m.getRating()+" "+m.getYear()+" "+m.getName());
        }
        System.out.println("**************************");

        Map<String,String> prepinsta=new HashMap<>();
        prepinsta.put("Atulya","Cofounder");
        prepinsta.put("Vaibhav","Founder");
        prepinsta.put("Ashlety","Managing Director");
        prepinsta.put("Shivam Dubey","CP");
        System.out.println(prepinsta.keySet());
        for(String s:prepinsta.keySet()){
            System.out.println("The key is "+s+" and value is "+prepinsta.get(s));
        }
        Set<String> value=new HashSet<>();
        value.add("I am");
        value.add("studying");
        value.add("data science");
        value.add("in this era");
        System.out.println(value);
        value.add("I am");
        System.out.println(value);


        Set<Integer> value1= new HashSet<>();
        value1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(value1);
        Set<Integer> value2= new HashSet<>();
        value2.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));
        Set<Integer> intersectionSet=new HashSet<>();
        Set<Integer> intersection=new HashSet<>(value1);
        intersection.retainAll(value2);
        System.out.println(intersection);



        Studentdetails s1=new Studentdetails("Santhosh","1");
        Studentdetails s2=new Studentdetails("Arjun","2");
        Studentdetails s3=new Studentdetails("Santhosh","1");
        Studentdetails s4=s1;
        System.out.println(s4);
        System.out.println(s1);
        System.out.println(s3);




    }
}

