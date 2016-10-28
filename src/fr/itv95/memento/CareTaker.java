package fr.itv95.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luc on 17/10/2016.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
