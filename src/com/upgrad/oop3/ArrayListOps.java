package com.upgrad.oop3;
import java.util.ArrayList;

class ObjectList {
    private ArrayList<Integer> list;

    public ObjectList(){
        list = new ArrayList<Integer>();
    }

    public void add(int value){
        list.add (value);
    }

    public void add(int index,int value){
        list.add(index,value);
    }

    public int search(int value){
        int index = list.indexOf(value);
        return index;
    }

    public boolean contains(int value){
        return list.contains(value);
    }

    public int remove(int index){

        int val = list.remove(index);
        return val;
    }

    public ArrayList<Integer> getList(){
        return this.list;
    }

}


public class ArrayListOps {

    public static void main(String[] args){
        ObjectList list = new ObjectList();
        //list add ops at end
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);

        //list add ops at specific index
        list.add(0,10);
        list.add(3,33);

        ArrayList<Integer> olist = list.getList();
        for(Object o:olist){
            System.out.print(o + " ");
        }

        System.out.println();

        //list remove ops at index
        list.remove(2);
        list.remove(1);

        for(Object o:olist){
            System.out.print(o + " ");
        }
        System.out.println();

        //list search ops
        System.out.println("index of 33 is: " + list.search(33));

        //list contains element op
        System.out.println("does list has 33 value? " + list.contains(33));
        System.out.println("does list has 39 value? " + list.contains(39));
    }
}
