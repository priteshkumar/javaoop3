package com.upgrad.oop3;
import java.util.LinkedList;

class PizzaOrder{
    private int orderNum;
    private String decsription;

    public PizzaOrder(int orderNum,String description){
        this.orderNum = orderNum;
        this.decsription = description;
    }

    public void display(){
        System.out.println("order " + this.orderNum + "\n" + this.decsription);
    }
}


public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<PizzaOrder> list = new LinkedList<PizzaOrder>();
        PizzaOrder p1 = new PizzaOrder(1, "cheese");
        list.add(p1);

        PizzaOrder p2 = new PizzaOrder(2, "barbecue chicken");
        list.add(p2);

        PizzaOrder p3 = new PizzaOrder(3, "vegetable");
        list.add(p3);

        PizzaOrder p4 = new PizzaOrder(4, "mushroom");
        list.add(p4);

        PizzaOrder p = list.get(1);
        p.display();

        list.add(2,new PizzaOrder(5,"buffalo chicken"));
        System.out.println("Orderlist has mushroom pizza order? " + list.contains(p4));

        list.remove(3);
        list.addFirst(new PizzaOrder(6,"cheese"));
        printOrders(list);

        System.out.println("===========pop first order");
        list.pop();
        printOrders(list);

        System.out.println("==========push order to first");
        list.push(new PizzaOrder(7,"vegetable"));
        list.push(new PizzaOrder(8,"cheese garlic"));
        printOrders(list);

        System.out.println("========pop first order");
        list.pop();
        printOrders(list);
    }

    public static void printOrders(LinkedList<PizzaOrder> plist){
        for(PizzaOrder p: plist){
            p.display();
        }
    }
}
