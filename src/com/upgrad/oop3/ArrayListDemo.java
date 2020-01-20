package com.upgrad.oop3;
import java.util.ArrayList;

class DemoOb{
    private int value;
    private String name;

    public DemoOb(int value,String name){
        this.name = name;
        this.value = value;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
    }
}

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList ar = new ArrayList();
        DemoOb ob;

        int a[], b;
        int[] c, d;

        for(int i=0;i < 3;i++) {
            ar.add(i+1);
            ob = new DemoOb(i+1,"Value " + (i+1));
            ar.add(ob);
        }

        for(int i=0;i < ar.size();i++){
            if (ar.get(i) instanceof DemoOb){
                ob = (DemoOb)ar.get(i);
                ob.display();
            }
            else{
                System.out.println(ar.get(i));
            }
        }

        ArrayList<Integer> arlist = new ArrayList<Integer>();
        arlist.add(3);
        arlist.add(4);
        arlist.add(7);
        arlist.add(9);
        arlist.add(10);

        System.out.println("reversed list is:");
        for(Object o:arlist){
            System.out.println(o);
        }

        System.out.println("===arraylist constructor variant====");
        ArrayList<String> tempList = new ArrayList<String>();
        tempList.add("red moon lagoon");
        tempList.add("calistoga");
        tempList.trimToSize();

        ArrayList<String> trackList = new ArrayList<String>(4);
        trackList.add("Sea of trees");
        trackList.addAll(tempList);

        for(String track:trackList){
            System.out.println(track);
        }
    }

    public void reverseList(ArrayList<Integer> arlist){
        int n = arlist.size();
        for(int i=0;i < arlist.size()/2;i++){
            int temp = arlist.get(i);
            arlist.set(i,arlist.get(n-1-i));
            arlist.set(n-i-1,temp);
        }
    }

}
