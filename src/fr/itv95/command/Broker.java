package fr.itv95.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luc on 17/10/2016.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }

}
