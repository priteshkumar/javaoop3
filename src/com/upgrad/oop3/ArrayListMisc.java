package com.upgrad.oop3;
import java.util.ArrayList;
import java.util.*;

public class ArrayListMisc {
    public static void main(String[] args){

        //use Arrays.asList method for ArrayList initialisation
        ArrayList<String> artistList = new ArrayList<String>(Arrays.asList("caspian",
                "gary clark jr","armin van burren","mogwai","mos def","linkin park"));

        //iterate artistList using iterator
        System.out.println("=====printing in forward======");
      //  iterateList(artistList);
        printAltn(artistList);

        System.out.println("=====printing in reverse=====");
        iterateReverse(artistList);

        //loopList(artistList);
        //replace/set specific element
        String res = replace(artistList,"gary clark jr","mogwai");

        //reiterate arraylist
        System.out.println("=====reiterate list====");
        iterateList(artistList);

    }

    public static void loopList(ArrayList<String> list){
        for(String artist:list) {
            System.out.println(artist);
        }
    }

    public static void iterateList(ArrayList<String> list){
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static void iterateReverse(ArrayList<String> list){
        ListIterator iter = list.listIterator(list.size());
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
    }

    public static void printAltn(ArrayList<String> list){
        ListIterator iter = list.listIterator();
        int index;
        while(iter.hasNext()){
            index = iter.nextIndex();
            if (index % 2 != 0){
                System.out.println(iter.next());
            }
            else{
                iter.next();
            }
        }
    }

    public static String replace(ArrayList<String> list,String val1,String val2){
        String res = list.set(list.indexOf(val1),val2);
        return res;
    }
}
