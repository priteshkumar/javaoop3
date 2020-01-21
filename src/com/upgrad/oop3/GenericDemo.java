package com.upgrad.oop3;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;


class DemoListV1<T> extends ArrayList<T>{

    public DemoListV1(int capacity){
        super(capacity);
    }

    @Override
    public boolean add(T t) {
        return super.add(t);
    }

    public void addLast(T t){
        super.add(this.size(),t);
    }

    public T removeLast(){
        return super.remove(this.size() -1);
    }

    public T peekFirst(){
        return super.get(0);
    }

    public T peekLast(){
        return super.get(this.size() -1);
    }

    public void push(T t){
        super.add(0,t);
    }

    public T pop(){
        return super.remove(0);
    }
}


public class GenericDemo {
    public static void main(String[] args){
        DemoListV1<Integer> ilist1 = new DemoListV1<Integer>(10);
        ilist1.add(10);
        ilist1.add(20);
        ilist1.add(30);
        iterateList(ilist1);

        DemoListV1<Double> ilist2 = new DemoListV1<Double>(10);
        ilist2.add(10.0);
        ilist2.add(23.4);
        ilist2.add(34.4);
        iterateList(ilist2);

        DemoListV1<String> ilist3 = new DemoListV1<String>(3);
        ilist3.add("caspian");
        ilist3.add("mokhov");
        //iterateList(ilist3);
    }

    public static void iterateList(ArrayList<? extends Number> list){
        ListIterator iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
