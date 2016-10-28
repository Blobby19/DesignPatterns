package fr.itv95.entity;

/**
 * Created by Luc on 17/10/2016.
 */
public class CoarseGrainedObject {

    DependantObject1 do1 = new DependantObject1();
    DependantObject2 do2 = new DependantObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(), do2.getData()};
    }
}
